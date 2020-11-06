/**
 * 
 */
package co.com.santander.datos.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
    private int id;
	
	@Column(name = "nombre")
	private String nombre ;
	
	@Column(name = "primer_apellido")
	private String  primerApellido ;
	
	@Column(name ="segundo_apellido")
	private String segundoApellido;
	
	@Column(name = "tipo_identificacion")
	private int tipoIdentifacion ;		
	
	@Column(name = "identificacion")
	private Integer identificacion ;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha;
	
	@Column(name = "numero_celular")	
	private long numeroCelular;
	
	@Column(name = "actividad_economica")	
	private int actividadEconomica;
	
	@Column(name = "ingresos_mensuales")	
	private long ingresosMensuales;
	
	public MuebleAccesorio () {
		
	}
	

	public MuebleAccesorio(String nombre, String primerApellido, String segundoApellido, int tipoIdentifacion,
			Integer identificacion, Date fecha, long numeroCelular, int actividadEconomica,
			long ingresosMensuales) {		
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.tipoIdentifacion = tipoIdentifacion;
		this.identificacion = identificacion;
		this.fecha = fecha;
		this.numeroCelular = numeroCelular;
		this.actividadEconomica = actividadEconomica;
		this.ingresosMensuales = ingresosMensuales;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
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


	public String getSegundoApellido() {
		return segundoApellido;
	}


	public void setSegundoApeliido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}


	public int getTipoIdentifacion() {
		return tipoIdentifacion;
	}


	public void setTipoIdentifacion(int tipoIdentifacion) {
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


	public long getNumeroCelular() {
		return numeroCelular;
	}


	public void setNumeroCelular(long numeroCelular) {
		this.numeroCelular = numeroCelular;
	}


	public int getActividadEconomica() {
		return actividadEconomica;
	}


	public void setActividadEconomica(int actividadEconomica) {
		this.actividadEconomica = actividadEconomica;
	}


	public long getIngresosMensuales() {
		return ingresosMensuales;
	}


	public void setIngresosMensuales(long ingresosMensuales) {
		this.ingresosMensuales = ingresosMensuales;
	}

	
}
