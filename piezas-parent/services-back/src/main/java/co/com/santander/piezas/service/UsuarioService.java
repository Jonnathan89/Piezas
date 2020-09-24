package co.com.santander.piezas.service;

import java.util.List;

import co.com.santander.springsecurity.Dto.UsuarioTokenDto;

public interface UsuarioService {
	
	public List<UsuarioTokenDto> lstUserDtos(String typeUser);
	
}
