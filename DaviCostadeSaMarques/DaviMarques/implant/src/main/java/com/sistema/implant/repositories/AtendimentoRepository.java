package com.sistema.implant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.implant.models.Atendimento;

public interface  AtendimentoRepository extends JpaRepository<Atendimento, Integer> {
    
}

