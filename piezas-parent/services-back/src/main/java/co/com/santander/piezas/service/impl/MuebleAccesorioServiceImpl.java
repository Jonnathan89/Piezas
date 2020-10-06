package co.com.santander.piezas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.santander.client.MuebleAccesorioClient;
import co.com.santander.commons.piezas.dto.MuebleAccesorioDTO;
import co.com.santander.piezas.service.MuebleAccesorioService;
import co.com.santanderconsumer.trasnversal.exceptions.SantanderException;
import co.com.santanderconsumer.trasnversal.messages.MessagesEnum;
import co.com.santanderconsumer.trasnversal.messages.SantanderMessages;

@Service
public class MuebleAccesorioServiceImpl implements MuebleAccesorioService {

	@Autowired
	MuebleAccesorioClient muebleAccesorioClient;

	@Autowired
	SantanderMessages santanderMessages;

	@Override
	public List<MuebleAccesorioDTO> getMuebleAccesoriosAll() { // TODO Auto-generated method stub
		List<MuebleAccesorioDTO> lstMuebleAccesorioDTOs;
		try {
			lstMuebleAccesorioDTOs = muebleAccesorioClient.getMuebleAccesoriosAll();
			return lstMuebleAccesorioDTOs;
		} catch (Exception e) {
			String message = String.format(santanderMessages.getMessageByKey(MessagesEnum.ERROR005),
					MessagesEnum.MUEBLESACCESORIOS.toString());
			throw new SantanderException(e);
		}
	}

	@Override
	public MuebleAccesorioDTO createMuebleAccesorio(MuebleAccesorioDTO muebleAccesorioDTO) {
		try {
			MuebleAccesorioDTO muebleAccesorio2DTO ;
			muebleAccesorio2DTO = muebleAccesorioClient.createMuebleAccesorio(muebleAccesorioDTO);
			return muebleAccesorio2DTO ;

		} catch (Exception e) {
			e.printStackTrace();
			String message = String.format(santanderMessages.getMessageByKey(MessagesEnum.ERROR006),
					MessagesEnum.MUEBLESACCESORIOS.toString());
			throw new SantanderException(e);
		}

	}

}
