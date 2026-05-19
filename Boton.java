package com.ascensor;

public class Boton {

    protected boolean activo;
    protected boolean luzEncendida;

    public Boton() {
        this.activo = false;
        this.luzEncendida = false;
    }

    public void presionar() {

        activo = true;
        luzEncendida = true;

        System.out.println("Botón presionado");
    }

    public void apagarLuz() {
        luzEncendida = false;
    }

    public boolean isActivo() {
        return activo;
    }

    public boolean isLuzEncendida() {
        return luzEncendida;
    }
}