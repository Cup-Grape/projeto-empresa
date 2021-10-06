package br.com.empresa.projeto.empresa.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("funcionario/")
public class Funcionario_Controller {
	
	@PostMapping("cadastrar")
	public ResponseEntity<?> cadastrar_novo_funcionario(@RequestBody FuncionarioRequest request){
		return ResponseEntity.status(400).build();
		return ResponseEntity.status(201).build(Response);
	}
	
	
}
