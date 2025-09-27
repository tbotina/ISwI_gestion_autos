package com.isi.gestion_autos.Models;

public class Electrico extends Vehiculo implements IAutonomoAvanzado {
    private double capacidadBateriaKWh;
    private double cargaActualKWh;

    public Electrico(String marca, String modelo, int anio, double velMax, double capacidadBateriaKWh) {
        super(marca, modelo, anio, velMax);
        this.capacidadBateriaKWh = capacidadBateriaKWh;
        this.cargaActualKWh = 0; // inicia descargado
    }

    public double getCapacidadBateriaKWh() {
        return capacidadBateriaKWh;
    }

    public double getCargaActualKWh() {
        return cargaActualKWh;
    }

    public void cargarBateria(double kWh) {
        if (kWh > 0) {
            cargaActualKWh += kWh;
            if (cargaActualKWh > capacidadBateriaKWh) {
                cargaActualKWh = capacidadBateriaKWh;
            }
            System.out.println("La batería se cargó a " + cargaActualKWh + " kWh");
        } else {
            System.out.println("La carga debe ser positiva.");
        }
    }

    public void conducir() {
        System.out.println("El vehículo eléctrico está siendo conducido.");
    }

    public void pilotoAutomatico() {
        System.out.println("El vehículo eléctrico activó el piloto automático.");
    }

    @Override
    public void asistenciaEmergencias() {
        System.out.println("El vehículo eléctrico activó la asistencia en emergencias.");
    }

    @Override
    public String getInformacion() {
        return super.getInformacion()
                + "\nCapacidad de batería: " + capacidadBateriaKWh + " kWh"
                + "\nCarga actual: " + cargaActualKWh + " kWh";
    }
}
