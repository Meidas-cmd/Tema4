// Asume fichero llamado solution.java
public class pan_bodas {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {

        int sillas = in.nextInt();

        if (sillas<0)
        return false;
        else {
            String mesa  = in.nextLine();
            // CÓDIGO PRINCIPAL AQUÍ
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

} // class solution