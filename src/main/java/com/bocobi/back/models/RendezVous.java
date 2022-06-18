package com.bocobi.back.models;

import java.util.Date;

import javax.persistence.*;

@Table
@Entity
public class RendezVous {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idRdv;

	private Date dateRdv;

	private Date heureRdv;

	public Long getIdRdv() {
		return idRdv;
	}

	public void setIdRdv(Long idRdv) {
		this.idRdv = idRdv;
	}

	public Date getDateRdv() {
		return dateRdv;
	}

	public void setDateRdv(Date dateRdv) {
		this.dateRdv = dateRdv;
	}

	public Date getHeureRdv() {
		return heureRdv;
	}

	public void setHeureRdv(Date heureRdv) {
		this.heureRdv = heureRdv;
	}
}
