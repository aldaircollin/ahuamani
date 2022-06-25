package edu.ilp.ahuamani.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.ilp.ahuamani.entity.Asignatura;
import edu.ilp.ahuamani.payload.RestResponse;
import edu.ilp.ahuamani.service.IAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("asignatura")
public class AsignaturaController {

    @Autowired
    private IAsignaturaService asignaturaService;

    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/lista")
    public RestResponse listarAsignatura(){
        List<Asignatura> asignaturaList = this.asignaturaService.listarAsignatura();
        try{
            if (asignaturaList.isEmpty()){
                return new RestResponse(HttpStatus.NO_CONTENT.value(),"No se encontraron registros");
            }else {
                return new RestResponse(HttpStatus.OK.value(),"Registro de las Asignaturas ubicados",asignaturaList);
            }
        }catch (Exception e){
            e.printStackTrace();
            return new RestResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),"Lamentamos el inconveniente, vuelva mas tarde");
        }
    }

    @PostMapping("/registrar")
    public RestResponse registrarAsignatura(@RequestBody String jsonAsignatura) throws JsonProcessingException {

        Asignatura asignatura = this.objectMapper.readValue(jsonAsignatura, Asignatura.class);
        try {
            this.asignaturaService.guardarAsignatura(asignatura);
            return new RestResponse(HttpStatus.OK.value(),"Registró correctamente",asignatura);
        }catch (Exception e) {
            e.printStackTrace();
            return new RestResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),"Lamentamos el inconveniente, vuelva mas tarde");
        }
    }
}
