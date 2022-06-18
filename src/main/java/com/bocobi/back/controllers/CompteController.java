package com.bocobi.back.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bocobi.back.models.Compte;
import com.bocobi.back.models.Medicament;
import com.bocobi.back.repos.CompteRepos;

@RestController
@RequestMapping("/bocobi")
@CrossOrigin
public class CompteController {
	 @Autowired
	 private CompteRepos compteRepos;

		@GetMapping("/Comptes")
		public List<Compte> getCompte() {
			return compteRepos.findAll();
		}

		@GetMapping("/Comptes/{idCompte}")
		public Compte searchById(@PathVariable Long idCompte) {
			return compteRepos.findById(idCompte).orElse(null);
		}	

		@PostMapping("/compte")
		public String saveCompte(@RequestBody Compte compte) {
			return "compte enregistrer avec success"+compteRepos.save(compte);
		}

		@DeleteMapping("/compte/{idCompte}")
		public String deleteCompte(@PathVariable Long idCompte) {
			compteRepos.deleteById(idCompte);
			return "Compte supprimer avec success !!"+idCompte;
		}
		
		@PutMapping("/updatecompte/{idCompte}")
		/*bluid update compte REST API*/ 
		public String updateCompte(@PathVariable (value = "idCompte") Long idCompte , 
									   @RequestBody Compte compte ) {
			Compte existingCompte = compteRepos.findById(idCompte).orElse(null);
				existingCompte.setLogin(compte.getLogin());
				existingCompte.setTypeCompte(compte.getTypeCompte());
				existingCompte.setPassword(compte.getPassword());
			compteRepos.save(existingCompte);
			return "mise a jour effectué avec success!!!";
		}
}
