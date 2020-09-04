package co.com.santander.Dto;

import java.io.Serializable;

public class TokenDto implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String user;
	
	private String token;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public TokenDto(String user, String token) {
		super();
		this.user = user;
		this.token = token;
	}

	public TokenDto() {
		super();
	}

	
	
	
	
}
