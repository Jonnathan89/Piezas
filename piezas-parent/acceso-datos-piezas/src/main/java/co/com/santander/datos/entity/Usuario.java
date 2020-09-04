package co.com.santander.datos.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "usuario")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	
	 @Column(name = "username")
	 private String username;
	 
	 @Column(name = "password")
	 private String password ;
	 
	 @Column(name = "typeuser")
	 private String typeuser ;
	 

	 public String getUsername() {
		return username;
	 }

	 public void setUsername(String username) {
		this.username = username;
	 }

	 public String getPassword() {
	 	return password;
	 }

	 public void setPassword(String password) {
		this.password = password;
	 }

	public String getTypeuser() {
		return typeuser;
	}

	public void setTypeuser(String typeuser) {
		this.typeuser = typeuser;
	}


	 
	 
	 
	 
	 
	 
	 
	
}
