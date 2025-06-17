package br.com.pastelaria;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InsumoDAO extends JpaRepository<Insumo, String> {}