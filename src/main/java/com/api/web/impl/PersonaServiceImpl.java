package com.api.web.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.web.dao.PersonaDao;
import com.api.web.model.Persona;
import com.api.web.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService{
	
	@Autowired
	private PersonaDao personaDao;

	@Override
	public List<Persona> listausuarios() {
		return (List<Persona>) personaDao.findAll();
	}

}
