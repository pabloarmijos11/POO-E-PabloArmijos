
package vista;

import modelo.lectura;
import modelo.Libro;

public class EjPatronMVC {

    public static void main(String[] args) {
        VistaLibro vl = new VistaLibro();
        vl.menu();
        
        /* ROMPE HUERISTICAS DEL PATRON MVC
        
        lectura l = new lectura();
        l.leer();
        Libro lib = new Libro();
        lib.insertarLibro();
        
        */
    }
}
