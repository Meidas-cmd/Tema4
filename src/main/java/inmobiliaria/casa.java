package inmobiliaria;

import java.util.ArrayList;
import java.util.Scanner;

public class casa {
    static  Scanner entrada = new Scanner(System.in);

    private String direccion;


    private ArrayList<Habitacion> listaHabitaciones;

    private Propietario propietario;

    public casa (String direccion){

        this.direccion = direccion;
        listaHabitaciones = new ArrayList<>();
        setPropietario();

    }

    public void crearHabitacion(String nombre, double metros){

        for (Habitacion habitacion : listaHabitaciones){

            if (habitacion.getNombre().equals(nombre)){
                System.out.println("La habitacion " + nombre + " ya existe.");
                return;
            }
        }

        Habitacion habitacion = new Habitacion(nombre,metros);

        listaHabitaciones.add(habitacion);

        System.out.println("Habitacion " + nombre + " creada.");

    }

    public void eliminarHabitacion(String nombre){

        for (Habitacion habitacion : listaHabitaciones){

            if(habitacion.getNombre().equals(nombre)){
                listaHabitaciones.remove(habitacion);
                System.out.println("Habitacion eliminada");
                return;
            }
        }

        System.out.println("La habitacion no existe ");

    }


    public void mostrarHabitaciones(){

        System.out.println("Casa en " + direccion + "y propetario "+ getPropietario() + " tiene " + listaHabitaciones.size() + " habitaciones.");
        for (Habitacion habitacion : listaHabitaciones){
            System.out.println("- " + habitacion.getNombre() + " (" + habitacion.getMetros() + ") m2");
        }
    }
    public Habitacion getHabitacionesMasGrades(){
        Habitacion mayor = listaHabitaciones.get(0) ;

        for (Habitacion habitacion : listaHabitaciones){
            if (habitacion.getMetros()>mayor.getMetros()){
            mayor = habitacion;

            }
        }
        return  mayor;
    }



    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public Habitacion habitacionMasConsume(){
        Habitacion maximo = listaHabitaciones.get(0);

        for (Habitacion habitacion : listaHabitaciones){
            if (habitacion.calcualrConsumo()>maximo.calcualrConsumo()){
                maximo=habitacion;
            }
        }

        return maximo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {
        System.out.println("Introduce el nombre del propietario :");
        String nombre = entrada.nextLine();
        System.out.println("Edad : ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        Propietario propietario = new Propietario(nombre,edad);
        this.propietario = propietario;
        System.out.println("Propietario " + nombre + " añadido" );
    }

    @Override
    public String toString() {
        return "casa{" +
                "direccion='" + direccion + '\'' +
                "propietario" + propietario + '\'' +
                '}';
    }



}
