package com.ejerciciosTiposDeDatosAvanzadosTemaSeis;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        //Ejercicio: mostrar cadena en reversa
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el texto que quiera revertir: ");
        String textoPorConsola = scanner.nextLine();


        Reverse miCadenaAlRevez = new Reverse();
        miCadenaAlRevez.setTexto(textoPorConsola);

        miCadenaAlRevez.reverse(miCadenaAlRevez.getTexto());


        //Ejercicio: Array unidimencional

        String array [] = {"Hola", "como", "estas"};

        for (String letra : array){

            System.out.println(letra);

        }
        System.out.println("\n\n");


        //Ejercicio: Array bidimensional

        int [][]  arrayBidimensional = {{1,2,3}, {4,5,6}, {7,8,9}};
       // int arrayBidimencional[][] = new int [4][4];
        for (int i = 0; i < arrayBidimensional.length;i++) {

            for (int j = 0; j < arrayBidimensional[i].length;j++){

                System.out.println("Valor de la fila " + i + " columna " + j + " es: " + arrayBidimensional[i][j]);

            }

        }

        System.out.println("\n\n");

        //Ejercicio: Vector

        Vector<Integer> miVector = new Vector<>(); //dimension por defecto: 10.

        miVector.add(1);
        miVector.add(2);
        miVector.add(3);
        miVector.add(4);
        miVector.add(5);

        System.out.println("Mi vector contiene los siguientes elementos: " + miVector);

        miVector.remove(1);
        miVector.remove(1);

        System.out.println("Eh eliminado el Segundo y Tercer elemento, los elementos de mi vector ahora son: " + miVector);

        System.out.println("\n\n");


        // 4- Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

        //Se desbordaria la capacidad del vector y utilizaría demasiado espacio en memoria de la pc realentizandola


        //Ejercicio: Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

        ArrayList<String> puntosCardinales = new ArrayList<>();
        puntosCardinales.add("Norte");
        puntosCardinales.add("Sur");
        puntosCardinales.add("Este");
        puntosCardinales.add("Oeste");

        LinkedList<String> miNuevaLinkedList = new LinkedList<>();
        miNuevaLinkedList.addAll(puntosCardinales);

        for (int index = 0; index < puntosCardinales.size(); index ++){
            System.out.println("ArrayList: " + puntosCardinales.get(index) + "\n");
        }

        for (int index = 0; index < puntosCardinales.size(); index ++){
            System.out.println("LinkedList: " + miNuevaLinkedList.get(index) + "\n");
        }

        System.out.println("\n");

        //Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares.
        // Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

        ArrayList<Integer> enteros = new ArrayList<>();

        for (int i = 1; i<=10; i++){
            enteros.add(i);
        }
        System.out.println(enteros);

        for (int i = 0; i<enteros.size(); i++){

            if (enteros.get(i) % 2 == 0){
                enteros.remove(i);
            }
        }
        System.out.println(enteros);




    }
}
