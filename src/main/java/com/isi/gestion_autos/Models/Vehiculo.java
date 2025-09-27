package com.isi.gestion_autos.Models;

import org.springframework.data.annotation.Id;

public abstract class Vehiculo {
    @Id
    private String id;

    protected String marca;
    protected String modelo;
    protected int anio;
    protected double velMax;
    protected double velActual;

    public Vehiculo(String marca, String modelo, int anio, double velMax) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velMax = velMax;
        this.velActual = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public double getVelMax() {
        return velMax;
    }

    public void setVelMax(Float velMax) {
        this.velMax = velMax;
    }
    
    public void acelerar(double delta) {
        if (delta > 0) {
            velActual += delta;
            if (velActual > velMax) {
                velActual = velMax;
            }
            System.out.println(modelo + " aceleró a " + velActual + " km/h");
        } else {
            System.out.println("El incremento debe ser positivo");
        }
    }

    public void frenar(double delta) {
        if (delta > 0) {
            velActual -= delta;
            if (velActual < 0) {
                velActual = 0;
            }
            System.out.println(modelo + " frenó a " + velActual + " km/h");
        } else {
            System.out.println("La reducción debe ser positiva");
        }
    }

    public String getInformacion() {
        return "Vehículo: " + marca + " " + modelo + " (" + anio + ")"
                + "\nVelocidad Máxima: " + velMax + " km/h"
                + "\nVelocidad Actual: " + velActual + " km/h";
    }

}
