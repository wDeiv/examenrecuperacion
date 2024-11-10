package com.examen.pe.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.pe.dao.NotaDao;
import com.examen.pe.entity.Nota;
import com.examen.pe.service.NotaService;

@Service
public class NotaServiceImpl implements NotaService{
	
	@Autowired
	private NotaDao dao;
	@Override
	public Nota create(Nota c) {
		 if (c.getNota1() != null && c.getNota2() != null && c.getNota3() != null) {
	            double promedio = (c.getNota1() + c.getNota2() + c.getNota3()) / 3;
	            c.setPromedio(promedio);
	        }

		// TODO Auto-generated method stub
		return dao.create(c);
	}

	@Override
	public Nota update(Nota c) {
		if (c.getNota1() != null && c.getNota2() != null && c.getNota3() != null) {
            double promedio = (c.getNota1() + c.getNota2() + c.getNota3()) / 3;
            c.setPromedio(promedio);
        }
		// TODO Auto-generated method stub
		return dao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Nota> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Nota> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
