package com.parque.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.parque.facade.Facade;

@Controller
public class ParqueResource {
	
	@Autowired
	private Facade facade;
	
	@RequestMapping(value="/contas",method=RequestMethod.GET)
	public ResponseEntity<?> getContas() {
		
		return facade.getContas(); 	
	}
	
	@RequestMapping(value="/save",method=RequestMethod.GET)
	public ResponseEntity<?> save() {
		System.out.println("Save!");
		
		return facade.save();
	}


}
