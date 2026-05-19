package com.ascensor;

public class BotonPiso extends Boton {

    private String direccion;

    public BotonPiso(String direccion) {
        super();
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }
}