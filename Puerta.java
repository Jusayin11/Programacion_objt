package com.ascensor;

public class Puerta {

    protected boolean abierta;
    protected boolean obstaculo;

    public Puerta() {
        abierta = false;
        obstaculo = false;
    }

    public void abrir() {

        abierta = true;

        System.out.println("Puerta abierta");
    }

    public void cerrar() {

        if (!obstaculo) {

            abierta = false;

            System.out.println("Puerta cerrada");

        } else {

            System.out.println("No se puede cerrar. Hay obstáculo.");
        }
    }

    public void detectarObstaculo(boolean obstaculo) {
        this.obstaculo = obstaculo;
    }

    public boolean isAbierta() {
        return abierta;
    }
}