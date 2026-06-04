
import java.util.ArrayList;
import java.util.Scanner;


public class EjArrayList {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //Crear ArrayList
        ArrayList<Bus> buses = new ArrayList <>();
        ArrayList<Bus> buses2 = new ArrayList <>();
        
        buses.add(new Bus("01", "LBC-1234", "Azul", 40));
        buses.add(new Bus("01", "GDA-9876", "Verde", 40));
        
        Bus b = new Bus("03", "LBA-7777", "Rojo", 100);
        buses.add(b);
        
        //Recorrer Arreglo Dinamico de Objetos
        for (int i = 0; i < buses.size(); i++) {
            System.out.println("La Placa del Bus "+ (i+1)+ " es: "+buses.get(i).getPlaca());
        }
        
        //Ingresar datos en un arreglo
        String id, placa, color;
        int cap, n;
        System.out.print("Cuantos Buses desea ingresar? ");
        n = entrada.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el id: ");
            id = entrada.nextLine();
            System.out.print("Ingrese la placa: ");
            placa = entrada.nextLine();
            System.out.print("Ingrese el color: ");
            color = entrada.nextLine();
            System.out.print("Ingrese la capacidad: ");
            cap = entrada.nextInt();
            buses2.add(new Bus(id, placa, color, cap));
        }
        
        for (int i = 0; i < buses2.size(); i++) {
            System.out.println("La Placa del Bus "+ (i+1)+ " es: "+buses2.get(i).getPlaca());
        }
    }
}
