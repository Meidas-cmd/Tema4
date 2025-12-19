package org.example;

public class Atascos {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext())
            return false;
        else {
            int cant = in.nextInt();
            in.nextLine();
            int grupos =0;
            int pos = 0;
            String trenes[] = new String[cant];
            trenes= in.nextLine().split(" ");
            for (int i = 0; i < cant; i++) {
                if (Integer.parseInt(trenes[i]) < pos){
                    pos = i;
                }
            }
            System.out.println(grupos);
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main
}
