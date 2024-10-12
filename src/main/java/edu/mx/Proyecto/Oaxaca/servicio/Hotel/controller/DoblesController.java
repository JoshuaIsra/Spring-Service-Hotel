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

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.DoblesModel;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.service.DoblesService;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.utils.CustomResponse;

@RestController
@RequestMapping("/api/v1/Dobles")
public class DoblesController {
    @Autowired
    private DoblesService doblesService;
    
    @PostMapping("/registrar")
    public ResponseEntity<Object> registrarDobles(@RequestBody DoblesModel doblesModel) {
        CustomResponse customResponse = new CustomResponse();
        try {
            doblesService.registrarDobles(doblesModel);
            customResponse.setHttpCode(HttpStatus.CREATED);
            customResponse.setCode(201);
            customResponse.setMassege("Registro exitoso");
            return ResponseEntity.status(HttpStatus.CREATED).body(customResponse);
        } catch (Exception e) {
            customResponse.setMassege("Error: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(customResponse);
        }
    }
    
    @GetMapping("/registros")
    public ResponseEntity<List<DoblesModel>> getAllDobles() {
        List<DoblesModel> dobles = doblesService.obtenerDobles();
        if (dobles.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(dobles, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Object> getDobles(@PathVariable int id) {
    try {
        return ResponseEntity.status(HttpStatus.OK).body(
            new CustomResponse(HttpStatus.OK, doblesService.getDobles(id), "Show All matches", 200)
        );
    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(
            new CustomResponse(HttpStatus.UNPROCESSABLE_ENTITY, doblesService.getDobles(id), "ERROR: " + e, 422)
            );
        }
    }
    @PutMapping("/{id}/actualizar")
public ResponseEntity<Object> updateDobles(
    @RequestBody DoblesModel doblesModel,
    @PathVariable(value = "id") int id) {
    CustomResponse customResponse = new CustomResponse();
    try {
        if (doblesService.getDobles(id) == null) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(
                new CustomResponse(HttpStatus.NO_CONTENT,
                "", "This action can't execute, not found with id =" + id, 204)
            );
        }

        doblesService.actualizarDatosDobles(doblesModel, id);
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
public ResponseEntity<Object> deleteDoblesModel(@PathVariable int id) {
    CustomResponse customResponse = new CustomResponse();
    try {
        doblesService.borrarDobles(id);
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
