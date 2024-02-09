package com.api.web.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.web.model.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long>{

}
