/**
 * 
 */
package co.com.santander.springsecurity.ServiceImple;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Service;

import co.com.santander.springsecurity.Dto.TokenDto;
import co.com.santander.springsecurity.Dto.UsuarioTokenDto;
import co.com.santander.springsecurity.Service.GenerateTokenService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 * @author j.ladinoh
 *
 */
@Service
public class GenerateTokenServiceImpl implements GenerateTokenService {
	
	@Override
	public String getJWTToken(String username) {
		String secretKey = "M&A:SANTANDER";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
				.commaSeparatedStringToAuthorityList("ROLE_uma_authorization");
		
		String token = Jwts
				.builder()
				.setId("SANTANDERJWT")
				.setSubject(username)
				.claim("authorities",
						grantedAuthorities.stream()
								.map(GrantedAuthority::getAuthority)
								.collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS512,
						secretKey.getBytes()).compact();

		return "Bearer " + token;
	}

	@Override
	public TokenDto generateToken (UsuarioTokenDto usuarioDto , List<UsuarioTokenDto>  lstUsers) {
		if (lstUsers.stream().anyMatch(p -> p.getUserName().equals(usuarioDto.getUserName()) && p.getPassword().equals(usuarioDto.getPassword()))) {
			String token = getJWTToken(usuarioDto.getUserName());
			TokenDto tokenSecurity = new TokenDto();
			tokenSecurity.setUser(usuarioDto.getUserName());
			tokenSecurity.setToken(token);
			return tokenSecurity ;
		}				
		return null;		
	}
	
	

}
