package co.com.santander.datos.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import co.com.santander.commons.piezas.dto.UsuarioDto;
import co.com.santander.datos.entity.Usuario;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

	
	
	@Mapping(source="usuario.username", target="userName")
	@Mapping(source="usuario.password", target="password")
	@Mapping(source="usuario.typeuser", target="typeuser")
	UsuarioDto  usuarioEntityToDTO (Usuario usuario);	
	
	
	@Mapping(source="usuarioDto.userName", target="username")
	@Mapping(source="usuarioDto.password", target="password")
	@Mapping(source="usuarioDto.typeuser", target="typeuser")
	Usuario usuarioDTOToEntity (UsuarioDto usuarioDto);	
	
	List<UsuarioDto> listUsuarioEntitiesToDTOs(List<Usuario> listUsuario);
	List<Usuario> listUsuarioDtoDTOToEntity(List<UsuarioDto> listUsuarioDto);
	
	
}
