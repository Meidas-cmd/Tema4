package org.example;

import java.util.Scanner;

public class Bateria1_T4_metodos {

    static void main() {

        Scanner entrada = new Scanner(System.in);
        //Ejercicio 1
/*
        System.out.println("Dame un numero entero");
        int num = entrada.nextInt();
        System.out.println(CUBO(num));
        */
        //Ejercicio 2
        /*
        System.out.println("*******************");

        System.out.println("De cuantas opciones quieres el menu");

        imprimir();

        System.out.println("Teclea tu opcion estupidoo!");
        String opcion = entrada.next();

        if (validar(opcion)){
            System.out.println("Valido!!!!");
        }else {
            System.out.println("No es validaaaaaa:(!!!!!");
        }
        //pintar_nombre("patri","jorge","raul");
        */
        //Ejercicio 3
        int cont=0;
        String vocales = "aeiuo";
        System.out.println("***************");
        System.out.println("Pasame ua cadena una chain: ");
        String cadena = entrada.nextLine();
        System.out.println(mayusculas(cadena));
        System.out.println(contarVocales(cadena,vocales,cont));

    }

    //METODOS
    public static void pintar_nombre(String...nombre){

        for (String i : nombre){
            System.out.print(i + " ");
        }
    }
    //Ejercicio 1
    public static int CUBO(int num){
        return num * num * num;
    }
    //Ejercicio 2
    public static void imprimir(){

        System.out.println("Bienvenido!");
        System.out.println("1. Oshimen");
        System.out.println("2. Mbappe");
        System.out.println("3. yamal");
        System.out.println("X. Salir");

    }
    public static boolean validar(String opcion){

        switch (opcion){
            case "1":
                return true;

            case "2":
                return true;

            case "3":
                return true;


            case "X":
                return true;
            default:
                return false;
        }
    }
    //Ejercicio 3
    public static String mayusculas(String cadena){

        return cadena.toUpperCase();
    }
    public static int contarVocales(String cadena,String vocales, int cont) {
        for (int i = 0; i < cadena.length(); i++) {
            for (int j = 0; j <vocales.length();j++) {
            if (cadena.substring(i, i + 1).equals(vocales.substring(j,j+1))) {
                cont++;
            }
        }
        }
        return cont;
    }
}
