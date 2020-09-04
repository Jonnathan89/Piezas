package co.com.santander.piezas.service;

import java.util.List;

import co.com.santander.commons.piezas.dto.UsuarioDto;

public interface UsuarioService {

	
	public List<UsuarioDto> lstUserDtos(String typeUser);
	
}
