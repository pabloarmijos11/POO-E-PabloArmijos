
import java.util.Scanner;

public class EjNotasObjetos {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        String nombre, materia;
        double nota;
        int n;
        Materia[] mat;

        //1. Ingreso de Datos
        System.out.println("----------------------------------------");
        System.out.print("Ingrese el nombre del estudiante: ");
        nombre = e.nextLine();
        System.out.print("Ingrese la cantidad de Materias: ");
        n = e.nextInt();
        System.out.println("----------------------------------------");

        mat = new Materia[n];
        

        for (int i = 0; i < mat.length; i++) {
            e.nextLine();
            System.out.print("Ingrese el nombre de la Materia: ");
            materia = e.nextLine();
            System.out.print("Ingrese la nota de la Materia: ");
            nota = e.nextDouble();
            System.out.println("----------------------------------------");

            Materia mt = new Materia(materia, nota);

            mat[i] = mt;
        }
        
        Libreta l = new Libreta(nombre, mat);
        
        //2. Invocar Metodos
        l.calcularPromedio();
        l.calcularPromedioCualitativo();
        
        System.out.println("============ INFO ESTUDIANTE ===========");
        System.out.println("Nombre: "+l.getNombreEstudiante());
        System.out.println("Promedio: "+l.getPromedio());
        System.out.println("Promedio Cualitativo: "+l.getPromedioCualitativo());
    }
}
