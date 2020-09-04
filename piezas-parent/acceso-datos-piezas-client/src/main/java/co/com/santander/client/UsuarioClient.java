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
import co.com.santander.commons.piezas.dto.UsuarioDto;

/**
 * @author j.ladinoh
 *
 */

@FeignClient(value = "token-services", url = "http://localhost:8080")
public interface UsuarioClient {

	
	@GetMapping(value = Constants.EndPoints.ENDPOINT_USER_TYPE_FEIGN, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UsuarioDto> getUsuarioDtos (@RequestParam("typeuser")  String typeuser);

}
