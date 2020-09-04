package co.com.santander.commons.piezas.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class UsuarioDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
    private String password ;
    private String typeuser ;
    
	public UsuarioDto(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;	
	}

	public UsuarioDto() {
		super();
	}


}
