package com.sistema.implant.controllers;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
public interface UsuarioRepository extends JpaRepository<UsuarioRepository, Integer>{
Optional<UsuarioRepository> findByEmail(String email);
}