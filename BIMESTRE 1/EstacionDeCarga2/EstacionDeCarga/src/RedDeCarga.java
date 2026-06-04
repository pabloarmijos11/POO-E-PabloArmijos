import java.util.Scanner;
public class RedDeCarga {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        EstacionDeCarga electrolinera = new EstacionDeCarga();
        // 1. Creacion, asignacion de atributos y registro del vehiculo 1
        VehiculoElectrico v1 = new VehiculoElectrico();
        v1.setMarca("Ferrari");
        v1.setModelo("2005");
        v1.setAtributosBateria(75, 43, 90);
        electrolinera.registrarVehiculos(v1);
        
        // 2. Creacion, asignacion de atributos y registro del vehiculo 2
        VehiculoElectrico v2 = new VehiculoElectrico();
        v2.setMarca("Toyota");
        v2.setModelo("2025");
        v2.setAtributosBateria(85, 37, 95);
        electrolinera.registrarVehiculos(v2);
        
        // 3. Creacion, asignacion de atributos y registro del vehiculo 3
        VehiculoElectrico v3 = new VehiculoElectrico();
        v3.setMarca("Tesla");
        v3.setModelo("2023");
        v3.setAtributosBateria(90, 19, 80);
        electrolinera.registrarVehiculos(v3);
        
        // 4. Estado de los vehiculos antes de la carga
        System.out.println("\nVehiculos antes de la carga");
        electrolinera.mostrarEstadoVehiculos();
        
        // 5. Funcionamiento de los vehiculos
        v1.usarBateria(15);
        v2.usarBateria(5);
        v3.usarBateria(10);
        
        // 6. Carga de los vehiculos
        electrolinera.suministrarEnergia();
        
        // 7. Estado de los vehiculos despues de la carga
        System.out.println("\nVehiculos despues de la carga");
        electrolinera.mostrarEstadoVehiculos();
        
        // 8. Opcion por si se desea agregar mas vehiculos aparte
        System.out.print("¿\nDeseas registrar mas vehiculos?: ");
        String opcion = entrada.nextLine();
        if(opcion.equalsIgnoreCase("si")){
            electrolinera.limpiarLista();
            System.out.print("¿Cuantos vehiculos mas desea registrar?: ");
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
                double capacidadMax = entrada.nextDouble();    
                
                System.out.print("Carga actual inicial (kWh): ");
                double capacidadActual = entrada.nextDouble();
                
                System.out.print("Estado de salud bateria (0-100): ");
                int saludBateria = entrada.nextInt();
                
                v.setAtributosBateria(capacidadMax, capacidadActual, saludBateria);
                entrada.nextLine();
                electrolinera.registrarVehiculos(v);
            }
            System.out.println("\nESTADO INICIAL (Antes de cargar)");
            electrolinera.mostrarEstadoVehiculos();
            
            System.out.println("\nCuantos Kw usaran todos los vehiculos?");
            electrolinera.usarBateriaVehiculos(entrada.nextDouble());
            
            System.out.println("\nCarga de los vehiculos...");
            electrolinera.suministrarEnergia();

            System.out.println("\nESTADO FINAL (Despues de cargar)");
            electrolinera.mostrarEstadoVehiculos();            
        }
    }
}
