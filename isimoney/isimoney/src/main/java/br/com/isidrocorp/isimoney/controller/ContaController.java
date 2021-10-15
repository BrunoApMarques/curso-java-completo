package br.com.isidrocorp.isimoney.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.isimoney.dao.ContaDao;
import br.com.isidrocorp.isimoney.model.Conta;

@RestController
public class ContaController {
	@Autowired
	private ContaDao dao;

	@GetMapping("/contas")
	public ArrayList<Conta> recuperarTodas() {
		return (ArrayList<Conta>) dao.findAll();
	}
	@GetMapping("/contas/{id}")
	public ResponseEntity<Conta> recuperarConta(@PathVariable int id) {
		Conta resultado;
		resultado = dao.findById(id).orElse(null);
		if (resultado!=null) {
			return ResponseEntity.ok(resultado);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
}
