package ar.org.centro8.escuela.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.org.centro8.escuela.entities.Alumno;
import ar.org.centro8.escuela.entities.Curso;
import ar.org.centro8.escuela.repositories.AlumnoRepository;
import ar.org.centro8.escuela.repositories.CursoRepository;

@Controller
public class ControllerWeb {
    @Autowired
    private CursoRepository cr;
    private AlumnoRepository ar;

    private String mensajecr = "Ingrese un nuevo curso!";
    private String mensajear = "Ingrese un nuevo alumno!";

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/cursos")
    public String cursos(
        @RequestParam(name = "buscarTitulo", required = false, defaultValue = "") String buscarTitulo,
            Model model) {
        model.addAttribute("mensajeCliente", mensajecr);
        model.addAttribute("curso", new Curso());
                
        return "cursos";
    }

    @GetMapping("/alumnos")
    public String alumnos(
        @RequestParam(name = "buscarApellido", required = false, defaultValue = "") String buscarApellido,
            Model model) {
        model.addAttribute("mensajeCliente", mensajear);
        model.addAttribute("curso", new Alumno());
                
        return "alumnos";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Curso curso) {
        cr.save(curso);
        if (curso.getId() > 0) {
            mensajecr = "Se guardo el curso con id: " + curso.getId() + "!";
        } else {
            mensajecr = "No se pudo guardar el curso";
        }
        return "redirect:cursos";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Alumno alumno) {
        ar.save(alumno);
        if (alumno.getId()>0) {
            mensajear = "Se guardo el alumno con id: " + alumno.getId() + "!";
            
        } else {
            mensajear = "No se pudo guardar el alumno";
        }
        return "redirect:alumnos";
    }
}
