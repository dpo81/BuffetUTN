package com.example.dpo.buffetutn;

/**
 * Created by DPO on 12/7/2017.
 */

public class Usuario {
    String id;
    String nombre;
    String apellido;
    Integer dni;
    String mail;
    String contraseña;

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public String getMail() {
        return mail;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Usuario(String id, String nombre, String apellido, Integer dni, String mail, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.mail = mail;
        this.contraseña = contraseña;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        if (!id.equals(usuario.id)) return false;
        if (!nombre.equals(usuario.nombre)) return false;
        if (!apellido.equals(usuario.apellido)) return false;
        if (!dni.equals(usuario.dni)) return false;
        if (!mail.equals(usuario.mail)) return false;
        return contraseña.equals(usuario.contraseña);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + nombre.hashCode();
        result = 31 * result + apellido.hashCode();
        result = 31 * result + dni.hashCode();
        result = 31 * result + mail.hashCode();
        result = 31 * result + contraseña.hashCode();
        return result;
    }
}

