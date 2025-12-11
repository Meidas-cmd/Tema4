package org.example;

public class Proyecto_Juez_Campo_Minas {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int ancho = in.nextInt();
        int alto = in.nextInt();
        if (ancho <= 0 || alto <= 0)
            return false;
        else {
            System.out.println("******");
            int minas=0;
            int correctas=0;
            String campo[][] = new String[alto][ancho];
            for (int i = 0; i < campo.length; i++) {
                campo[i] = in.next().split("");
            }

            for (int i = 1; i < campo.length-1; i++) {
                for (int j = 1; j < campo[i].length-1; j++) {
                    if (campo[i][j].equals("-")){
                        minas =0;
                        for (int k = -1; k < 2; k++) {
                            for (int l = -1; l < 2; l++) {
                                if (campo[i+k][j+l].equals("*")){
                                    minas++;
                                }
                            }
                        }
                        if (minas >=6){
                            correctas++;
                        }
                    }
                }
            }
            System.out.println(correctas);
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

}