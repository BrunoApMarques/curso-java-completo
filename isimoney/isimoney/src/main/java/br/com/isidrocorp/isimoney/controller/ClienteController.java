package br.com.isidrocorp.isimoney.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.isimoney.dao.ClienteDao;
import br.com.isidrocorp.isimoney.model.Cliente;

@RestController

public class ClienteController {
	@Autowired
	private ClienteDao dao;
	@GetMapping("/clientes")
	public ArrayList<Cliente> recuperarTodos(){ 
		return (ArrayList<Cliente>)dao.findAll();
	}
}
