package com.ejerciciosTemaCuatro;

public class Main {
    public static void main(String[] args) {

        SmartDevice reloj2 = new SmartWatch();

        SmartDevice celular2 = new SmartPhone();

       SmartWatch reloj = new SmartWatch();
       reloj.setNivelBateria(50);
       reloj.setPulgadas(3);
       reloj.setSistemaOperativo("Android");
       reloj.setMarca("Aimion");
       reloj.setModelo(3.0);
       reloj.setContestaLlamadas(true);
       reloj.setPantalla(true);

        System.out.println(" \n\n Caracteristicas de este Reloj Inteligente: \n\n Marca: " + reloj.getMarca() + "\n Modelo: " + reloj.getModelo() +
                "\n Sistema Operativo: " + reloj.getSistemaOperativo() + "\n Pulgadas: " + reloj.getPulgadas() + "\n Nivel de Batería: "
                + reloj.getNivelBateria() + "\n ¿Contesta Llamadas?: " + reloj.isContestaLlamadas() + "\n ¿Tiene Pantalla?: " + reloj.isPantalla());


        SmartPhone celular = new SmartPhone();
        celular.setNivelBateria(100);
        celular.setPulgadas(9);
        celular.setSistemaOperativo("Android");
        celular.setMarca("Samsung");
        celular.setModelo(2.0);
        celular.setCantidadCamaras(3);

        System.out.println("\n\n Caracteristicas de este Celular: \n\n Marca: " + celular.getMarca() + " \n Modelo: " + celular.getModelo() +
                "\n Sistema Operativo: " + celular.getSistemaOperativo() + "\n Pulgadas: " + celular.getPulgadas() + "\n Nivel de Bateria: "
                + celular.getNivelBateria() + "\n ¿Cuantas camaras tiene?: " + celular.getCantidadCamaras());


    }
}
