package com.bocobi.back.models;

import javax.persistence.*;

@Table
@Entity	
public class Ordonnance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

		private Long idOrdonnance;

		public Long getIdOrdonnance() {
			return idOrdonnance;
		}

		public void setIdOrdonnance(Long idOrdonnance) {
			this.idOrdonnance = idOrdonnance;
		}
}
