package com.isi.gestion_autos.Models;

public class Combustion extends Vehiculo implements IConducible {
    // Atributo propio
    private double capacidadTanqueL;
    private double nivelCombustibleL;

    // Constructor
    public Combustion(String marca, String modelo, int anio, double velMax, double capacidadTanqueL) {
        super(marca, modelo, anio, velMax);
        this.capacidadTanqueL = capacidadTanqueL;
        this.nivelCombustibleL = 0; // inicia vacío
    }

    public void repostar(double litros) {
        if (litros > 0) {
            nivelCombustibleL += litros;
            if (nivelCombustibleL > capacidadTanqueL) {
                nivelCombustibleL = capacidadTanqueL;
            }
            System.out.println("Se repostaron " + litros + " L. Combustible actual: " + nivelCombustibleL + " L");
        } else {
            System.out.println("La cantidad a repostar debe ser positiva.");
        }
    }

    @Override
    public void conducir() {
        if (nivelCombustibleL > 0) {
            System.out.println("El vehículo de combustión está siendo conducido.");
        } else {
            System.out.println("No se puede conducir, tanque vacío.");
        }
    }

    // Sobrescribir getInformacion
    @Override
    public String getInformacion() {
        return super.getInformacion()
                + "\nCapacidad del tanque: " + capacidadTanqueL + " L"
                + "\nNivel actual: " + nivelCombustibleL + " L";
    }

    // Getters y setters
    public double getCapacidadTanqueL() {
        return capacidadTanqueL;
    }

    public double getNivelCombustibleL() {
        return nivelCombustibleL;
    }
}

