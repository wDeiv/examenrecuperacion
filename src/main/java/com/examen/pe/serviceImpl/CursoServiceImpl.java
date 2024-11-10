package com.examen.pe.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.pe.dao.CursoDao;
import com.examen.pe.entity.Curso;
import com.examen.pe.service.CursoService;

@Service
public class CursoServiceImpl implements CursoService{
	
	@Autowired
	private CursoDao dao;
	@Override
	public Curso create(Curso c) {
		// TODO Auto-generated method stub
		return dao.create(c);
	}

	@Override
	public Curso update(Curso c) {
		// TODO Auto-generated method stub
		return dao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Curso> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Curso> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
