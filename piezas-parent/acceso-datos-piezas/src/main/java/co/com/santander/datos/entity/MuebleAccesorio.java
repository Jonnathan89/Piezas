/**
 * 
 */
package co.com.santander.datos.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * @author j.ladinoh
 *
 */
@Entity
@Table(name = "datamueblesaccesorios")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class MuebleAccesorio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	
	@Column(name = "nombre")
	private String nombre ;
	
	@Column(name = "primer_apellido")
	private String  primerApellido ;
	
	@Column(name = "segundo_apellido")
	private String segundoApeliido ;
	
	@Column(name = "tipo_identificacion")
	private String tipoIdentifacion ;		
	
	@Column(name = "identificacion")
	private Integer identificacion ;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "numero_celular")	
	private Integer numeroCelular;
	
	@Column(name = "actividad_economica")	
	private String actividadEconomica;
	
	@Column(name = "ingresos_mensuales")	
	private Integer ingresosMensuales;
	
	public MuebleAccesorio () {
		
	}
	

	public MuebleAccesorio(String nombre, String primerApellido, String segundoApeliido, String tipoIdentifacion,
			Integer identificacion, Date fecha, Integer numeroCelular, String actividadEconomica,
			Integer ingresosMensuales) {		
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



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
