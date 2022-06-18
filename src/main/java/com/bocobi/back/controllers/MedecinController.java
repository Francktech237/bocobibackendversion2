/*package com.bocobi.back.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bocobi.back.models.Medecin;

import com.bocobi.back.repos.MedecinRepos;

@RestController
@RequestMapping("/bocobi")
@CrossOrigin
public class MedecinController {
	 @Autowired
	 private MedecinRepos medecinRepos;

		@GetMapping("/Medecins")
		public List<Medecin> getExamen() {
			return medecinRepos.findAll();
		}

		@GetMapping("/Medecin/{idMedecin}")
		public Medecin searchById(@PathVariable Long idMedecin) {
			return medecinRepos.findById(idMedecin).orElse(null);
		}	

		@PostMapping("/medecin")
		public Medecin saveAlerte(@RequestBody Medecin medecin) {
			return medecinRepos.save(medecin);
		}

		@DeleteMapping("/medecin/{idMedecin}")
		public String deleteMedecin(@PathVariable Long idMedecin) {
			medecinRepos.deleteById(idMedecin);
			return "Medecin supprimer avec success !!"+idMedecin;
		}
		
		@PutMapping("/updatemedecin/{idMedecin}")
		//bluid update medecin REST API
		public String updateMedecin(@PathVariable (value = "idMedecin") Long idMedecin , 
									   @RequestBody Medecin medecin ) {
			Medecin existingMedecin = medecinRepos.findById(idMedecin).orElse(null);
			existingMedecin.setServiceMedecin(medecin.getServiceMedecin());
			existingMedecin.setSpecialiteMedecin(medecin.getSpecialiteMedecin());
			
			medecinRepos.save(existingMedecin);
			
			return "mise a jour effectué avec success !!!";
		}
}*/
