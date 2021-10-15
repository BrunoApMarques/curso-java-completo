package br.com.isidrocorp.isimoney.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.isidrocorp.isimoney.model.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {
public ArrayList<Cliente> findAllByNomeContaining(String palavra);
}
