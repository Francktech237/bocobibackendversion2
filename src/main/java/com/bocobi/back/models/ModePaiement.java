package com.bocobi.back.models;

import javax.persistence.*;

@Table
@Entity
public class ModePaiement {
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPaiement;

	private String libellePaiement;

	public Long getIdPaiement() {
		return idPaiement;
	}

	public void setIdPaiement(Long idPaiement) {
		this.idPaiement = idPaiement;
	}

	public String getLibellePaiement() {
		return libellePaiement;
	}

	public void setLibellePaiement(String libellePaiement) {
		this.libellePaiement = libellePaiement;
	}

}
