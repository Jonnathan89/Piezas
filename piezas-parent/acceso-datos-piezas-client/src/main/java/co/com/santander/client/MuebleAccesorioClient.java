package co.com.santander.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import co.com.santander.commons.Utils.Constants;
import co.com.santander.commons.piezas.dto.MuebleAccesorioDTO;

@FeignClient(value = "muebleAccesorio-services", url = "http://localhost:8080")
public interface MuebleAccesorioClient {

	@GetMapping(value = Constants.EndPoints.ENDPOINT_FIND_ALL_MUEBLES_ACCESORIOS, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<MuebleAccesorioDTO> getMuebleAccesoriosAll() ;
	
	@PostMapping(value = Constants.EndPoints.ENDPOINT_CREATE_MUEBLES_ACCESORIOS , produces = MediaType.APPLICATION_JSON_VALUE)
	public MuebleAccesorioDTO createMuebleAccesorio(@RequestBody MuebleAccesorioDTO muebleAccesorioDTO);
	
	
}
