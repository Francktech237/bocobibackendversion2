package com.bocobi.back.controllers;

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


import com.bocobi.back.models.Medicament;
import com.bocobi.back.repos.MedicamentRepos;

@RestController
@RequestMapping("/bocobi")
@CrossOrigin

public class MedicamentController {
	
	 @Autowired
	 private MedicamentRepos medicamentRepos;

		@GetMapping("/Medicaments")
		public List<Medicament> getMedicament(){
			return medicamentRepos.findAll();
		}

		@GetMapping("/Medicament/{idMedicaments}")
		public Medicament searchById(@PathVariable Long idMedicament) {
			return medicamentRepos.findById(idMedicament).orElse(null);
		}	

		@PostMapping("/medicament")
		public Medicament saveMedicament(@RequestBody Medicament medicament) {
			return medicamentRepos.save(medicament);
		}

		@DeleteMapping("/medicament/{idMedicament}")
		public String deleteMedicament(@PathVariable Long idMedicament) {
			medicamentRepos.deleteById(idMedicament);
			return "Medicament supprimer avec success !!"+idMedicament;
		}
		@PutMapping("/updateMedicament/{idMedicament}")
		/*bluid update medicament REST API*/ 
		public String updateMedicament(@PathVariable (value = "idMedicament") Long idMedicament , 
									   @RequestBody Medicament medicament ) {
			Medicament existingMedicament = medicamentRepos.findById(idMedicament).orElse(null);
			existingMedicament.setDateFabrication(medicament.getDateFabrication());
			existingMedicament.setDatePeremption(medicament.getDatePeremption());
			existingMedicament.setDescriptionMedicament(medicament.getDescriptionMedicament());
			existingMedicament.setLibelleMedicament(medicament.getLibelleMedicament());
			existingMedicament.setPrixMedicament(medicament.getPrixMedicament());
			existingMedicament.setQuantiteMedicament(medicament.getQuantiteMedicament());
			
			medicamentRepos.save(existingMedicament);
			
			return "mise a jour effectué avec success";
		}
}
