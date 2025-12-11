// Asume fichero llamado solution.java
public class hyperapr {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int num = in.nextInt();
        int par = 0;
        if (num < 0)
        return false;
        else {
        String cadena = Integer.toString(num);
            for (int i = 0; i < cadena.length(); i++) {
                String resultado = cadena.substring(i,(i+1));
                if (Integer.parseInt(resultado)%2 == 0){
                    par++;
                }
            }
            if (par == cadena.length()){
                System.out.println("SI");
            }else {
                System.out.println("NO");
            }
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