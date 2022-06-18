package com.bocobi.back.models;


import javax.persistence.*;

@Entity
@Table
public class Conseil {
    
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idConseil;

	private String enonceConseil;

	private String roleConseil;

	public Long getIdConseil() {
		return idConseil;
	}

	public void setIdConseil(Long idConseil) {
		this.idConseil = idConseil;
	}

	public String getEnonceConseil() {
		return enonceConseil;
	}

	public void setEnonceConseil(String enonceConseil) {
		this.enonceConseil = enonceConseil;
	}

	public String getRoleConseil() {
		return roleConseil;
	}

	public void setRoleConseil(String roleConseil) {
		this.roleConseil = roleConseil;
	}
}
