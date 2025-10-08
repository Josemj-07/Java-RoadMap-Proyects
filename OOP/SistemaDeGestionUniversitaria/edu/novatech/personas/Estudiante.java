package edu.novatech.personas;
import edu.novatech.academico.Curso;
import java.util.ArrayList;

public class Estudiante extends Persona {
    
    private int idEstudiante;
    private String programa;
    private float promedio;
    private ArrayList<Curso> cursos;

    public Estudiante(int idEstudiante, String programa, float promedio, String nombre, String email, int documento ) {
        
        super(nombre, documento, email);
        if(programa == null || promedio < 0 || idEstudiante < 0) throw new IllegalArgumentException("Ingresa datos válidos");
        this.idEstudiante = idEstudiante;
        this.programa = programa;
        this.promedio = promedio;  
        cursos = new ArrayList<Curso>();

    }

    @Override
    public String mostrarInformacion() {

        return super.mostrarInformacion() + "\n" +
        "Id del estudiante: " + this.idEstudiante + "\n" +
        "Programa: " + this.programa + "\n" +
        "Promedio: " + this.promedio;

    }

    public void actualizarPromedio(double nuevaNota) {
        if(nuevaNota < 0) throw new IllegalArgumentException("Ingresa un valor válido para la nota");
        promedio = (float)(promedio + nuevaNota)/2;
    }

    public int getIdEstudiante() { 
        return this.idEstudiante;
    }
    
    public String getPrograma() {
        return this.programa;
    }
    
    public float getPromedio() {
        return this.promedio;
    }
    
    public void setPrograma(String nuevoPrograma) {
        if(nuevoPrograma == null) throw new IllegalArgumentException("Ingresa un valor válido");
        this.programa = nuevoPrograma;
    }

    public void inscribirCurso(Curso curso) {
        if(curso == null) throw new IllegalArgumentException("Ingrese datos válidos");
        cursos.add(curso);
    }

    public String listarCursos() {

        String cursos = "";

        for(int i = 0; i < this.cursos.size(); i++) {

            cursos += this.cursos.get(i).getNombreDelCurso() +" \t";
        }

        return cursos;
        
    }

}