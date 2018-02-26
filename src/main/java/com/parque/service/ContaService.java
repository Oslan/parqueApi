package com.parque.service;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.parque.dao.ClienteDAO;
import com.parque.domain.Cliente;
import com.parque.domain.Conta;
import com.parque.dto.ClienteDTO;
import com.parque.dto.ContaDTO;

@Service
public class ContaService {
	
	
	private ClienteDAO clienteDAO;
	
	 public ResponseEntity<?>save2(Cliente cliente){
		 cliente= new Cliente();
		 
		 cliente.setNome("Oslan Caio Souza Aguiar");
		 cliente.setEmail("caio.aguiar2528@gmail.com");
		 clienteDAO.getInstance().persist(cliente);
	    	return ResponseEntity
	    			.status(HttpStatus.OK)
	    			.body("OK");
	  }
	 
	
	  public ResponseEntity<?>getContas(){
	    	return ResponseEntity
	    			.status(HttpStatus.OK)
	    			.body(this.convertePojoInDTO(getContasWithCliente()));
	  }
	  
	  private List<ContaDTO> convertePojoInDTO(List<Conta> contas) {
		  List<ContaDTO> listaDTO = new ArrayList<>();
		  List<Conta> lista = this.getContasWithCliente();
		 
		  for (Conta conta : lista) {
			listaDTO.add(new ContaDTO(conta.getId(),
									  conta.getNumero(),
									  new BigDecimal(0.0),
						  			  new BigDecimal(0.0),
									  new ClienteDTO(conta.getCliente().getId(),
											  		 conta.getCliente().getNome(),
											  		 conta.getCliente().getEmail(),
											  		 null)));
		  }
		  return listaDTO;
	  }
	  
	  private List<Conta> getContasWithCliente(){
		  List<Conta> lista = new ArrayList<>();
		  lista.add(new Conta(1L,
				  			  "6267273839393",
				  			  new BigDecimal(0.0),
				  			  new BigDecimal(0.0),
				  			  new Cliente(1L,
				  					  	  "Oslan Caio Souza Aguiar",
				  					  	  "caio.aguiar2528@gmail.com")));
		  
		  lista.add(new Conta(2L,
				  			  "6267273839393",
				  			  new BigDecimal(0.0),
				  			  new BigDecimal(0.0),
				  			  new Cliente(2L,
				  					  	  "Oslan Caio Souza Aguiar",
				  					  	  "caio.aguiar2528@gmail.com")));
					  
		  lista.add(new Conta(3L,
				  			  "6267273839393",
				  			  new BigDecimal(0.0),
				  			  new BigDecimal(0.0),
				  			  new Cliente(3L,
				  					  	  "Oslan Caio Souza Aguiar",
				  					  	  "caio.aguiar2528@gmail.com")));
		  
		  lista.add(new Conta(4L,
				  			  "6267273839393",
				  			  new BigDecimal(0.0),
				  			  new BigDecimal(0.0),
				  			  new Cliente(4L,
				  					  	  "Oslan Caio Souza Aguiar",
				  					  	  "caio.aguiar2528@gmail.com")));
		  
		  lista.add(new Conta(5L,
				  			  "6267273839393",
				  			  new BigDecimal(0.0),
				  			  new BigDecimal(0.0),
				  			  new Cliente(5L,
				  					  	  "Oslan Caio Souza Aguiar",
				  					  	  "caio.aguiar2528@gmail.com")));
		  
		  lista.add(new Conta(6L,
				  			  "6267273839393",
				  			  new BigDecimal(0.0),
				  			  new BigDecimal(0.0),
				  			  new Cliente(6L,
				  					  	  "Oslan Caio Souza Aguiar",
				  					  	  "caio.aguiar2528@gmail.com")));
		  
		  return lista;
	  }
}
