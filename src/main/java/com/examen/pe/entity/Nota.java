package com.examen.pe.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="notas")
public class Nota {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@ManyToOne
	@JoinColumn(name="alumno", nullable = false)
	private Alumno alumno;
	@ManyToOne
	@JoinColumn(name="curso", nullable = false)
	private Curso curso;
	@Column(name="nota1")
	private Double nota1;
	@Column(name="nota2")
	private Double nota2;
	@Column(name="nota3")
	private Double nota3;
	@Column(name="promedio")
	private Double promedio;
}
