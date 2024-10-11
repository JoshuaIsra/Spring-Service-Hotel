 package edu.mx.Proyecto.Oaxaca.servicio.Hotel.utils;

import org.springframework.http.HttpStatus;

public class CustomResponse {
    
    private HttpStatus httpCode;
    private Object data;
    private Object massege;
    private int code;
    
    public CustomResponse(){
    
    
    }

    public CustomResponse(HttpStatus hhtpCode, Object data, Object massege, int code) {
        this.httpCode = hhtpCode;
        this.data = data;
        this.massege = massege;
        this.code = code;
    }
    
    

    public HttpStatus getHhtpCode() {
        return httpCode;
    }

    public Object getData() {
        return data;
    }

    public Object getMassege() {
        return massege;
    }

    public int getCode() {
        return code;
    }

    public void setHttpCode(HttpStatus hhtpCode) {
        this.httpCode = hhtpCode;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setMassege(Object massege) {
        this.massege = massege;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    
}
