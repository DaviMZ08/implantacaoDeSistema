package com.sistema.implant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.implant.models.Aluno;

public interface  AlunoRepository extends JpaRepository<Aluno, Integer> {
    
}
