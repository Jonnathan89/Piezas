package co.com.santander.commons.piezas.dto;

import java.io.Serializable;
import java.util.Date;

public class MuebleAccesorioDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String nombre;

	private String primerApellido;

	private String segundoApeliido;

	private String tipoIdentifacion;

	private Integer identificacion;

	private Date fecha;

	private Integer numeroCelular;

	private String actividadEconomica;

	private Integer ingresosMensuales;
	
	

	public MuebleAccesorioDTO() {
		super();
	}
	
	public MuebleAccesorioDTO(Integer id, String nombre, String primerApellido, String segundoApeliido,
			String tipoIdentifacion, Integer identificacion, Date fecha, Integer numeroCelular,
			String actividadEconomica, Integer ingresosMensuales) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApeliido = segundoApeliido;
		this.tipoIdentifacion = tipoIdentifacion;
		this.identificacion = identificacion;
		this.fecha = fecha;
		this.numeroCelular = numeroCelular;
		this.actividadEconomica = actividadEconomica;
		this.ingresosMensuales = ingresosMensuales;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApeliido() {
		return segundoApeliido;
	}

	public void setSegundoApeliido(String segundoApeliido) {
		this.segundoApeliido = segundoApeliido;
	}

	public String getTipoIdentifacion() {
		return tipoIdentifacion;
	}

	public void setTipoIdentifacion(String tipoIdentifacion) {
		this.tipoIdentifacion = tipoIdentifacion;
	}

	public Integer getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(Integer identificacion) {
		this.identificacion = identificacion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(Integer numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public String getActividadEconomica() {
		return actividadEconomica;
	}

	public void setActividadEconomica(String actividadEconomica) {
		this.actividadEconomica = actividadEconomica;
	}

	public Integer getIngresosMensuales() {
		return ingresosMensuales;
	}

	public void setIngresosMensuales(Integer ingresosMensuales) {
		this.ingresosMensuales = ingresosMensuales;
	}
	 	
	
	
	
	


	
	
	

}
