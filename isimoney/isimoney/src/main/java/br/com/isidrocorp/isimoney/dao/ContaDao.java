package br.com.isidrocorp.isimoney.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.isidrocorp.isimoney.model.Conta;

public interface ContaDao extends CrudRepository<Conta, Integer> { 

}
