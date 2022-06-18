package com.bocobi.back.models;

import javax.persistence.*;

@Table
@Entity
public class Forfait {
   
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long idForfait;

	private String libelleForfait;
    
	private long prixForfait;

	public Long getIdForfait() {
		return idForfait;
	}

	public void setIdForfait(Long idForfait) {
		this.idForfait = idForfait;
	}

	public String getLibelleForfait() {
		return libelleForfait;
	}

	public void setLibelleForfait(String libelleForfait) {
		this.libelleForfait = libelleForfait;
	}

	public long getPrixForfait() {
		return prixForfait;
	}

	public void setPrixForfait(long prixForfait) {
		this.prixForfait = prixForfait;
	}

}