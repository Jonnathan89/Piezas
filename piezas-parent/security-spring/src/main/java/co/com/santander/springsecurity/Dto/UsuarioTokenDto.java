/**
 * 
 */
package co.com.santander.springsecurity.Dto;

import java.io.Serializable;

import lombok.Data;

/**
 * @author l.ruizs
 *
 */
@Data
public class UsuarioTokenDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
    private String password ;
    private String typeuser ;
    
	public UsuarioTokenDto(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;	
	}

	public UsuarioTokenDto() {
		super();
	}

}
