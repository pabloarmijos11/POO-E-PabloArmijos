
import java.util.Scanner;

public class EjGestionConflictos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== REGISTRO DE CONFLICTOS ONU ===");
        System.out.print("Nombre del Conflicto: ");
        String nombreC = sc.nextLine();
        System.out.print("Paises involucrados (resumen): ");
        String paisesC = sc.nextLine();
        System.out.print("Fecha de inicio: ");
        String fechaC = sc.nextLine();

        System.out.print("Cuantos eventos importantes desea registrar?: ");
        int n = sc.nextInt();
        sc.nextLine();

        Evento[] listaEventos = new Evento[n];

        for (int i = 0; i < n; i++) {
            System.out.println("--- Datos del Evento " + (i + 1) + " ---");
            System.out.print("Nombre del evento: ");
            String nomE = sc.nextLine();
            System.out.print("Fecha del evento (DD/MM/AAAA): ");
            String fechaE = sc.nextLine();
            System.out.print("Ubicacion: ");
            String ubiE = sc.nextLine();
            System.out.print("Descripcion breve: ");
            String descE = sc.nextLine();
            System.out.print("Tipo (Batalla/Tratado/Reunion): ");
            String tipoE = sc.nextLine();
            System.out.print("Numero de paises involucrados: ");
            int numP = sc.nextInt();
            System.out.print("Ocurriu en pais de primer mundo? (true/false): ");
            boolean esPM = sc.nextBoolean();
            System.out.print("Se usaron armas nucleares? (true/false): ");
            boolean nuclear = sc.nextBoolean();
            System.out.print("Porcentaje de bajas (0-100): ");
            double bajas = sc.nextDouble();
            sc.nextLine();

            listaEventos[i] = new Evento(nomE, fechaE, ubiE, descE, tipoE, numP, esPM, nuclear, bajas);
        }

        Conflicto miConflicto = new Conflicto(nombreC, paisesC, fechaC, listaEventos);

        miConflicto.evaluarSituacion();

        System.out.println("================ RESULTADOS ================");
        System.out.println("Conflicto: " + miConflicto.getNombreConflicto());
        System.out.println("Estado Final: " + miConflicto.getEstadoActual());
        System.out.println("============================================");
    }
}
