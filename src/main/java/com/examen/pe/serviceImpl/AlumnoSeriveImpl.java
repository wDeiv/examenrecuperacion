package com.examen.pe.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.pe.dao.AlumnoDao;
import com.examen.pe.entity.Alumno;
import com.examen.pe.service.AlumnoService;

@Service
public class AlumnoSeriveImpl implements AlumnoService{
	
	@Autowired
	private AlumnoDao dao;
	@Override
	public Alumno create(Alumno c) {
		// TODO Auto-generated method stub
		return dao.create(c);
	}

	@Override
	public Alumno update(Alumno c) {
		// TODO Auto-generated method stub
		return dao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Alumno> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
