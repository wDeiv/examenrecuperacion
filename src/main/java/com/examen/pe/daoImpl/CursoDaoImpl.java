package com.examen.pe.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.examen.pe.dao.CursoDao;
import com.examen.pe.entity.Curso;
import com.examen.pe.repository.CursoRepository;

@Component
public class CursoDaoImpl implements CursoDao {
	
	@Autowired
	private CursoRepository repository;
	@Override
	public Curso create(Curso c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

	@Override
	public Curso update(Curso c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Curso> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Curso> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
