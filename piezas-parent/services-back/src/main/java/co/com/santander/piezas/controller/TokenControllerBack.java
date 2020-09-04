package co.com.santander.piezas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.santander.Dto.TokenDto;
import co.com.santander.Service.GenerateTokenService;
import co.com.santander.commons.Utils.Constants;
import co.com.santander.commons.Utils.LoggerMessages;
import co.com.santander.commons.piezas.dto.UsuarioDto;
import co.com.santander.piezas.service.UsuarioService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("token-service-back")
public class TokenControllerBack {

	@Autowired
	UsuarioService usuarioService;

	@Autowired
	GenerateTokenService generateTokenService;

	@ResponseBody
	@PostMapping(value = Constants.EndPoints.ENDPOINT_GENERATE_TOKEN, produces = MediaType.APPLICATION_JSON_VALUE)
	public TokenDto findByUsernamePass(@RequestParam("username") String username , @RequestParam("password") String password) {
	//	LoggerMessages.generateInitialLogSimple(Constants.SERVICE_BACK.toString(), Constants.ENDPOINT_GENERATE_TOKEN.getValueString());
		UsuarioDto usuarioDto = new UsuarioDto(username, password);
		List<UsuarioDto> lstUserType = usuarioService.lstUserDtos(Constants.EndPoints.USERTYPE_TOKEN);
		TokenDto tokenDto = generateTokenService.generateToken(usuarioDto, lstUserType);
		return tokenDto;

	}

}
