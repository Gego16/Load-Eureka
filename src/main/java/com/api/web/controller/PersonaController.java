package com.api.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.web.model.Persona;
import com.api.web.service.PersonaService;



@RestController
@RequestMapping("/usuarios")
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/lista")
	public ResponseEntity<List<Persona>>lista(){
		List<Persona> person = new ArrayList<>();
		
		try {
			person = personaService.listausuarios();
			if(person != null) {
				return new ResponseEntity<>(person,HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
}
