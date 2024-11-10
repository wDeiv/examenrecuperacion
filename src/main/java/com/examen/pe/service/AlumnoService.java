package com.examen.pe.service;

import java.util.List;
import java.util.Optional;

import com.examen.pe.entity.Alumno;

public interface AlumnoService {
	Alumno create(Alumno c);
	Alumno update(Alumno c);
	void delete(Long id);
	Optional<Alumno> read(Long id);
	List<Alumno> readAll();
}
