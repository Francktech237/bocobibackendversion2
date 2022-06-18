package com.bocobi.back.models;

import javax.persistence.*;
@Table
@Entity

public class Compte {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long idCompte;
	
	private String login;
	
	private String password;
	
	private String typeCompte;
	
	public Long getId() {
		return idCompte;
	}
	
	public void setId(Long idCompte) {
		this.idCompte = idCompte;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}
	
	
}
