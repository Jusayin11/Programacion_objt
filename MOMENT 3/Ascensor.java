package com.ascensor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ascensor {

    private int pisoActual;

    private String direccion;

    private PuertaAscensor puerta;

    private List<BotonAscensor> botones;

    private List<Integer> solicitudes;

    public Ascensor(int totalPisos) {

        this.pisoActual = 1;

        this.direccion = "DETENIDO";

        this.puerta = new PuertaAscensor();

        solicitudes = new ArrayList<>();

        botones = new ArrayList<>();

        for (int i = 1; i <= totalPisos; i++) {

            botones.add(new BotonAscensor(i));
        }
    }

    public void agregarSolicitud(int piso) {

        if (!solicitudes.contains(piso)) {

            solicitudes.add(piso);

            System.out.println("Solicitud agregada al piso " + piso);
        }
    }

    public void moverAscensor() {

        Collections.sort(solicitudes);

        while (!solicitudes.isEmpty()) {

            int destino = solicitudes.get(0);

            if (destino > pisoActual) {

                subir(destino);

            } else if (destino < pisoActual) {

                bajar(destino);
            }

            llegarAPiso(destino);

            solicitudes.remove(0);
        }

        direccion = "DETENIDO";
    }

    private void subir(int destino) {

        direccion = "SUBIENDO";

        while (pisoActual < destino) {

            pisoActual++;

            System.out.println("Subiendo al piso " + pisoActual);

            esperar();
        }
    }

    private void bajar(int destino) {

        direccion = "BAJANDO";

        while (pisoActual > destino) {

            pisoActual--;

            System.out.println("Bajando al piso " + pisoActual);

            esperar();
        }
    }

    private void llegarAPiso(int piso) {

        System.out.println("Llegó al piso " + piso);

        puerta.abrir();

        esperar();

        puerta.cerrar();
    }

    private void esperar() {

        try {

            Thread.sleep(1000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public String getDireccion() {
        return direccion;
    }
}