package com.uabc.edu.mx.modelo;


import javax.persistence.*;

@Entity
@Table(name = "caja")
public class caja {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private boolean estado;
    private int idCajero;

    public caja(int id, boolean estado, int idCajero) {
        this.id = id;
        this.estado = estado;
        this.idCajero = idCajero;
    }

    public caja() {
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdCajero() {
        return idCajero;
    }

    public void setIdCajero(int idCajero) {
        this.idCajero = idCajero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
