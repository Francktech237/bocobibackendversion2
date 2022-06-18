package com.bocobi.back.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.bocobi.back.models.Role;
import com.bocobi.back.models.User;
import com.bocobi.back.repos.RoleRepos;
import com.bocobi.back.repos.UserRepos;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/bocobi")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

	/*@Autowired
	private UserRepos userservice;
	private RoleRepos roleservice; 

	@GetMapping("/users")
	public ResponseEntity<List<User>>getUsers(){
		return ResponseEntity.ok().body(userservice.findAll());
	}


	@PostMapping("/users")
	public ResponseEntity<User> saveUsers(@RequestBody User user){
		URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/bocobi/users").toString());
		return ResponseEntity.created(uri).body(userservice.save(user));
	}
	
	@PostMapping("/init")
	public ResponseEntity<User> initUsers(@RequestBody User user){
		URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/users").toString());
		return ResponseEntity.created(uri).body(userservice.save(user));
	}

	@PostMapping("/roles")
	public ResponseEntity<Role> saverole(@RequestBody Role role){
		URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/roles").toString());
		return ResponseEntity.created(uri).body(roleservice.save(role));
	}

	@PostMapping("/roles/addtouser")
	public ResponseEntity<?> saveUsers(@RequestBody RoleToUserForm form){
		User user = userservice.findByusername(form.getUsername());
		Role role = roleservice.findByName(form.getRoleName());
		user.getRoles().add(role);
		return ResponseEntity.ok().build();
	}
		
}

class RoleToUserForm{
	private String username;
	private String roleName;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}*/
}
