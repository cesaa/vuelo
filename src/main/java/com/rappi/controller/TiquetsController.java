package com.rappi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rappi.model.TiquetModel;
import com.rappi.model.ValidationModel;
import com.rappi.service.TiquetsService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("/tiquets")
public class TiquetsController {

	@Autowired
	TiquetsService tiquetsService;
	
	@GetMapping
	public ResponseEntity<?> getTiquet(){
		log.info("getTiquet()");
		try {
			ValidationModel result = tiquetsService.getAllTiquets();
			return ResponseEntity.status(result.getStatus()).body(result.getResponse());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error en la peticion del servicio");
		}	
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getTiquetById(@PathVariable Long id){
		log.info("getTiquetById("+id+")");
		try {
			ValidationModel result = tiquetsService.getTiquetsbyId(id);
			return ResponseEntity.status(result.getStatus()).body(result.getResponse());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error en la peticion del servicio");
		}	
	}
	
	@PostMapping
	public ResponseEntity<?> setTiquet(@RequestBody TiquetModel model){
		log.info("setTiquet()");
		try {
			ValidationModel result = tiquetsService.setTiquet(model);
			return ResponseEntity.status(result.getStatus()).body(result.getResponse());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error en la peticion del servicio");
		}	
	}
}
