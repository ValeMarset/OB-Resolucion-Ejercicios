package com.ejerciciosTemaCuatro;

public class SmartDevice {

    private int nivelBateria;    
    private int pulgadas;
    private String sistemaOperativo;
    private String marca;
    private double modelo;

    public SmartDevice() {

    }


    public SmartDevice(int nivelBateria, int pulgadas, String sistemaOperativo, String marca, double modelo) {
        this.nivelBateria = nivelBateria;
        this.pulgadas = pulgadas;
        this.sistemaOperativo = sistemaOperativo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getModelo() {
        return modelo;
    }

    public void setModelo(double modelo) {
        this.modelo = modelo;
    }
}
