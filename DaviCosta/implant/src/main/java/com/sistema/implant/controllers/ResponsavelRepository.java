package com.sistema.implant.controllers;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface ResponsavelRepository extends JpaRepository<ResponsavelRepository, Integer>
{
@Query(value="select * from responsavel where nome like '%'||:termo||'%';",
nativeQuery=true)
public List<ResponsavelRepository> listarResponsaveis(String termo);
}