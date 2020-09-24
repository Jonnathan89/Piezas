package co.com.santander.commons.piezas.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
@Data
public class MuebleAccesorioDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;

	private String nombre;

	private String primerApellido;

	private String segundoApeliido;

	private int tipoIdentifacion;

	private Integer identificacion;

	private Date fecha;

	private long numeroCelular;

	private int actividadEconomica;

	private long ingresosMensuales;	

	public MuebleAccesorioDTO() {
		super();
	}

	public MuebleAccesorioDTO(int id, String nombre, String primerApellido, String segundoApeliido,
			int tipoIdentifacion, Integer identificacion, Date fecha, long numeroCelular, int actividadEconomica,
			long ingresosMensuales) {
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
	
	

}
