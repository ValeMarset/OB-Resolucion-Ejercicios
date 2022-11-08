package com.ejerciciosTemaCuatro;

public class SmartWatch extends SmartDevice {

    private boolean contestaLlamadas;
    private boolean pantalla;

    public SmartWatch(){

    }
    public SmartWatch(int nivelBateria, int pulgadas, String sistemaOperativo, String marca, double modelo, boolean contestaLlamadas, boolean pantalla){
        super(nivelBateria, pulgadas, sistemaOperativo, marca, modelo);
        this.contestaLlamadas = contestaLlamadas;
        this.pantalla = pantalla;

    }

    public boolean isContestaLlamadas() {
        return contestaLlamadas;
    }

    public void setContestaLlamadas(boolean contestaLlamadas) {
        this.contestaLlamadas = contestaLlamadas;
    }

    public boolean isPantalla() {
        return pantalla;
    }

    public void setPantalla(boolean pantalla) {
        this.pantalla = pantalla;
    }
}
