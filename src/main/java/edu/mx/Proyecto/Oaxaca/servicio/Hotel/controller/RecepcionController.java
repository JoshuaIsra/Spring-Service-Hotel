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

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.PersonaModel;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.RecepcionModel;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.service.RecepcionService;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.utils.CustomResponse;

@RestController
@RequestMapping("/api/v1/Recepcion")
public class RecepcionController {
    @Autowired 
    private RecepcionService recepcionService;

     @PostMapping("/registror")
    public CustomResponse registrarPersona(@RequestBody RecepcionModel recepcionModel){
        CustomResponse customResponse = new CustomResponse();
        recepcionService.registrarPersonalRecpcion(recepcionModel);
        customResponse.setHttpCode(HttpStatus.CREATED);
        customResponse.setCode(201);
        customResponse.setMassege("Persona de Recepcion Registrado Correctamente");
        return customResponse;
        
    }

    @GetMapping("/registros")
    public ResponseEntity  <List<PersonaModel>> getAllPersonas(){
        List<PersonaModel> recepcion = recepcionService.obtenerPersonalRecpcion();
        if(recepcion.isEmpty()){

            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        }
        return new ResponseEntity<>(recepcion,HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getPersona(@PathVariable int id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(
                new CustomResponse(HttpStatus.OK, recepcionService.getPersonalRecpcion(id), "Show All matches", 200)   

            );
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(
                new CustomResponse(HttpStatus.UNPROCESSABLE_ENTITY, recepcionService.getPersonalRecpcion(id),"ERROR: "+e,422)
            );
        }
        
    }
    @PutMapping("/{id}/actualizar")
    public ResponseEntity<Object> updatePersona(
        @RequestBody RecepcionModel recepcionModel,
        @PathVariable(value = "id") int id){
        ResponseEntity<Object> responseEntity = null;
        CustomResponse customResponse = new CustomResponse();
        try {
            if (recepcionService.getPersonalRecpcion(id)== null){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(
            new CustomResponse(HttpStatus.NO_CONTENT,
            "","This acction can´t execute, not found with id ="+id, 204)
            );
            };
            
            recepcionService.actualizarDatosPersonalRecpcion(recepcionModel, id);
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
    public ResponseEntity<Object> deletePersona(@PathVariable int id){
    ResponseEntity <Object> responseEntity = null;
    CustomResponse customResponse = new CustomResponse();
        try {
            recepcionService.borrarPersonalRecpcion(id);
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
