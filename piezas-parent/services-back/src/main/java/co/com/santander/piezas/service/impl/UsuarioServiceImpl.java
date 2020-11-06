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
import co.com.santanderconsumer.trasnversal.exceptions.SantanderException;
import co.com.santanderconsumer.trasnversal.messages.MessagesEnum;
import co.com.santanderconsumer.trasnversal.messages.SantanderMessages;

/**
 * @author j.ladinoh
 *
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioClient usuarioClient ;

	@Autowired
	SantanderMessages santanderMessages ;
	

	@Override
	public List<UsuarioTokenDto> lstUserDtos(String typeUser) {
		try {
			return usuarioClient.getUsuarioDtos(typeUser);
		} catch (Exception e) {
			e.printStackTrace();
			String message = String.format(santanderMessages.getMessageByKey(MessagesEnum.ERROR004),
					MessagesEnum.USUARIO.toString());
			throw new SantanderException(e);			
		}
		
	}

	
	
	
	
}
