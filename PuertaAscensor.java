package com.ascensor;

public class PuertaAscensor extends Puerta {

    public PuertaAscensor() {
        super();
    }

    public void mantenerAbierta() {

        abierta = true;

        System.out.println("Puerta del ascensor mantenida abierta");
    }
}