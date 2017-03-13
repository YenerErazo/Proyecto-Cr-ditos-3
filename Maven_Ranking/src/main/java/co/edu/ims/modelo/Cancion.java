package co.edu.ims.modelo;

public class Cancion {
    
    private String nombre;
    private int anio;
    private String autor;
    
    public Cancion(){
        
    }
    
    public Cancion(String n, int a, String au){
        this.nombre = n;
        this.anio = a;
        this.autor = au;
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getAnio(){
        return anio;
    }
    
    public void setAnio(int anio){
        this.anio = anio;
    }
    
    public String getAutor(){
       return autor;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
}
