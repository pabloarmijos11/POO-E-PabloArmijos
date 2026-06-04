
public class Vendedor {

    //Atributos
    private String nombre;
    private int edad;
    private double salarioMin;
    private int numAutos;
    private double pagoMensual;

    //Constructor
    public Vendedor(String nombre, int edad, double salarioMin, int numAutos) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioMin = salarioMin;
        this.numAutos = numAutos;
    }

    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalarioMin() {
        return salarioMin;
    }

    public void setSalarioMin(double salarioMin) {
        this.salarioMin = salarioMin;
    }

    public int getNumAutos() {
        return numAutos;
    }

    public void setNumAutos(int numAutos) {
        this.numAutos = numAutos;
    }

    public double getPagoMensual() {
        return pagoMensual;
    }

    public double calcularPagoMensual() {
        pagoMensual = salarioMin + (numAutos * 150);
        return pagoMensual;
    }

}
