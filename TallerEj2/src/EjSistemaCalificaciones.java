
import java.util.Scanner;

public class EjSistemaCalificaciones {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nom, mat;
        int ed;
        double acd, ape, aa;
        double recuperacion = 0;

        System.out.print("Ingrese el nombre del estudiante: ");
        nom = entrada.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        ed = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese el nombre de la materia: ");
        mat = entrada.nextLine();
        System.out.print("Ingrese la nota correspondiente a ACD: ");
        acd = entrada.nextDouble();
        System.out.print("Ingrese la nota correspondiente a APE: ");
        ape = entrada.nextDouble();
        System.out.print("Ingrese la nota correspondiente a AA: ");
        aa = entrada.nextDouble();

        Materia m1 = new Materia(mat, acd, ape, aa);
        Estudiante e1 = new Estudiante(nom, m1, ed);

        e1.mostrarDatos();

        double promedio = (0.35 * acd) + (0.35 * ape) + (0.30 * aa);

        if (promedio < 7) {
            System.out.println("");
            System.out.println("PROMEDIO: " + promedio + "/10");
            System.out.println("Debe dar Examen de Recuperacion");
            System.out.println("");
            System.out.print("Ingrese nota de recuperacion (sobre 3,5): ");
            recuperacion = entrada.nextDouble();
        }

        m1.calcularEstado(recuperacion);

        entrada.close();
    }
}
