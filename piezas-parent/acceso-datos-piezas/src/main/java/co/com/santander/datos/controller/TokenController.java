/**
 * 
 */
package co.com.santander.datos.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.santander.commons.Utils.Constants;
import co.com.santander.commons.Utils.LoggerMessages;
import co.com.santander.commons.piezas.dto.UsuarioDto;
import co.com.santander.datos.entity.Usuario;
import co.com.santander.datos.mapper.UsuarioMapper;
import co.com.santander.datos.repository.UsuarioRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class TokenController.
 *
 * @author j.ladinoh
 */
@RestController
@RequestMapping("token-services")
public class TokenController {

	
	/** The usuario mapper. */
	@Autowired
	UsuarioMapper usuarioMapper ;
	
	/** The repository. */
	@Autowired
	UsuarioRepository repository ;
	
	
	/**
	 * Gets the usuario dtos.
	 *
	 * @param typeuser the typeuser
	 * @return the usuario dtos
	 */
	@ResponseBody
	@PostMapping(value = Constants.EndPoints.ENDPOINT_USER_TYPE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UsuarioDto> getUsuarioDtos (@RequestParam("typeuser")  String typeuser) {	    
		//LoggerMessages.generateInitialLogSimple(Constants.ACCESO_DATOS_PIEZAS.toString(), Constants.ENDPOINT_USER_TYPE.getValueString());
		List<Usuario> lstUsuario = repository.lstUsuario(typeuser);		
		return Objects.isNull(lstUsuario) ? new ArrayList<>() : usuarioMapper.listUsuarioEntitiesToDTOs(lstUsuario) ;	
				
	}
	
	
	
	
	
	
}
