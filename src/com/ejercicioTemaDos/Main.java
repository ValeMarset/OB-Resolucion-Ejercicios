package com.ejercicioTemaDos;


public class Main {
    public static void main(String[] args) {

        getPrecioMasIVAIncluido(100.0);
        getPrecioMasIVAIncluido(345.0);
        getPrecioMasIVAIncluido(457.0);


    }

    public static double getPrecioMasIVAIncluido(double precio){
        final double IVA = 22;
        double precioMasIVAIncluido = precio + IVA;
        return precioMasIVAIncluido;
    }



}
