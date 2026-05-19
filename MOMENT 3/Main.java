package com.ascensor;

public class Main {

    public static void main(String[] args) {

        Ascensor ascensor = new Ascensor(10);

        Piso piso3 = new Piso(3);

        Piso piso7 = new Piso(7);

        piso3.llamarAscensor(ascensor);

        piso7.llamarAscensor(ascensor);

        ascensor.moverAscensor();
    }
}