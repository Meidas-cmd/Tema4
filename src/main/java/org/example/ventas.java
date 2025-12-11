public class ventas {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        double ventasd[] = new double[6];
        boolean estado = true;
        for (int i = 0; i < ventasd.length; i++) {
            ventasd[i] = in.nextDouble();
            if (i == 0 && ventasd[i] < 0){
                 estado = false;
                 break;
            }
        }
        if (!estado)
        return false;
        else {
            double mas = 0;
            int pos = 0;

            for (int i = 0; i < ventasd.length; i++) {
                if (ventasd[i] > mas ){
                    mas = ventasd[i];
                    pos = i;
                }
            }
            switch (pos){
                case 0:
                    System.out.print("MARTES ");
                    break;
                case 1:
                    System.out.print("MIERCOLES ");
                    break;
                case 2:
                    System.out.print("JUEVES ");
                    break;
                case 3:
                    System.out.print("VIERNES ");
                    break;
                case 4:
                    System.out.print("SABADO ");
                    break;
                case 5:
                    System.out.print("DOMINGO ");
                    break;
            }

            pos = 0;
            mas = ventasd[0];
            for (int j = 0; j < ventasd.length; j++) {
                if (ventasd[j] < mas ){
                    mas = ventasd[j];
                    pos = j;
                }
            }

            switch (pos){
                case 0:
                    System.out.print("MARTES ");
                    break;
                case 1:
                    System.out.print("MIERCOLES ");
                    break;
                case 2:
                    System.out.print("JUEVES ");
                    break;
                case 3:
                    System.out.print("VIERNES ");
                    break;
                case 4:
                    System.out.print("SABADO ");
                    break;
                case 5:
                    System.out.print("DOMINGO ");
                    break;
            }
            int media = 0;

            for (int i = 0; i < ventasd.length; i++) {

                media += ventasd[i];

            }
            if (media /6 < ventasd[ventasd.length-1]){
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

} // class solution
