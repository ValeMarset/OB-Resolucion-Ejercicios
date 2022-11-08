package com.ejerciciosTemaCuatro;

public class SmartPhone extends SmartDevice {

    private int cantidadCamaras;



    public SmartPhone(){

    }
    public SmartPhone(int nivelBateria, int pulgadas, String sistemaOperativo, String marca, double modelo, int cantidadCamaras){
        super(nivelBateria, pulgadas, sistemaOperativo, marca, modelo);
        this.cantidadCamaras = cantidadCamaras;

    }

    public int getCantidadCamaras() {
        return cantidadCamaras;
    }

    public void setCantidadCamaras(int cantidadCamaras) {
        this.cantidadCamaras = cantidadCamaras;
    }


}
