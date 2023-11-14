package ar.org.centro8.escuela.entities;

import ar.org.centro8.escuela.enums.Dia;
import ar.org.centro8.escuela.enums.Turno;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;
    private String titulo;
    private String profesor;
    private Dia dia;
    private Turno turno;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getProfesor() {
        return profesor;
    }
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    public Dia getDia() {
        return dia;
    }
    public void setDia(Dia dia) {
        this.dia = dia;
    }
    public Turno getTurno() {
        return turno;
    }
    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
