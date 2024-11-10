package com.examen.pe.dao;

import java.util.List;
import java.util.Optional;

import com.examen.pe.entity.Nota;

public interface NotaDao {
	Nota create(Nota c);
	Nota update(Nota c);
	void delete(Long id);
	Optional<Nota> read(Long id);
	List<Nota> readAll();
}
