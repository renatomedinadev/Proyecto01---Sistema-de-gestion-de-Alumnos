package com.lta.sistemapagos.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lta.sistemapagos.entities.Estudiante;
import com.lta.sistemapagos.entities.Pago;
import com.lta.sistemapagos.enums.PagoStatus;
import com.lta.sistemapagos.repository.EstudianteRepository;
import com.lta.sistemapagos.repository.PagoRepository;
import com.lta.sistemapagos.services.PagoService;

@RestController
@CrossOrigin("*")
public class PagoController {
    
    @Autowired
    private EstudianteRepository estudianteRepository;

    @Autowired
    private PagoRepository pagoRepository;

    @Autowired
    private PagoService pagoService;

    @GetMapping("/estudiantes")
    public List<Estudiante> listarEstudiantes(){
        return estudianteRepository.findAll();
    }

    @GetMapping("/estudiantes/{codigo}")
    public Estudiante listarEstudiantePorCodigo(@PathVariable String codigo){
        return estudianteRepository.findByCodigo(codigo);
    }

    @GetMapping("/estudiantesPorPrograma")
    public List<Estudiante> listarEstudiantesPorPrograma(@RequestParam String programaId){
        return estudianteRepository.findByProgramaId(programaId);
    }

    @GetMapping("/pagos")
    public List<Pago> listarPagos(){
        return pagoRepository.findAll();
    }

    @GetMapping("/pagos/{id}")
    public Pago listarPagoPorId(@PathVariable Long id){
        return pagoRepository.findById(id).get();
    }

    @GetMapping("/estudiantes/{codigo}/pagos)")
    public List<Pago> listarPagosPorCodigoEstudiante(@PathVariable String codigo){
        return pagoRepository.findByEstudianteCodigo(codigo);
    }

    @GetMapping("/pagosPorStatus")
    public List<Pago> listarPagosPorStatus(@RequestParam PagoStatus status){
        return pagoRepository.findByStatus(status);
    }

    @
    public Pago actualizarStatusDePago(@RequestParam PagoStatus status,@PathVariable Long pagoId){
        
    }
}

