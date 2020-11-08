package com.example.descuarentenados;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String nombre, apellido, genero, user, password;

    public Usuario(String nombre, String apellido, String genero, String user, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.user = user;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
