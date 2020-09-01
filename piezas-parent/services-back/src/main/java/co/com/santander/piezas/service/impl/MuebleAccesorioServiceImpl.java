package co.com.santander.piezas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.santander.commons.piezas.dto.MuebleAccesorioDTO;
import co.com.santander.piezas.service.MuebleAccesorioService;
import co.com.santander.serviciosexternos.client.MuebleAccesorioClient;


@Service
public class MuebleAccesorioServiceImpl implements MuebleAccesorioService {

	@Autowired
	MuebleAccesorioClient muebleAccesorioClient ;
	
	@Override
	public List<MuebleAccesorioDTO> getMuebleAccesoriosAll() {
		// TODO Auto-generated method stub
		return muebleAccesorioClient.getMuebleAccesoriosAll();
	}

	@Override
	public MuebleAccesorioDTO createMuebleAccesorio(MuebleAccesorioDTO muebleAccesorioDTO) {
		// TODO Auto-generated method stub
		return muebleAccesorioClient.createMuebleAccesorio(muebleAccesorioDTO);
	}

	
	
	
}
