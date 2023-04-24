package com.crud.web.controller;

import com.crud.web.entity.Estudiante;
import com.crud.web.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteImpl;

    @GetMapping({"/estudiantes","/"})
    public String listarEstudiantes(Model modelo){
        modelo.addAttribute("estudiantes",estudianteImpl.listarTodosEstudiantes());
        return "estudiantes";
    }

    @GetMapping("/estudiantes/agregar")
    public String agregarEstudiante(Model model){
        Estudiante alumno = new Estudiante();
        model.addAttribute("estudiante",alumno);

        return "agregarEstudiante";
    }
}
