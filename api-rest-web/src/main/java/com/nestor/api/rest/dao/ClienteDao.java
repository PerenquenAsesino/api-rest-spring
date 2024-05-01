package com.nestor.api.rest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nestor.api.rest.entity.Cliente;

@Repository
public interface ClienteDao extends CrudRepository<Cliente, Long> {

	
}
