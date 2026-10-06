package com.sistema.implant.controllers;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface AtendimentoRepository extends JpaRepository<AtendimentoRepository,Integer>{
@Query(value="select at.id, at.data, at.aluno_id, at.usuario_id, al.nome as
aluno_nome, " +
"r.nome as responsavel_nome, r.cpf as responsavel_cpf from atendimento
at " +
"inner join aluno al on al.id = at.aluno_id " +
"inner join responsavel r on r.id = al.responsavel_id " +
"order by at.data;", nativeQuery = true)

public List<AtendimentoRepository> listarAtendimentos();
}