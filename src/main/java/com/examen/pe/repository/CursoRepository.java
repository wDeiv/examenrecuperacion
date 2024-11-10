package com.examen.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.pe.entity.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{

}
