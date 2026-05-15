
import java.util.Scanner;

public class EjecutarPersonaIMC {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        //Variables para recibir datos
        String ced, nom;
        double pes, est;
        int ed;

        //Crear Objetos
        PersonaIMC perUno = new PersonaIMC();
        PersonaIMC perDos = new PersonaIMC();
        
        //Pedir Datos por teclado del objUno
        System.out.println("Ingrese Cedula");
        ced = e.nextLine();
        
        System.out.println("Ingrese Nombre");
        nom = e.nextLine();
        
        System.out.println("Ingrese peso en kilogramos");
        pes = e.nextDouble();
        
        System.out.println("Ingrese estatura en metros");
        est = e.nextDouble();
        
        System.out.println("Ingrese edad");
        ed = e.nextInt();
        e.nextLine();
        
        //Setear datos en el objUno
        perUno.setCedula(ced);
        perUno.setNombre(nom);
        perUno.setPeso(pes);
        perUno.setEstatura(est);
        perUno.setEdad(ed);
        
        //invocar metodo calcular imc objUno
        perUno.calcularIMC();
        
        //imprimir datos objUno
        System.out.println("----- DATOS DEL PACIENTE -----");
        System.out.println("Nombre: " + perUno.getNombre());
        System.out.println("Edad: " + perUno.getEdad() + " anos");
        System.out.println("Peso: "+ perUno.getPeso() + " kg");
        System.out.println("Estatura: " + perUno.getEstatura() +" mP");
        System.out.println("IMC: " +perUno.getImc());
        
        //Pedir Datos por teclado del objDos
        System.out.println("");
        
        System.out.println("Ingrese Cedula");
        ced = e.nextLine();
        
        System.out.println("Ingrese Nombre");
        nom = e.nextLine();
        
        System.out.println("Ingrese peso en kilogramos");
        pes = e.nextDouble();
        
        System.out.println("Ingrese estatura en metros");
        est = e.nextDouble();
        
        System.out.println("Ingrese edad");
        ed = e.nextInt();
        
        //Setear datos en el objDos
        perDos.setCedula(ced);
        perDos.setNombre(nom);
        perDos.setPeso(pes);
        perDos.setEstatura(est);
        perDos.setEdad(ed);
        
        //invocar metodo calcular imc objDos
        perDos.calcularIMC();
        
        //imprimir datos objDos
        System.out.println("----- DATOS DEL PACIENTE 2 -----");
        System.out.println("Nombre: " + perDos.getNombre());
        System.out.println("Edad: " + perDos.getEdad() + " anos");
        System.out.println("Peso: "+ perDos.getPeso() + " kg");
        System.out.println("Estatura: " + perDos.getEstatura() +" mP");
        System.out.println("IMC: " +perDos.getImc());
    }

}
