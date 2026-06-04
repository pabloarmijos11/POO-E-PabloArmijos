
import java.util.Scanner;

public class EjecutarVendedor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nom;
        int ed, numau;
        double sal;
        int opc = 1;
        while (opc != 2) {
            System.out.println("------------------------------------------------");
            System.out.println("               MENU PRINCIPAL");
            System.out.println("[1] Ingresar Nuevo Vendedor");
            System.out.println("[2] Salir");
            System.out.println("------------------------------------------------");
            opc = entrada.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("------------------------------------------------");
                    System.out.print("Ingrese nombre del vendedor: ");
                    nom = entrada.next();
                    System.out.print("Ingrese la edad del vendedor: ");
                    ed = entrada.nextInt();
                    System.out.print("Ingrese el salario minimo del vendedor: ");
                    sal = entrada.nextDouble();
                    System.out.print("Ingrese el numero de autos que ha vendido: ");
                    numau = entrada.nextInt();
                    System.out.println("------------------------------------------------");
                    Vendedor v = new Vendedor(nom, ed, sal, numau);
                    v.calcularPagoMensual();

                    System.out.println("------------------------------------------------");
                    System.out.println("El vendedor " + v.getNombre());
                    System.out.println("Tiene " + v.getEdad() + " anos");
                    System.out.println("Vendio " + v.getNumAutos() + " autos en el mes");
                    System.out.println("Su pago mensual es de $" + v.calcularPagoMensual());
                    System.out.println("------------------------------------------------");

                    break;
                case 2:
                    System.out.println("FIN DEL PROGRAMA");
                    break;
                default:
                    throw new AssertionError();
            }
        }

    }
}
