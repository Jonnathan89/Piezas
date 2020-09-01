package co.com.santander.piezas.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import co.com.santander.commons.piezas.dto.MuebleAccesorioDTO;

public interface MuebleAccesorioService {
	
	public List<MuebleAccesorioDTO> getMuebleAccesoriosAll() ;

	public MuebleAccesorioDTO createMuebleAccesorio(MuebleAccesorioDTO muebleAccesorioDTO );
}
