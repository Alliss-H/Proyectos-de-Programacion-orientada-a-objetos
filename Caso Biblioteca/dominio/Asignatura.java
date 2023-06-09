package ug.practicas.dominio;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {
    private int codigo;
    private String nombre;
    private String profesor;
    private String curso;

    public Asignatura(int codigo, String nombre, String profesor, String curso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = profesor;
        this.curso = curso;
    }

    List<Asignatura> asignaturas= new ArrayList<Asignatura>();


public void asignatura(){
}


public int getCodigo() {
    return codigo;
}


public void setCodigo(int codigo) {
    this.codigo = codigo;
}


public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getProfesor() {
    return profesor;
}
public void setProfesor(String profesor) {
    this.profesor = profesor;
}
public String getCurso() {
    return curso;
}
public void setCurso(String curso) {
    this.curso = curso;
}
public List<Asignatura> getAsignaturas() {
    return asignaturas;
}

public void setAsignaturas(List<Asignatura> asignaturas) {
    this.asignaturas = asignaturas;
}
}