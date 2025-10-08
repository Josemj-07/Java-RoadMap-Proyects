package edu.novatech.personas;
import java.util.ArrayList;
import edu.novatech.academico.Curso;

public class Docente extends Persona {

    private String facultad;
    private double salarioBase; // se asume un salario base por hora
    private double horasDictadas;
    private ArrayList<Curso> cursosQueDicta;

    public Docente (String departamento, double salarioBase, double horasDictadas, String nombre, int documento, String email) {

        super(nombre, documento, email);
        
        if(departamento == null || salarioBase < 0 || horasDictadas < 0) throw new IllegalArgumentException("Ingrese datos válidos por favor");
        this.facultad = departamento;
        this.salarioBase = salarioBase;
        this.horasDictadas = horasDictadas;
        cursosQueDicta = new ArrayList<Curso>
        
    }

    @Override
    public String mostrarInformacion() {

        return super.mostrarInformacion() + "\n" +
        "Facultad a la que pertenece: " + this.facultad + "\n" +
        "Salario base: " + this.salarioBase + "\n" +
        "Horas de clase dictadas: " + this.horasDictadas;

    }
    
    public double calcularSalario() {
        return salarioBase * horasDictadas;
    }

    public void inscribirCurso(Curso curso) {
        if(curso == null) throw new IllegalArgumentException("Ingrese datos válidos");
        cursosQueDicta.add(curso);
    }

    public String listarCursos() {

        String cursos = "";

        for (Curso curso : cursosQueDicta) {
            cursos += curso.getNombreDelCurso() + "\n";
        }

        return cursos;

    }

}