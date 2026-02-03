package inmobiliaria;

public class InmoApp {
    public static void main(String[] args) {
        casa pisito = new casa("Calle Falsa 123");
        Habitacion dormitorio = new Habitacion("dormitorio",29);
        System.out.println("------------------------------");

//        pisito.getPropietario();

        System.out.println("------------------------------");

        pisito.crearHabitacion("cocina",20);
        pisito.crearHabitacion("dormitorio",17);
        System.out.println("------------------------------");

        System.out.println(pisito.getListaHabitaciones());
        pisito.mostrarHabitaciones();
        System.out.println("------------------------------");


        System.out.println("La habitacion mas grande es " + pisito.getHabitacionesMasGrades().getNombre());

        System.out.println("------------------------------");
        pisito.eliminarHabitacion("cocina");
        pisito.mostrarHabitaciones();

        System.out.println("------------------------------");
        pisito.getListaHabitaciones().get(0).agregarElctrodomesticos("lavajillas",54);
        pisito.getListaHabitaciones().get(0).mostrarElectrodomestico();
        System.out.println("------------------------------");


       pisito.habitacionMasConsume();
    }
}
