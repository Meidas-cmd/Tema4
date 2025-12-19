package org.example;

public class dandy {
    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int cant = in.nextInt();
        if (cant < 0)
        return false;
        else {



            // CÓDIGO PRINCIPAL AQUÍ
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

}
