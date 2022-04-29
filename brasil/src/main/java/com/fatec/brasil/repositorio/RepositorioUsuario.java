package com.fatec.brasil.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import entidades.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long>{
	
}