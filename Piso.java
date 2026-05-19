package com.ascensor;

public class Piso {

    private int numero;

    private PuertaPiso puerta;
    private BotonPiso boton;

    public Piso(int numero) {

        this.numero = numero;

        this.puerta = new PuertaPiso();

        this.boton = new BotonPiso("SUBIR");
    }

    public boolean llamarAscensor(Ascensor ascensor) {

        boton.presionar();

        ascensor.agregarSolicitud(numero);

        return true;
    }

    public int getNumero() {
        return numero;
    }

    public PuertaPiso getPuerta() {
        return puerta;
    }
}
