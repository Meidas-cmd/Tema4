package org.example;

public class perimetro_rectangulo {
    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int x = in.nextInt();
        int y = in.nextInt();

        if (x< 0 || y < 0)
        return false;
        else {
            System.out.println(((x*2)+(y*2)));

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
