package com.bocobi.back.models;

import javax.persistence.*;
@Table
@Entity
public class Examen {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idExamen;

	private String libelleExamen;
	
	private String descriptionExamen;

	public Long getIdExamen() {
		return idExamen;
	}

	public void setIdExamen(Long idExamen) {
		this.idExamen = idExamen;
	}

	public String getLibelleExamen() {
		return libelleExamen;
	}

	public void setLibelleExamen(String libelleExamen) {
		this.libelleExamen = libelleExamen;
	}

	public String getDescriptionExamen() {
		return descriptionExamen;
	}

	public void setDescriptionExamen(String descriptionExamen) {
		this.descriptionExamen = descriptionExamen;
	}
	
}
