package inmobiliaria;

public class Electrodemestico {

    private String nombre;

    private  double consumo;

    public Electrodemestico (String nombre, double consumo){

        this.consumo = consumo;
        this.nombre = nombre;


    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Electrodemestico{" +
                "nombre='" + nombre + '\'' +
                ", consumo=" + consumo +
                '}';
    }
}
