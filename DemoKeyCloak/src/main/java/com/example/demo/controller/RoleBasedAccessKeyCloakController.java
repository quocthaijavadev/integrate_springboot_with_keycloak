package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleBasedAccessKeyCloakController {
	
	@RequestMapping(value = "/")
	public ResponseEntity<String> home(){
		return ResponseEntity.ok("This is home page.");
	}

	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public ResponseEntity<String> getMemberApi() {
		return ResponseEntity.ok("This is member page.");
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ResponseEntity<String> getAdminApi() {
		return ResponseEntity.ok("This is admin page.");
	}
} 
