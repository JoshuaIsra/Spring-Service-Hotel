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

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.FacturaModel;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.service.FacturaService;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.utils.CustomResponse;

@RestController
@RequestMapping("/api/v1/Factura")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;
    
    @PostMapping("/registror")
    public CustomResponse registrarFactura(@RequestBody FacturaModel facturaModel){
        CustomResponse customResponse = new CustomResponse();
        facturaService.registrarFactura(facturaModel);
        customResponse.setHttpCode(HttpStatus.CREATED);
        customResponse.setCode(201);
        customResponse.setMassege("Factura Registrada Correctamente");
        return customResponse;
    }

        @GetMapping("/registros")
    public ResponseEntity<List<FacturaModel>> getAllFacturas(){
        List<FacturaModel> facturas = facturaService.obtenerFactura();
        if(facturas.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(facturas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getFactura(@PathVariable int id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(
                new CustomResponse(HttpStatus.OK, facturaService.getFactura(id), "Show All matches", 200)
            );
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(
                new CustomResponse(HttpStatus.UNPROCESSABLE_ENTITY, facturaService.getFactura(id), "ERROR: " + e, 422)
            );
        }
    }


     @PutMapping("/{id}/actualizar")
    public ResponseEntity<Object> updateFactura(
        @RequestBody FacturaModel facturaModel,
        @PathVariable(value = "id") int id){
        ResponseEntity<Object> responseEntity = null;
        CustomResponse customResponse = new CustomResponse();
        try {
            if (facturaService.getFactura(id) == null){
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body(
                    new CustomResponse(HttpStatus.NO_CONTENT, "", "This action can't execute, not found with id = " + id, 204)
                );
            }
            facturaService.actualizarDatosFactura(facturaModel, id);
            customResponse.setHttpCode(HttpStatus.OK);
            customResponse.setCode(200);
            customResponse.setMassege("Update Success");
            return ResponseEntity.status(HttpStatus.OK).body(customResponse);
        } catch (Exception e) {
            customResponse.setMassege("Error: " + e);
            return ResponseEntity.status(HttpStatus.OK).body(customResponse);
        }
    }

     @DeleteMapping("/{id}/borrar")
    public ResponseEntity<Object> deleteFactura(@PathVariable int id){
        ResponseEntity<Object> responseEntity = null;
        CustomResponse customResponse = new CustomResponse();
        try {
            facturaService.borrarFactura(id);
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
