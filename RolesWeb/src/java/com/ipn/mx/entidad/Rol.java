/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.entidad;

import java.io.Serializable;

/**
 *
 * @author darkmac
 */
public class Rol
        implements Serializable {
    private int id;
    private String nombre;

    public Rol() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Rol{" + "id=" + id + ", nombre=" + nombre + '}';
    }

    
    
    
    
}
