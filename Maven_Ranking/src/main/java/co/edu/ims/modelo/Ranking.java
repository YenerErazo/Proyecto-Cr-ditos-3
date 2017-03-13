
package co.edu.ims.modelo;

public class Ranking {
    
    private String nombre;
    private int posicion;
    
    
    public Ranking(){
        
    }
    public Ranking(String n, String p){
        this.nombre = n;
        
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getPosicion(){
        return posicion;
    }
    
    public void setPosicion(int posicion){
        this.posicion = posicion;
    }
    
}
