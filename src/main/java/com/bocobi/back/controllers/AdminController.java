package com.bocobi.back.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bocobi.back.models.Admin;
import com.bocobi.back.repos.AdminRepos;

@RestController
@RequestMapping("/bocobi")
@CrossOrigin

public class AdminController {
	 @Autowired
	 private AdminRepos adminRepos;
		
		@GetMapping("/admin")
		public List<Admin> getAdmin() {
			return adminRepos.findAll();
		}
		
		@GetMapping("/admin/{idAdmin}")
		public Admin searchById(@PathVariable Long idAdmin) {
			return adminRepos.findById(idAdmin).orElse(null);
		}	
		
		@PostMapping("/admin")
		public Admin saveAdmin(@RequestBody Admin admin) {
			return adminRepos.save(admin);
		}

		@DeleteMapping("/admin/{idAdmin}")
		public String deleteAdmin(@PathVariable Long idAdmin) {
			adminRepos.deleteById(idAdmin);
			return "Examen suprimer avec success !!"+idAdmin;
		}	
		
}
