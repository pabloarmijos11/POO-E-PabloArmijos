
import java.util.Scanner;

public class EjecutarHospital {

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        //Declarar variables oara usar en el constructor
        String nombre, ciudad;
        int numD, numC;
        double pres;
        int op;

        System.out.println("--------------------------------------------");
        System.out.println("           SELECCIONE UNA OPCION");
        System.out.println("[1] Crear Hospitales en Quito");
        System.out.println("[2] Crear Hospitales en Quito con $250000.10");
        System.out.println("[3] Crear Hospital en cualquier ciudad");
        System.out.println("--------------------------------------------");
        op = e.nextInt();

        switch (op) {
            case 1:
                System.out.println("--------------------------------------------");
                System.out.println("             INGRESO DE DATOS");
                System.out.print("Ingrese Nombre del Hopital: ");
                nombre = e.next();
                System.out.print("Ingrese la cantidad de doctores: ");
                numD = e.nextInt();
                System.out.print("Ingrese la cantidad de camas: ");
                numC = e.nextInt();
                System.out.print("Ingrese el presupuesto anual: $");
                pres = e.nextFloat();
                System.out.println("--------------------------------------------");

                Hospital h = new Hospital(nombre, numC, numC, pres);

                System.out.println("--------------------------------------------");
                System.out.println("El Hospital " + h.getNombreHospital());
                System.out.println("Esta en la Ciudad de " + h.getCiudadHospital());
                System.out.println("Tiene " + h.getNumDoc() + " doctores");
                System.out.println("Tiene " + h.getNumCamas() + " camas");
                System.out.println("Tiene presupuesto anual de $" + h.getPresupuesto());
                System.out.println("--------------------------------------------");

                break;
            case 2:
                System.out.println("--------------------------------------------");
                System.out.println("             INGRESO DE DATOS");
                System.out.print("Ingrese Nombre del Hopital: ");
                nombre = e.next();
                System.out.print("Ingrese la cantidad de doctores: ");
                numD = e.nextInt();
                System.out.print("Ingrese la cantidad de camas: ");
                numC = e.nextInt();
                System.out.println("--------------------------------------------");

                Hospital h1 = new Hospital(nombre, numC, numC);

                System.out.println("--------------------------------------------");
                System.out.println("El Hospital " + h1.getNombreHospital());
                System.out.println("Esta en la Ciudad de " + h1.getCiudadHospital());
                System.out.println("Tiene " + h1.getNumDoc() + " doctores");
                System.out.println("Tiene " + h1.getNumCamas() + " camas");
                System.out.println("Tiene presupuesto anual de $" + h1.getPresupuesto());
                System.out.println("--------------------------------------------");

                break;
            case 3:
                System.out.println("--------------------------------------------");
                System.out.println("             INGRESO DE DATOS");
                System.out.print("Ingrese Nombre del Hopital: ");
                nombre = e.next();
                System.out.print("Ingrese el nombre de la ciudad: ");
                ciudad = e.next();
                System.out.print("Ingrese la cantidad de doctores: ");
                numD = e.nextInt();
                System.out.print("Ingrese la cantidad de camas: ");
                numC = e.nextInt();
                System.out.print("Ingrese el presupuesto anual: $");
                pres = e.nextFloat();
                System.out.println("--------------------------------------------");

                Hospital h2 = new Hospital(nombre, ciudad, numC, numC, pres);

                System.out.println("--------------------------------------------");
                System.out.println("El Hospital " + h2.getNombreHospital());
                System.out.println("Esta en la Ciudad de " + h2.getCiudadHospital());
                System.out.println("Tiene " + h2.getNumDoc() + " doctores");
                System.out.println("Tiene " + h2.getNumCamas() + " camas");
                System.out.println("Tiene presupuesto anual de $" + h2.getPresupuesto());
                System.out.println("--------------------------------------------");

                break;
            default:
                throw new AssertionError();
        }

        Hospital h = new Hospital();

    }
}
