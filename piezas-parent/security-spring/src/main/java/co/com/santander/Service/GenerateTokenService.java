package co.com.santander.Service;

import java.util.List;

import co.com.santander.Dto.TokenDto;
import co.com.santander.commons.piezas.dto.UsuarioDto;


public interface GenerateTokenService {
	
	public String getJWTToken(String username);	
	public TokenDto generateToken (UsuarioDto usuarioDto , List<UsuarioDto>  lstUsers) ;
	
	

}
