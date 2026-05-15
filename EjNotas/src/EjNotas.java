
import java.util.Scanner;

public class EjNotas {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String nom;
        double[] notas;
        int n;
        //Ingreso de datos 
        System.out.print("Ingrese el nombre del estudiante: ");
        nom = e.nextLine();
        System.out.print("Ingrese cantidad de notas: ");
        n = e.nextInt();
        notas = new double[n];
        //Datos de el arreglo
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota #" + (i + 1) + ": ");
            notas[i] = e.nextDouble();
        }
        //Crear Objeto
        Libreta l = new Libreta(nom, notas);
        //Invocar metodos calcular
        l.calcularPromedio();
        l.calcularPromedioCualitativo();
        //Imprimir Resultados
        System.out.println("");
        System.out.println("=========== DATOS ALUMNO ===========");
        System.out.println("Nombre: "+l.getNombreEstudiante());
        System.out.println("Promedio: "+l.getPromedio());
        System.out.println("Promedio Cualitativo: "+l.getPromedioCualitativo());
    }
}
