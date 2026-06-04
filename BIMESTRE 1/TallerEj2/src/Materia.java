
public class Materia {

    private String nombreMateria;
    private double acd;
    private double ape;
    private double aa;
    private double promedio;

    public Materia(String nombreMateria, double acd, double ape, double aa) {
        this.nombreMateria = nombreMateria;
        this.acd = acd;
        this.ape = ape;
        this.aa = aa;
    }

    public void calcularPromedio() {
        promedio = (0.35 * acd) + (0.35 * ape) + (0.30 * aa);
    }

    public void calcularEstado(double notarec) {
        calcularPromedio();
        System.out.println("");
        System.out.println("============= RESULTADOS =============");
        System.out.println("MATERIA: " + nombreMateria.toUpperCase());
        if (promedio >= 7) {
            System.out.println("ESTUDIANTE APROBADO | PROMEDIO: " + promedio + "/10");
        } else {

            double notasesenta = promedio * 0.60;
            promedio = notasesenta + notarec;
            System.out.println("PROMEDIO FINAL: " + promedio + "/10");

            if (promedio >= 7) {
                System.out.println("ESTUDIANTE APROBADO");
            } else {
                System.out.println("ESTUDIANTE DESAPROBADO");
            }
        }
    }

}
