package model;

public class Usuario {
    //Atributos
    private String nombre;
    private String contra;

    //Constructor
    public Usuario(String nombre, String contra) {
        this.nombre = nombre;
        this.contra = contra;
    }

    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
    
}
