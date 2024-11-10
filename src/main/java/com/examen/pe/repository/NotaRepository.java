package com.examen.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.pe.entity.Nota;

@Repository
public interface NotaRepository extends JpaRepository<Nota, Long>{

}
