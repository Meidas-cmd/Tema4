package org.example;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class condes {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext())
            return false;
        else {
            int anchura = in.nextInt();
            int alto = in.nextInt();

            String[][] matriz = new String[alto][anchura];

            for (int i = 0; i < matriz.length; i++) {
                matriz[i] = in.next().split("");
            }
            String[][] matriz2 = matriz.clone();
            for (int i = 0; i < matriz.length-1; i++) {
                for (int j = 0; j < matriz[i].length-1; j++) {

                    if (matriz[i][j] == "."){
                        matriz2[i][j]="N";
                        for (int k = -1; k < 2; k++) {
                            for (int l = -1; l < 2; l++) {
                                if (matriz[i+k][j+l] == "."){
                                    i = i+k;
                                    j = j+l;
                                }

                            }
                        }


                    }

                }
            }


            // CÓDIGO PRINCIPAL AQUÍ
            // (incluyendo la lectura del caso de prueba)
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main
}
