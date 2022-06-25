package edu.ilp.ahuamani.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.ilp.ahuamani.entity.Estudiante;
import edu.ilp.ahuamani.payload.RestResponse;
import edu.ilp.ahuamani.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("estudiante")
public class EstudianteController {
    @Autowired
    private IEstudianteService estudianteService;

    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/listarEstudiantes")
    public List<Estudiante> listarEstudiante(){
        return this.estudianteService.listarEstudiante();
    }

    @PostMapping("/registrar")
    public RestResponse registrarEstudiante(@RequestBody String jsonEstudiante) throws JsonProcessingException {

        Estudiante estudiante = this.objectMapper.readValue(jsonEstudiante, Estudiante.class);
        try {
            this.estudianteService.guardarEstudiante(estudiante);
            return new RestResponse(HttpStatus.OK.value(),"El estudiante se registró correctamente",estudiante);
        }catch (Exception e) {
            e.printStackTrace();
            return new RestResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),"Lamentamos el inconveniente, vuelva mas tarde");
        }
    }

    @PutMapping("/actualizar")
    public String actualizarEstudiante(@RequestBody String jsonEstudiante) throws JsonProcessingException {

        Estudiante estudiante = this.objectMapper.readValue(jsonEstudiante, Estudiante.class);
        this.estudianteService.guardarEstudiante(estudiante);

        return "Datos del estudiante se actualizó correctamente";
    }

    @PostMapping("/eliminar/{id}")
    public String eliminarEstudiante(@PathVariable Long id){
        this.estudianteService.eliminarUnEstudiante(id);
        return "Registro de estudiante eliminado correctamente";
    }


    @GetMapping( "/buscarEstudiantePorCodigo" )
    public Estudiante buscarEstudiantePorcodigo(@RequestParam String codigo) {
        return this.estudianteService.obtenerEstudiantePorCodigo (codigo);
    }
}
