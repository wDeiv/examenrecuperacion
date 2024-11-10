package com.examen.pe.service;

import java.util.List;
import java.util.Optional;

import com.examen.pe.entity.Curso;

public interface CursoService {
	Curso create(Curso c);
	Curso update(Curso c);
	void delete(Long id);
	Optional<Curso> read(Long id);
	List<Curso> readAll();
}
