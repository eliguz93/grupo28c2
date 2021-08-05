package model;

public class Usuario {
    private String nombre; // Atributos
    private char estado;

    public char getEstado() {
        return estado;
    }

    public String getNombre() {
        return nombre;
    }
    public void setEstado(char estado) {
        this.estado = estado;  // Esta clase usuario  
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre; //atributo clase llama al parametro
    }

}
