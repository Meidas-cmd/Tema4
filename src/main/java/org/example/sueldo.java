package org.example;

public class sueldo {

    static java.util.Scanner in;

    public static void casoDePrueba() {


        int[] vec  = new int[6];
        for (int i = 0; i < 6; i++) {
            vec[i] = in.nextInt();
        }
        int bene = vec[0] * vec[1] * vec[2];
        int gast = vec[3] * vec[1] * 2 + vec[4] + vec[5];
        System.out.println(bene-gast);



    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
}
