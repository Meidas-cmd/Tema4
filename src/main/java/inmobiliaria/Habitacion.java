package inmobiliaria;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class Habitacion {

    private String Nombre;

    private double metros;

    private ArrayList<Electrodemestico> listaElectrodomesticos;

    public  Habitacion (String nombre, double metros){

        this.Nombre = nombre;
        this.metros = metros;
        listaElectrodomesticos = new ArrayList<>();

    }

    public void agregarElctrodomesticos(String nombre,double consumo){
        for (Electrodemestico electrodemestico : listaElectrodomesticos){

            if (electrodemestico.getNombre().equals(nombre)){
                System.out.println("El electrodomestico " + nombre + " ya existe");
            }
        }

        Electrodemestico electrodemestico = new Electrodemestico(nombre,consumo);
    }

    public void mostrarElectrodomestico(){
        System.out.println("Electrodomesticos de la habitacion" + getNombre());
        for (Electrodemestico electrodemestico : listaElectrodomesticos){
            System.out.println("- " + electrodemestico.getNombre() + " (" + electrodemestico.getConsumo() + ") kWh");
        }
    }


    public double calcualrConsumo(){

        double res = 0;
        for (int i = 0; i < listaElectrodomesticos.size(); i++) {

            res  += listaElectrodomesticos.get(i).getConsumo();

        }
        System.out.println("El consumo de la habitacion " + getNombre() + " tiene en total " + res);
        return res;
    }



    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public ArrayList<Electrodemestico> getListaElectrodomesticos() {
        return listaElectrodomesticos;
    }

    public void setListaElectrodomesticos(ArrayList<Electrodemestico> listaElectrodomesticos) {
        this.listaElectrodomesticos = listaElectrodomesticos;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "Nombre='" + Nombre + '\'' +
                ", metros=" + metros +
                '}';
    }

}
