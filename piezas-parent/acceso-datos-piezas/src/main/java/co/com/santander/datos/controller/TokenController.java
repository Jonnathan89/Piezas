/**
 * 
 */
package co.com.santander.datos.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.santander.commons.Utils.Constants;
import co.com.santander.commons.piezas.dto.UsuarioDto;
import co.com.santander.datos.entity.Usuario;
import co.com.santander.datos.mapper.UsuarioMapper;
import co.com.santander.datos.repository.UsuarioRepository;

/**
 * @author j.ladinoh
 *
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("token-services")
public class TokenController {

	
	@Autowired
	UsuarioMapper usuarioMapper ;
	
	@Autowired
	UsuarioRepository repository ;
	
	
	@ResponseBody
	@GetMapping(value = Constants.EndPoints.ENDPOINT_USER_TYPE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UsuarioDto> getUsuarioDtos (@RequestParam("typeuser")  String typeuser) {	    
		//LoggerMessages.generateInitialLogSimple(Constants.ACCESO_DATOS_PIEZAS.toString(), Constants.ENDPOINT_USER_TYPE.getValueString());
		List<Usuario> lstUsuario = repository.lstUsuario(typeuser);		
		return Objects.isNull(lstUsuario) ? new ArrayList<>() : usuarioMapper.listUsuarioEntitiesToDTOs(lstUsuario) ;	
				
	}
	
	
	
	
	
	
}
