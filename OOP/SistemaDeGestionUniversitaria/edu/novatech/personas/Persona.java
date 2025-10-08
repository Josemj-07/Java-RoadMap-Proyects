package edu.novatech.personas;

public class Persona {

    //atributos de Persona
    protected String nombre;
    protected int documento;
    protected String email;

    //Constructor de la clase Persona
    public Persona (String nombrePersona, int documentoPersona, String emailPersona) {

        if(nombrePersona == null || emailPersona == null) throw new IllegalArgumentException("Ingrese información válida para los datos de la persona"); 
        nombre = nombrePersona;
        documento = documentoPersona;
        email = emailPersona;
    }

    //métodos sobreescritos de la clase Objetc
    @Override 
    public String toString() {

        return "Nombre: " + nombre + "\n" +
        "Documento de identidad: " + documento;


    }

    @Override
    public boolean equals(Object object) {

        if(this == object) return true;

        if(object != null && this.getClass() == object.getClass()) {
            Persona p1 = (Persona) object;
            return this.documento == p1.documento;
        }

        return false;


    }

    //Getters y Setters adecuados para los atributos
    public String mostrarInformacion() { 

        return "Nombre: " + nombre +"\n" +
        "Documento de identidad: " + documento + "\n" +
        "Correo electrónico: " + email;


    }

    public String getNombre() {
        return nombre;
    }
    
    public String getEmail() {
        return email;
    }

    public int getDocumento() {
        return documento;
    }

    public void setEmail(String newEmail) {
        if(newEmail == null) throw new IllegalArgumentException("Ingresa datos válidos por favor");
        email = newEmail;
    }

}