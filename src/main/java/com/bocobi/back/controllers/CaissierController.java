/*package com.bocobi.back.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bocobi.back.models.Caissier;
import com.bocobi.back.repos.CaissierRepos;

public class CaissierController {
	
	 @Autowired
	 private CaissierRepos caissierRepos;

		@GetMapping("/caissier")
		public List<Caissier> getCaissier(){
			return  caissierRepos.findAll();
		}

		@GetMapping("/caissier/{idCaissier}")
		public Caissier searchById(@PathVariable Long idCaissier) {
			return  caissierRepos.findById(idCaissier).orElse(null);
		}	

		@PostMapping("/Caissier")
		public  Caissier  saveRole(@RequestBody  Caissier caissier) {
			return  caissierRepos.save(caissier);
		}

		@DeleteMapping("/Caissier/{idCaissier}")
		public String deleteRole(@PathVariable Long idCaissier) {
			 caissierRepos.deleteById(idCaissier);
			return "Caissier supprimer avec success !!"+idCaissier;
		}
		
		@PutMapping("/updateCaissier/{idCaissier}")
		public String updateCaissier(@PathVariable (value = "idCaissier") Long idCaissier,
								 @RequestBody Caissier caissier) {
			Caissier existingCaissier = caissierRepos.findById(idCaissier).orElse(null);
			existingCaissier.setIdCaissier(caissier.getIdCaissier());
			
			caissierRepos.save(existingCaissier);
			
			return "mise a jour effectué avec success !!";
		}
}*/
