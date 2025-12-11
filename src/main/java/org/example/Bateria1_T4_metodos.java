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
        /*
        int cont=0;
        String vocales = "aeiuo";
        System.out.println("***************");
        System.out.println("Pasame ua cadena una chain: ");
        String cadena = entrada.nextLine();
        System.out.println(mayusculas(cadena));
        System.out.println(contarVocales(cadena,vocales,cont));
        */

        //Ejercicio 4
        System.out.println("***************");
        double menos =0;
        double mas = 0;
        int pos = 0;
        double media = 0;
        double ultimo = 0;
        String mens = "";
        double semana[] = new double[6];
        dias(semana);
        /*for (double i : semana){
            System.out.print(i + " ");
        }*/
        System.out.println(mas_venta(semana,mas,pos,mens));
        System.out.println("******");
        System.out.println(menos_venta(semana,menos,pos,mens));
        System.out.println("******");
        System.out.println(media(semana,media));
        System.out.println("******");
        System.out.println(domingo(semana,ultimo));


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
    public static  boolean par (int num){
        if (num % 2 == 0){
            return true;
        } else {
            return false;
        }
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
        cadena = cadena.toUpperCase();
        return cadena;
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
    //Ejericio 4
    public static double[] dias(double[] semana){
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < semana.length; i++) {
            semana[i] = entrada.nextDouble();
        }
        return semana;
    }
    public static String mas_venta (double[] semana, double mas,int pos,String mens){
        for (int i = 0; i < semana.length; i++) {
            if (semana[i] > mas){
                mas = semana[i];
                pos = i;
            }
        }
        switch (pos){
            case 0:
                mens = "Martes";
                break;
            case 1:
                mens = "Miercoles";
                break;
            case 2:
                mens = "Jueves";
                break;
            case 3:
                mens = "Viernes";
                break;
            case 4:
                mens = "Sabado";
                break;
            case 5:
                mens = "Domingo";
                break;
        }
        return mens;
    }
    public static String menos_venta (double[] semana, double menos,int pos,String mens){
        menos = semana[0];
        for (int i = 0; i < semana.length; i++) {
            if (semana[i] < menos){
                menos = semana[i];
                pos = i;
            }
        }
        switch (pos){
            case 0:
                mens = "Martes";
                break;
            case 1:
                mens = "Miercoles";
                break;
            case 2:
                mens = "Jueves";
                break;
            case 3:
                mens = "Viernes";
                break;
            case 4:
                mens = "Sabado";
                break;
            case 5:
                mens = "Domingo";
                break;
        }
        return mens;
    }
    public static double media (double[] semana , double media){
        for (int i = 0; i < semana.length; i++) {
            media += semana[i];
        }
        media = media / 6;
        return media;
    }
    public static double domingo (double[] semana, double ultimo){
        ultimo = semana[semana.length-1];
        return ultimo;
    }
}
