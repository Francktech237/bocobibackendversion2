package com.bocobi.back.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bocobi.back.models.Patient;
import com.bocobi.back.models.User;
import com.bocobi.back.repos.PatientRepos;
import com.bocobi.back.repos.UserRepos;



@RestController
@CrossOrigin
public class PatientController {
	
	/*@Autowired
	private PatientRepos patientRepos;
	
	@GetMapping("/patients")
	public List<Patient> getPatients() {
		return patientRepos.findAll();
	}
	
	@GetMapping("/patient/{idPatient}")
	public User searchById(@PathVariable long idPatient) {
		return patientRepos.findById(idPatient).orElse(null);
	}	
	
	@PostMapping("/patient")
	public Patient savePatient(@RequestBody Patient patient) {
		return patientRepos.save(patient);
	}

	@DeleteMapping("/patient/{idPatient}")
	public String deletePatient(@PathVariable long idPatient) {
		patientRepos.deleteById(idPatient);
		return "Patient suprimer avec success !!"+idPatient;
	}*/
}
