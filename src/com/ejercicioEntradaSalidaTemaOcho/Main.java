package com.ejercicioEntradaSalidaTemaOcho;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        LeerFichero("hola.txt", "destino.txt");

    }


    public static void LeerFichero(String fileIn, String fileOn) {

        File origin = new File(fileIn);
        File destination = new File(fileOn);

            try {
                InputStream in = new FileInputStream(origin);
                PrintStream out = new PrintStream(destination);

                byte[] datos = in.readAllBytes();
                out.write(datos);

            } catch (IOException e) {
                System.out.println("Se ha producido el error: " + e.getMessage());

            }

    }

}

