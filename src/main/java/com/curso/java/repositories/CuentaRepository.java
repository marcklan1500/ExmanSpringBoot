package com.curso.java.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.curso.java.models.Cuenta;

@Repository
public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
	Optional<Cuenta> findByNumeroCuenta(@Param("numeroCuenta") String numeroCuenta);
}
