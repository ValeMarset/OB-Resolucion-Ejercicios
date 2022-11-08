package com.ejerciciosTemaCinco;

public class Main {
    public static void main(String[] args) {

        CocheCRUD nuevoCoche = new CocheCRUDImpl();

        nuevoCoche.save(nuevoCoche);
        nuevoCoche.findAll();
        nuevoCoche.delete(nuevoCoche);

    }
}
