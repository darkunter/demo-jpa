package com.modyo.desa.demojpa.controller.respones;

import com.modyo.desa.demojpa.jpa.model.User;

public class UserDTO {

    private String nombre;
    private boolean operativo;

    public UserDTO() {
    }

    public UserDTO(User user) {
        this.nombre = user.getNombre();
        this.operativo = user.isOperativo();
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
