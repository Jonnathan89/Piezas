/**
 * 
 */
package co.com.santander.springsecurity.ServiceImple;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Service;

import co.com.santander.springsecurity.Dto.TokenDto;
import co.com.santander.springsecurity.Dto.UsuarioTokenDto;
import co.com.santander.springsecurity.Service.GenerateTokenService;
import co.com.santanderconsumer.trasnversal.exceptions.SantanderException;
import co.com.santanderconsumer.trasnversal.messages.MessagesEnum;
import co.com.santanderconsumer.trasnversal.messages.SantanderMessages;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 * @author j.ladinoh
 *
 */
@Service
public class GenerateTokenServiceImpl implements GenerateTokenService {

	@Autowired
	SantanderMessages santanderMessages;

	@Override
	public String getJWTToken(String username) {
		String secretKey = "M&A:SANTANDER";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
				.commaSeparatedStringToAuthorityList("ROLE_uma_authorization");

		String token = Jwts.builder().setId("SANTANDERJWT").setSubject(username)
				.claim("authorities",
						grantedAuthorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS512, secretKey.getBytes()).compact();

		return "Bearer " + token;
	}

	@Override
	public TokenDto generateToken(UsuarioTokenDto usuarioDto, List<UsuarioTokenDto> lstUsers) {
		try {
			if (lstUsers.stream().anyMatch(p -> p.getUserName().equals(usuarioDto.getUserName())
					&& p.getPassword().equals(usuarioDto.getPassword()))) {
				String token = getJWTToken(usuarioDto.getUserName());
				TokenDto tokenSecurity = new TokenDto();
				tokenSecurity.setUser(usuarioDto.getUserName());
				tokenSecurity.setToken(token);
				return tokenSecurity;
			}

		} catch (Exception e) {
			String message = String.format(santanderMessages.getMessageByKey(MessagesEnum.ERROR004),
					MessagesEnum.USUARIO.toString());
			throw new SantanderException(e);
		}
		return null;
	}

}
