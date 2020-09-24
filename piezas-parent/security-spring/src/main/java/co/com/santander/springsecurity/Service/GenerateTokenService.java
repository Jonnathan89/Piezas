package co.com.santander.springsecurity.Service;

import java.util.List;

import co.com.santander.springsecurity.Dto.TokenDto;
import co.com.santander.springsecurity.Dto.UsuarioTokenDto;


public interface GenerateTokenService {
	
	public String getJWTToken(String username);	
	public TokenDto generateToken (UsuarioTokenDto usuarioDto , List<UsuarioTokenDto>  lstUsers) ;
	
	

}
