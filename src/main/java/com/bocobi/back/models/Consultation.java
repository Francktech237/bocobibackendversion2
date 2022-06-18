package com.bocobi.back.models;

import java.sql.Date;

import javax.persistence.*;

@Table
@Entity	
public class Consultation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long idConsult;
	
	private String typeConsult;
	
	private String diagnosticMaladie;
	
	private Date dateConsult;
	
	private int heureconsult;
	
	
	public Long getIdConsult() {
		return idConsult;
	}
	public void setIdConsult(Long idConsult) {
		this.idConsult = idConsult;
	}
	public String getTypeConsult() {
		return typeConsult;
	}
	public void setTypeConsult(String typeConsult) {
		this.typeConsult = typeConsult;
	}
	public String getDiagnosticMaladie() {
		return diagnosticMaladie;
	}
	public void setDiagnosticMaladie(String diagnosticMaladie) {
		this.diagnosticMaladie = diagnosticMaladie;
	}
	public Date getDateConsult() {
		return dateConsult;
	}
	public void setDateConsult(Date dateConsult) {
		this.dateConsult = dateConsult;
	}
	public int getHeureconsult() {
		return heureconsult;
	}
	public void setHeureconsult(int heureconsult) {
		this.heureconsult = heureconsult;
	}
}
