
public class Evento {

    private String nombreEvento;
    private String fecha;
    private String ubicacion;
    private String descripcion;
    private String tipo;
    private int numPaisesInvolucrados;
    private boolean esPrimerMundo;
    private boolean usaArmasNucleares;
    private double porcentajeBajas;

    public Evento(String nombre, String fecha, String ubicacion, String desc, String tipo, int paises, boolean primerMundo, boolean nucleares, double bajas) {
        this.nombreEvento = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.descripcion = desc;
        this.tipo = tipo;
        this.numPaisesInvolucrados = paises;
        this.esPrimerMundo = primerMundo;
        this.usaArmasNucleares = nucleares;
        this.porcentajeBajas = bajas;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumPaisesInvolucrados() {
        return numPaisesInvolucrados;
    }

    public boolean isEsPrimerMundo() {
        return esPrimerMundo;
    }

    public boolean isUsaArmasNucleares() {
        return usaArmasNucleares;
    }

    public double getPorcentajeBajas() {
        return porcentajeBajas;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }
}
