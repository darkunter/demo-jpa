package com.modyo.desa.demojpa.jpa.model;

import javax.persistence.*;

@Entity
@Table(name = "modyo_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private boolean operativo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isOperativo() {
        return operativo;
    }

    public void setOperativo(boolean operativo) {
        this.operativo = operativo;
    }
}
