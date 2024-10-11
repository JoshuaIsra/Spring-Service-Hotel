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

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.LimpiezaModel;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.service.LimpiezaService;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.utils.CustomResponse;

@RestController
@RequestMapping("/api/v1/Limpieza")
public class LimpiezaContrller {
    @Autowired
    private LimpiezaService limpiezaService;
     @PostMapping("/registror")
    public CustomResponse registrarPersonalLimpieza(@RequestBody LimpiezaModel limpiezaModel){
        CustomResponse customResponse = new CustomResponse();
        limpiezaService.registrarPersonalLimpieza(limpiezaModel);
        customResponse.setHttpCode(HttpStatus.CREATED);
        customResponse.setCode(201);
        customResponse.setMassege("Persona de Limpieza Registrado Correctamente");
        return customResponse;
        
    }

    @GetMapping("/registros")
    public ResponseEntity  <List<LimpiezaModel>> getAllPersonalLimpieza(){
        List<LimpiezaModel> personalLimpieza = limpiezaService.obtenerPersonalLimpieza();
        if(personalLimpieza.isEmpty()){

            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        }
        return new ResponseEntity<>(personalLimpieza,HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getPersonalLimpieza(@PathVariable int id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(
                new CustomResponse(HttpStatus.OK, limpiezaService.getPersonalLimpieza(id), "Show All matches", 200)   

            );
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(
                new CustomResponse(HttpStatus.UNPROCESSABLE_ENTITY, limpiezaService.getPersonalLimpieza(id),"ERROR: "+e,422)
            );
        }
        
    }
    @PutMapping("/{id}/actualizar")
    public ResponseEntity<Object> updatePersonalLimpieza(
        @RequestBody LimpiezaModel limpiezaModel,
        @PathVariable(value = "id") int id){
        ResponseEntity<Object> responseEntity = null;
        CustomResponse customResponse = new CustomResponse();
        try {
            if (limpiezaService.getPersonalLimpieza(id)== null){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(
            new CustomResponse(HttpStatus.NO_CONTENT,
            "","This acction can´t execute, not found with id ="+id, 204)
            );
            };
            
            limpiezaService.actualizarDatosPersonalLimpieza(limpiezaModel, id);
            customResponse.setHttpCode(HttpStatus.OK);
            customResponse.setCode(200);
            customResponse.setMassege("Update Success");
            return ResponseEntity.status(HttpStatus.OK).body(customResponse);
            
        } catch (Exception e) {
            customResponse.setMassege("Error: "+ e);
            return ResponseEntity.status(HttpStatus.OK).body(customResponse);
            
        }
    
    

}

    @DeleteMapping("/{id}/borrar")
    public ResponseEntity<Object> deletelimpiezaModel(@PathVariable int id){
    ResponseEntity <Object> responseEntity = null;
    CustomResponse customResponse = new CustomResponse();
        try {
            limpiezaService.borrarPersonalLimpieza(id);
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
