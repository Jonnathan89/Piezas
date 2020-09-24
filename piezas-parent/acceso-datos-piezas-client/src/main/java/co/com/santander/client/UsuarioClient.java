/**
 * 
 */
package co.com.santander.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.com.santander.commons.Utils.Constants;
import co.com.santander.springsecurity.Dto.UsuarioTokenDto;

/**
 * @author l.ruizs
 *
 *
 *must be config spring-security.data-access.url on application(yml or properties)
 */

@FeignClient(value = "${acceso-datos-piezas.token-name}", url = "${acceso-datos-piezas.url}")
public interface UsuarioClient {
	
	@GetMapping(value = Constants.EndPoints.ENDPOINT_USER_TYPE_FEIGN, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UsuarioTokenDto> getUsuarioDtos (@RequestParam("typeuser")  String typeuser);

}
