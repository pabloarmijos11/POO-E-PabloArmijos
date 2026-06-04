
public class Estudiante {

    private String nombre;
    private Materia materia;
    private int edad;

    public Estudiante(String nombre, Materia materia, int edad) {
        this.nombre = nombre;
        this.materia = materia;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("");
        System.out.println("========== DATOS ESTUDIANTE ==========");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " anios");
        System.out.println("======================================");
    }
}
