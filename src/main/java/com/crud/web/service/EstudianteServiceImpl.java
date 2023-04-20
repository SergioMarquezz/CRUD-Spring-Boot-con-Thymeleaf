package com.crud.web.service;

import com.crud.web.dao.EstudianteDaoJpa;
import com.crud.web.entity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudianteServiceImpl implements EstudianteService{

    @Autowired
    private EstudianteDaoJpa jpaEstudiante;
    @Override
    public List<Estudiante> listarTodosEstudiantes() {
        return jpaEstudiante.findAll();
    }
}
