package Models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;
import java.util.List;

@Entity
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String texto;

    private Date fechaDeCreación;

    @ManyToOne
    private Usuario usuario;

    public Comentario() {}

    public Comentario(String texto, Date fechaDeCreación, Usuario usuario) {
        this.texto = texto;
        this.fechaDeCreación = fechaDeCreación;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getFechaDeCreación() {
        return fechaDeCreación;
    }

    public void setFechaDeCreación(Date fechaDeCreación) {
        this.fechaDeCreación = fechaDeCreación;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}


