package com;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class OperatoriRest {

	@PostMapping("/save")
	public ResponseEntity<String> save() {
		
		return new ResponseEntity<String>(
				"Inserimento Effettuato", HttpStatus.OK);
				
	}
	
}
