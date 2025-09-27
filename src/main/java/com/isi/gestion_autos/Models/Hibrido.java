package com.isi.gestion_autos.Models;

public class Hibrido extends Vehiculo implements IAutonomo {
    private double eficienciaEnergeticaKmL; // km por litro
    private String modo; // puede ser "Electrico" o "Combustion"

    public Hibrido(String marca, String modelo, int anio, double velMax, double eficienciaEnergeticaKmL) {
        super(marca, modelo, anio, velMax);
        this.eficienciaEnergeticaKmL = eficienciaEnergeticaKmL;
        this.modo = "Electrico"; // por defecto arranca en eléctrico
    }

    public double getEficienciaEnergeticaKmL() {
        return eficienciaEnergeticaKmL;
    }

    public void setEficienciaEnergeticaKmL(double eficienciaEnergeticaKmL) {
        this.eficienciaEnergeticaKmL = eficienciaEnergeticaKmL;
    }

    public String getModo() {
        return modo;
    }

    public void cambiarModo(String nuevoModo) {
        if (nuevoModo.equalsIgnoreCase("Electrico") || nuevoModo.equalsIgnoreCase("Combustion")) {
            this.modo = nuevoModo;
            System.out.println("El vehículo híbrido cambió a modo: " + this.modo);
        } else {
            System.out.println("Modo no válido. Use 'Electrico' o 'Combustion'.");
        }
    }

    @Override
    public void conducir() {
        System.out.println("El híbrido está siendo conducido en modo " + modo + ".");
    }

    @Override
    public void pilotoAutomatico() {
        System.out.println("El híbrido activó el piloto automático en modo " + modo + ".");
    }

    @Override
    public String getInformacion() {
        return super.getInformacion() + "\nEficiencia energética: " + eficienciaEnergeticaKmL + " km/L" + "\nModo actual: " + modo;
    }
}

