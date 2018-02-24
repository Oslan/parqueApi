package com.parque.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.parque.service.ContaService;

public class Facade {
	
	@Autowired
	private ContaService contaService;

    public ResponseEntity<?>getContas(){
  
    	return this.contaService.getContas();
    }
}
