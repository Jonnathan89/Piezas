package co.com.santander.datos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import co.com.santander.commons.Utils.Constants;
import co.com.santander.commons.piezas.dto.MuebleAccesorioDTO;
import co.com.santander.datos.entity.MuebleAccesorio;
import co.com.santander.datos.mapper.MuebleAccesorioMapper;
import co.com.santander.datos.repository.MuebleAccesorioRepository;

@RestController
@RequestMapping("muebleAccesorio-services")
public class MuebleAccesorioController {

	@Autowired
	MuebleAccesorioRepository muebleAccesorioRepository;

	@Autowired
	MuebleAccesorioMapper muebleAccesorioMapper;



	@ResponseBody
	@GetMapping(value = Constants.EndPoints.ENDPOINT_FIND_ALL_MUEBLES_ACCESORIOS, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<MuebleAccesorioDTO> getMuebleAccesoriosAll() {
		// LoggerMessages.generateInitialLogSimple("", "");		
		List<MuebleAccesorio> lstMuebleAcc = muebleAccesorioRepository.findAll();
		return lstMuebleAcc.isEmpty() ? new ArrayList<MuebleAccesorioDTO>()
				: muebleAccesorioMapper.listMuebleAccerosioEntitiesToDTOs(lstMuebleAcc);

	}

	@ResponseBody
	@PostMapping(value = Constants.EndPoints.ENDPOINT_CREATE_MUEBLES_ACCESORIOS, produces = MediaType.APPLICATION_JSON_VALUE)
	public MuebleAccesorioDTO createMuebleAccesorio(@RequestBody MuebleAccesorioDTO muebleAccesorioDTO) {
		// LoggerMessages.generateInitialLogSimple("", "");
		MuebleAccesorio muebleAccesorio = muebleAccesorioRepository
				.saveAndFlush(muebleAccesorioMapper.muebleAccesorioDTOToEntity(muebleAccesorioDTO));
		return Objects.isNull(muebleAccesorio) ? new MuebleAccesorioDTO()
				: muebleAccesorioMapper.muebleAccesorioEntityToDTO(muebleAccesorio);

	}

}
