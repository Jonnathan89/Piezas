package co.com.santander.datos.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import co.com.santander.commons.piezas.dto.MuebleAccesorioDTO;
import co.com.santander.datos.entity.MuebleAccesorio;


@Mapper(componentModel = "spring")
public interface MuebleAccesorioMapper {
	
	@Mapping(source="muebleAccesorio.id", target="id")
	@Mapping(source="muebleAccesorio.nombre", target="nombre")
	@Mapping(source="muebleAccesorio.primerApellido", target="primerApellido")
	@Mapping(source="muebleAccesorio.segundoApeliido", target="segundoApeliido")
	@Mapping(source="muebleAccesorio.tipoIdentifacion", target="tipoIdentifacion")
	@Mapping(source="muebleAccesorio.identificacion", target="identificacion" )
	@Mapping(source="muebleAccesorio.fecha", target="fecha" )
	@Mapping(source="muebleAccesorio.numeroCelular", target="numeroCelular" )
	@Mapping(source="muebleAccesorio.actividadEconomica", target="actividadEconomica" )
	@Mapping(source="muebleAccesorio.ingresosMensuales", target="ingresosMensuales" )
	MuebleAccesorioDTO muebleAccesorioEntityToDTO(MuebleAccesorio muebleAccesorio);
	
	
	@Mapping(source="muebleAccerosioDTO.id", target="id")
	@Mapping(source="muebleAccerosioDTO.nombre", target="nombre")
	@Mapping(source="muebleAccerosioDTO.primerApellido", target="primerApellido")
	@Mapping(source="muebleAccerosioDTO.segundoApeliido", target="segundoApeliido")
	@Mapping(source="muebleAccerosioDTO.tipoIdentifacion", target="tipoIdentifacion")
	@Mapping(source="muebleAccerosioDTO.identificacion", target="identificacion" )
	@Mapping(source="muebleAccerosioDTO.fecha", target="fecha" )
	@Mapping(source="muebleAccerosioDTO.numeroCelular", target="numeroCelular" )
	@Mapping(source="muebleAccerosioDTO.actividadEconomica", target="actividadEconomica" )
	@Mapping(source="muebleAccerosioDTO.ingresosMensuales", target="ingresosMensuales" )
	MuebleAccesorio muebleAccesorioDTOToEntity(MuebleAccesorioDTO muebleAccerosioDTO);

	
	List<MuebleAccesorioDTO> listMuebleAccerosioEntitiesToDTOs(List<MuebleAccesorio> listMuebleAccesorio);
	List<MuebleAccesorio> listMuebleAccesorioDTOToEntity(List<MuebleAccesorioDTO> listMAccesorioDTO);
	
	
}
