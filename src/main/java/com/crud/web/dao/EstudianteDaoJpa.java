package com.crud.web.dao;

import com.crud.web.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteDaoJpa extends JpaRepository<Estudiante, Long> {
}
