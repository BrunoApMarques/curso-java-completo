package com.isidrocorp.isibank.controller;

import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isidrocorp.isibank.model.Produto;

@RestController
public class HelloController {
	@GetMapping("/hello")
	public String digaOla() {
		return "Hello World com o prof Isidro !";
	}

	@GetMapping("/testehtml")
	public String gerarhtml() {
		return "<html><body><h2>teste 123 simboraa</h2></body></html>";
	}

	@GetMapping("/produto")
	public Produto recuperarProduto() {
		Produto p = new Produto();
		p.setId(1234);
		p.setDescricao("Produto top");
		p.setPreco(1000);
		p.setQuantidade(4);
		return p;
	}
}
