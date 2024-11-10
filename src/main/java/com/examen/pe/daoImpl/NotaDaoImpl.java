package com.examen.pe.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.examen.pe.dao.NotaDao;
import com.examen.pe.entity.Nota;
import com.examen.pe.repository.NotaRepository;

@Component
public class NotaDaoImpl implements NotaDao{
	
	@Autowired
	private NotaRepository repository;
	@Override
	public Nota create(Nota c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

	@Override
	public Nota update(Nota c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Nota> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Nota> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
