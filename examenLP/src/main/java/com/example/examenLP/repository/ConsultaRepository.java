package com.example.examenLP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examenLP.entity.Consulta;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long>{

}
