package com.examen.pe.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.examen.pe.dao.AlumnoDao;
import com.examen.pe.entity.Alumno;
import com.examen.pe.repository.AlumnoRepository;

@Component
public class AlumnoDaoImpl implements AlumnoDao{
	
	@Autowired
	private AlumnoRepository repository;
	@Override
	public Alumno create(Alumno c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

	@Override
	public Alumno update(Alumno c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Alumno> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
