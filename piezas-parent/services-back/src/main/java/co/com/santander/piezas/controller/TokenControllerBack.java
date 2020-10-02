package co.com.santander.piezas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.santander.commons.Utils.Constants;
import co.com.santander.piezas.service.UsuarioService;
import co.com.santander.springsecurity.Dto.TokenDto;
import co.com.santander.springsecurity.Dto.UsuarioTokenDto;
import co.com.santander.springsecurity.Service.GenerateTokenService;

@RestController
@RequestMapping("token-service-back")
public class TokenControllerBack {
	@Autowired
	UsuarioService usuarioService;

	@Autowired
	GenerateTokenService generateTokenService;

	@ResponseBody
	@PostMapping(value = Constants.EndPoints.ENDPOINT_GENERATE_TOKEN, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public TokenDto findByUsernamePass(@RequestParam("username") String username,
			@RequestParam("password") String password) throws Exception {
		System.out.println("get token");
		TokenDto tokenDto = new TokenDto();
		UsuarioTokenDto usuarioDto = new UsuarioTokenDto(username, password);
		List<UsuarioTokenDto> lstUserType = usuarioService.lstUserDtos(Constants.EndPoints.USERTYPE_TOKEN);
		tokenDto = generateTokenService.generateToken(usuarioDto, lstUserType);
		return tokenDto;

	}

}
