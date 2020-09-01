/**
 * 
 */
package co.com.santander.piezas.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.santander.commons.Utils.Constants;
import co.com.santander.commons.Utils.LoggerMessages;
import co.com.santander.commons.piezas.dto.MuebleAccesorioDTO;
import co.com.santander.piezas.service.MuebleAccesorioService;

/**
 * @author j.ladinoh
 *
 */
@RestController
@CrossOrigin(origins = "*")
public class MuebleAccesorioController {

	
	private MuebleAccesorioService muebleAccesorioService ;
	
	
	@ResponseBody
	@GetMapping(value = Constants.EndPoints.ENDPOINT_FIND_ALL_MUEBLES_ACCESORIOS, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<MuebleAccesorioDTO> getMuebleAccesoriosAll() {
		//LoggerMessages.generateInitialLogSimple(Constants.ACCESO_DATOS_PIEZAS.toString(),Constants.EndPoints.ENDPOINT_FIND_ALL_MUEBLES_ACCESORIOS );
		try {
			System.out.print("sdafsadf");
			List<MuebleAccesorioDTO> lstMuebleAcc = muebleAccesorioService.getMuebleAccesoriosAll();
			return lstMuebleAcc.isEmpty() ?  new ArrayList<MuebleAccesorioDTO>() : lstMuebleAcc;			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@ResponseBody
	@PostMapping(value = Constants.EndPoints.ENDPOINT_CREATE_MUEBLES_ACCESORIOS , produces = MediaType.APPLICATION_JSON_VALUE)
	public MuebleAccesorioDTO createMuebleAccesorio(@RequestBody MuebleAccesorioDTO muebleAccesorioDTO ){
		LoggerMessages.generateInitialLogSimple("", "");
		MuebleAccesorioDTO muebleAccesorio = muebleAccesorioService.createMuebleAccesorio(muebleAccesorioDTO);	
		return Objects.isNull(muebleAccesorio) ? new MuebleAccesorioDTO() : muebleAccesorio;
	}
	
}
