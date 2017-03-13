
package co.edu.ims.modelo;

import java.util.Date;

public class Persona {
    
    private String nombre;
    private String nacionalidad;
    private Date fechaNacionamiento;
    
    
    public Persona(){
        
    }
    public Persona(String n, String na, Date fe){
        this.nombre = n;
        this.nacionalidad = na;
        this.fechaNacionamiento = fe;
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNacionaliodad(){
        return nacionalidad;
    }
    
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
    
    public Date getFechaNacimiento(){
        return fechaNacionamiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento){
        this.fechaNacionamiento = fechaNacimiento;
    }
    
    
    
}
