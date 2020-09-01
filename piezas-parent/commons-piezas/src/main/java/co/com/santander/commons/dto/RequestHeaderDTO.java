package co.com.santander.commons.dto;

import org.jetbrains.annotations.NotNull;

public class RequestHeaderDTO {
	
	@NotNull
	private int codAliado;
	@NotNull
	private String usuarioAliado;
	@NotNull
	private String sesionId;
	@NotNull
	private String ipOrigen;
	@NotNull
	private long numeroSolicitudCredito;
	@NotNull
	private Integer tipoIdentificacion;
	@NotNull
	private String identificacion;

	public int getCodAliado() {
		return codAliado;
	}

	public void setCodAliado(int codAliado) {
		this.codAliado = codAliado;
	}

	public String getUsuarioAliado() {
		return usuarioAliado;
	}

	public void setUsuarioAliado(String usuarioAliado) {
		this.usuarioAliado = usuarioAliado;
	}

	public String getSesionId() {
		return sesionId;
	}

	public void setSesionId(String sesionId) {
		this.sesionId = sesionId;
	}

	public String getIpOrigen() {
		return ipOrigen;
	}

	public void setIpOrigen(String ipOrigen) {
		this.ipOrigen = ipOrigen;
	}

	public long getNumeroSolicitudCredito() {
		return numeroSolicitudCredito;
	}

	public void setNumeroSolicitudCredito(long numeroSolicitudCredito) {
		this.numeroSolicitudCredito = numeroSolicitudCredito;
	}

	public Integer getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(Integer tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

}
