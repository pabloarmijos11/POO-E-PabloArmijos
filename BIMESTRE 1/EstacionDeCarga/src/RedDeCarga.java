
import java.util.Scanner;

public class RedDeCarga {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        EstacionDeCarga electrolinera = new EstacionDeCarga();

        System.out.println("SISTEMA DE GESTION DE CARGA DINAMICA");
        System.out.print("¿Cuantos vehiculos desea registrar?: ");
        int total = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < total; i++) {
            System.out.println("\n--- Registro Vehiculo #" + (i + 1) + " ---");
            VehiculoElectrico v = new VehiculoElectrico();

            System.out.print("Marca: ");
            v.setMarca(entrada.nextLine());
            System.out.print("Modelo: ");
            v.setModelo(entrada.nextLine());

            System.out.print("Capacidad TOTAL de fabrica (kWh): ");
            v.getB().setCapacidadMaxima(entrada.nextDouble());

            System.out.print("Carga actual inicial (kWh): ");
            v.getB().setCapacidadActual(entrada.nextDouble());

            System.out.print("Estado de salud bateria (0-100): ");
            v.getB().setEstadoSalud(entrada.nextInt());
            entrada.nextLine();

            electrolinera.registrarVehiculo(v);
        }

        System.out.println("\n*** ESTADO INICIAL (Antes de cargar) ***");
        electrolinera.mostrarEstadoVehiculos();

        electrolinera.suministrarEnergia();

        System.out.println("\n*** ESTADO FINAL (Despues de cargar) ***");
        electrolinera.mostrarEstadoVehiculos();

        entrada.close();
    }
}
