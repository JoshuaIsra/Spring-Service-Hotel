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

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.IndividualModel;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.service.IndividualService;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.utils.CustomResponse;

@RestController
@RequestMapping("/api/v1/Individual")
public class IndividualController {
    @Autowired
    private IndividualService individualService;
    
    @PostMapping("/registror")
    public CustomResponse registrarIndividual(@RequestBody IndividualModel individualModel){
        CustomResponse customResponse = new CustomResponse();
        individualService.registrarIndividual(individualModel);
        customResponse.setHttpCode(HttpStatus.CREATED);
        customResponse.setCode(201);
        customResponse.setMassege("Persona Individual Registrado Correctamente");
        return customResponse;
        
    }

    @GetMapping("/registros")
    public ResponseEntity <List<IndividualModel>> getAllIndividual(){
        List<IndividualModel> individual = individualService.obtenerIndividual();
        if(individual.isEmpty()){

            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        }
        return new ResponseEntity<>(individual,HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getIndividual(@PathVariable int id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(
                new CustomResponse(HttpStatus.OK, individualService.getIndividual(id), "Show All matches", 200)   

            );
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(
                new CustomResponse(HttpStatus.UNPROCESSABLE_ENTITY, individualService.getIndividual(id),"ERROR: "+e,422)
            );
        }
    }
    @PutMapping("/{id}/actualizar")
public ResponseEntity<Object> updateIndividual(
    @RequestBody IndividualModel individualModel,
    @PathVariable(value = "id") int id) {
    CustomResponse customResponse = new CustomResponse();
    try {
        if (individualService.getIndividual(id) == null) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(
                new CustomResponse(HttpStatus.NO_CONTENT,
                "", "This action can't execute, not found with id =" + id, 204)
            );
        }

        individualService.actualizarDatosIndividual(individualModel, id);
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
public ResponseEntity<Object> deleteIndividualModel(@PathVariable int id) {
    CustomResponse customResponse = new CustomResponse();
    try {
        individualService.borrarIndividual(id);
        customResponse.setHttpCode(HttpStatus.OK);
        customResponse.setCode(200);
        customResponse.setMassege("Delete Success");;
        return ResponseEntity.status(HttpStatus.OK).body(customResponse);

    } catch (Exception e) {
        customResponse.setMassege(e.getMessage());
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(customResponse);
    }
}


    
}
