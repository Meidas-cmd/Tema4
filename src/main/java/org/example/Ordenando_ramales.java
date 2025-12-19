package org.example;

public class Ordenando_ramales {
    // Asume fichero llamado solution.java


    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int veces = in.nextInt();
        if (veces < 1)
            return false;
        else {
            String[][] railes = new String[veces][3];
            for (int i = 0; i < veces; i++) {
                String[] rail = in.nextLine().split(" ");
                railes[i] = rail;
            }
            int primero = 0;
            String direccion = "";
            int pos = 0;
            for (int i = 0; i < railes.length; i++) {
                    if (primero < Integer.parseInt(railes[i][2]) || primero == Integer.parseInt(railes[i][2])){
                        primero = Integer.parseInt(railes[i][2]);
                        pos = i;
                        if (primero == Integer.parseInt(railes[i][2] ) && railes[i][1].toUpperCase().equals("I")){
                            pos = i;
                        }
                    }
                System.out.println("");
            }


            System.out.println("---");
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

}
