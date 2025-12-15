package org.example;

public class Proyecto_Bonito {


    static java.util.Scanner entrada;
    public static void main(String[] args){
        entrada = new java.util.Scanner(System.in);
        System.out.println("Introduce el alto del campo de minas: ");
        int alto = entradaInt();
        System.out.println("Introduce el ancho del campo de minas: ");
        int ancho = entradaInt();
        String[][] campo = matrizString(alto,ancho);
        System.out.println(minas(campo));



    }
    //Metodos

    /**
     * @author = Jorge Cuartero Giner
     * @version  1.0
     * @param =  respuesta - recoge el int que introducen por pantalla
     * @param = estado - esta para que si salta el error debido a que han introducido otro tipo de dato el while siga preguntando todavia
     * @return - devuelve un int que han introducido por pantalla.
     */
    public static  int entradaInt(){
        boolean estado = true;
        int respuesta = 0;
        while(estado) {
            try {
                respuesta = entrada.nextInt();
                estado = false;
            } catch (Exception e) {
                System.out.println("No es un numero:");
                entrada.nextLine();
            }
        }
    return respuesta;
    }
    /**
     * @author = Jorge Cuartero Giner
     * @version  1.0
     * @param =  respuesta - recoge el String que introducen por pantalla
     * @param = estado - esta para que si salta el error debido a que han introducido otro tipo de dato el while siga preguntando todavia
     * @return - devuelve un Sting que han introducido por pantalla.
     */
    public static String entradaString(){
        boolean estado = true;
        String respuesta = "";
        while(estado) {
            try {
                respuesta = entrada.next();
                estado = false;
            } catch (Exception e) {
                System.out.println("No son letras:");
                entrada.next();
            }
        }
        return respuesta;
    }


    /**
     * @author Jorge Cuartero Giner
     * @param alto - variable que dice el alto de la matriz
     * @param ancho - variable que dice el ancho que va a tener la matriz
     * @return - devuelve una matriz tipo string
     */
    public static String[][] matrizString(int alto , int ancho){
        String[][] campo = new String[alto][ancho];
        for (int i = 0; i < campo.length; i++) {
            String fila[] = entradaString().split("");
            if (fila.length != ancho) {
                System.out.println("El tamaño no es correcto: ");
                i--;
            } else {
                campo[i] = fila;
            }
        }
        return campo;
    }


    /**
     * @author Jorge Cuartero Giner
     * @param campo - matriz del campo de minas en este caso
     * @return devuelve la cantidad de celdas que a su alrededor tienen seis minas representadas por *
     */
    public  static int minas(String[][] campo){
        int minas=0;
        int correctas=0;
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
        return correctas;
    }

}

