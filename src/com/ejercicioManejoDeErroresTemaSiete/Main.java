package com.ejercicioManejoDeErroresTemaSiete;

public class Main {
    public static void main(String[] args) {

        DividePorCero(5);

    }

public static void DividePorCero (int A) throws ArithmeticException{

        int B = 0;

        try {
            int result =  A / B;

        } catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse " + e.getMessage());
        }
        finally {
            System.out.println("Demo del Codigo");
        }


}

}
