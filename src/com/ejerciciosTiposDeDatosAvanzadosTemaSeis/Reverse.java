package com.ejerciciosTiposDeDatosAvanzadosTemaSeis;

public class Reverse {

    //Atributo
    private String texto;

    //Constructores

    public Reverse(String texto) {
        this.texto = texto;
    }
    public Reverse() {

    }

    //Getter
    public String getTexto() {
        return texto;
    }

    //Setter
    public void setTexto(String texto) {
        this.texto = texto;
    }

    //Metodo reverse
    public static void reverse (String texto){

        String cadenaEnReversa = "";

        for (int i = texto.length() - 1; i >= 0; i--){

            cadenaEnReversa += texto.charAt(i);

        }

        System.out.println("Texto en reversa: " + cadenaEnReversa +"\n\n");

    }
}
