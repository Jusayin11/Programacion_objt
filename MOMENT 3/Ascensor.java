package com.ascensor.model;

public class Ascensor {

    private int pisoActual;

    private String direccion;

    private boolean moviendo;

    private PuertaAscensor puerta;

    // Arreglo simple
    private int[] solicitudes;

    // Contador de solicitudes
    private int cantidadSolicitudes;

    public Ascensor(int totalPisos) {

        this.pisoActual = 1;

        this.direccion = "DETENIDO";

        this.moviendo = false;

        this.puerta = new PuertaAscensor();

        // Tamaño máximo de solicitudes
        solicitudes = new int[20];

        cantidadSolicitudes = 0;
    }

    // Agregar solicitud
    public void agregarSolicitud(int piso) {

        solicitudes[cantidadSolicitudes] = piso;

        cantidadSolicitudes++;

        System.out.println("Solicitud agregada al piso " + piso);
    }

    // Movimiento principal
    public void moverAscensor() {

        for (int i = 0; i < cantidadSolicitudes; i++) {

            int destino = solicitudes[i];

            if (destino > pisoActual) {

                subir(destino);

            } else if (destino < pisoActual) {

                bajar(destino);
            }

            llegarAPiso(destino);
        }

        direccion = "DETENIDO";
    }

    // Subir
    private void subir(int destino) {

        direccion = "SUBIENDO";

        while (pisoActual < destino) {

            pisoActual++;

            System.out.println("Subiendo al piso " + pisoActual);

            esperar();
        }
    }

    // Bajar
    private void bajar(int destino) {

        direccion = "BAJANDO";

        while (pisoActual > destino) {

            pisoActual--;

            System.out.println("Bajando al piso " + pisoActual);

            esperar();
        }
    }

    // Llegada al piso
    private void llegarAPiso(int piso) {

        System.out.println("Llegó al piso " + piso);

        puerta.abrir();

        esperar();

        puerta.cerrar();
    }

    // Simular tiempo
    private void esperar() {

        try {

            Thread.sleep(1000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    // Getter
    public int getPisoActual() {
        return pisoActual;
    }

    public String getDireccion() {
        return direccion;
    }
}
