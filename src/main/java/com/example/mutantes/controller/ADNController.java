package com.example.mutantes.controller;

import com.example.mutantes.entities.ADN;
import com.example.mutantes.services.ADNServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")//Brinda o permite el acceso a nuestra api desde distintos clientes
@RequestMapping(path = "api/v1/ADN")//Ruta de acceso a ese recurso

public class ADNController extends BaseControllerImpl<ADN, ADNServiceImpl> {



    @PostMapping("/mutant")
    public ResponseEntity<?> isMutant(@RequestBody String[] DNA){
        try{
            boolean mutante = servicio.isMutant(DNA);
            if (mutante==true){
                return ResponseEntity.status(HttpStatus.OK).body("{\"n HTTP 200-OK \": \"\"}");
            }else {
                return ResponseEntity.status(HttpStatus.FORBIDDEN).body("{\"n 403-Forbidden \": \"\"}");
            }

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(("{\"error 404 not found \": \"" +e.getMessage() + "\"}"));
        }
    }

}
