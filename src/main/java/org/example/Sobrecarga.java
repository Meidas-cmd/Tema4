package org.example;

public class Sobrecarga {

    public static void atacar(){
        System.out.println("ATACANDO!");
    }
    public static void atacar(String nombre){
        System.out.println("Te esta atacando " + nombre);
    }
    public static void atacar(int nivel){

    }

    static void main() {
        atacar();
    }
}
