package edu.mx.Proyecto.Oaxaca.servicio.Hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.SuiteModel;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.service.SuiteService;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.utils.CustomResponse;

@RestController
@RequestMapping("/api/v1/Suite")
public class SuiteController {
    @Autowired 
    private SuiteService suiteService;

    @PostMapping("/registror")
    public CustomResponse registrarSuite(@RequestBody SuiteModel suiteModel){
        CustomResponse customResponse = new CustomResponse();
        suiteService.registrarSuite(suiteModel);
        customResponse.setHttpCode(HttpStatus.CREATED);
        customResponse.setCode(201);
        customResponse.setMassege("Suite Registrado Correctamente");
        return customResponse;
        
    }

    @GetMapping("/registros")
    public ResponseEntity <List<SuiteModel>> getAllSuite(){
        List<SuiteModel> suite = suiteService.obtenerSuite();
        if(suite.isEmpty()){

            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        }
        return new ResponseEntity<>(suite,HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getSuite(@PathVariable int id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(
                new CustomResponse(HttpStatus.OK, suiteService.getSuite(id), "Show All matches", 200)   

            );
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(
                new CustomResponse(HttpStatus.UNPROCESSABLE_ENTITY, suiteService.getSuite(id),"ERROR: "+e,422)
            );
        }
    }
    @PutMapping("/{id}/actualizar")
    public ResponseEntity<Object> updateSuite(
        @RequestBody SuiteModel suiteModel,
        @PathVariable(value = "id") int id) {
        CustomResponse customResponse = new CustomResponse();
        try {
            if (suiteService.getSuite(id) == null) {
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body(
                    new CustomResponse(HttpStatus.NO_CONTENT,
                    "", "This action can't execute, not found with id =" + id, 204)
                );
            }

            suiteService.actualizarDatosSuite(suiteModel, id);
            customResponse.setHttpCode(HttpStatus.OK);
            customResponse.setCode(200);
            customResponse.setMassege("Update Success");
            return ResponseEntity.status(HttpStatus.OK).body(customResponse);

        } catch (Exception e) {
            customResponse.setMassege("Error: " + e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(customResponse);
        }
    }
    @DeleteMapping("/{id}/borrar")
    public ResponseEntity<Object> deleteSuiteModel(@PathVariable int id) {
        CustomResponse customResponse = new CustomResponse();
        try {
            suiteService.borrarSuite(id);
            customResponse.setHttpCode(HttpStatus.OK);
            customResponse.setCode(200);
            customResponse.setMassege("Delete Success");
            return ResponseEntity.status(HttpStatus.OK).body(customResponse);

        } catch (Exception e) {
            customResponse.setMassege(e.getMessage());
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(customResponse);
        }
    }
}
