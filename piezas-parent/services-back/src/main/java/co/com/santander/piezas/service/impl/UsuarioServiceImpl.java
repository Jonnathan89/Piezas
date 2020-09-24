/**
 * 
 */
package co.com.santander.piezas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.santander.client.UsuarioClient;
import co.com.santander.piezas.service.UsuarioService;
import co.com.santander.springsecurity.Dto.UsuarioTokenDto;

/**
 * @author j.ladinoh
 *
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioClient usuarioClient ;

	

	@Override
	public List<UsuarioTokenDto> lstUserDtos(String typeUser) {
		// TODO Auto-generated method stub
		return usuarioClient.getUsuarioDtos(typeUser);
	}

	
	
	
	
}
