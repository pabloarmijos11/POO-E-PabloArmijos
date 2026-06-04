
public class Conflicto {

    private String nombreConflicto;
    private String paisesInvolucrados;
    private String fechaInicio;
    private String estadoActual;
    private Evento[] eventos;

    public Conflicto(String nombre, String paises, String fecha, Evento[] eventos) {
        this.nombreConflicto = nombre;
        this.paisesInvolucrados = paises;
        this.fechaInicio = fecha;
        this.eventos = eventos;
        this.estadoActual = "En curso / Estable";
    }

    public void evaluarSituacion() {
        int totalPaisesMundo = 195;

        for (int i = 0; i < eventos.length; i++) {
            Evento ev = eventos[i];
            double porcentajePaises = (ev.getNumPaisesInvolucrados() / totalPaisesMundo) * 100;

            if (ev.getTipo().equalsIgnoreCase("Batalla") && porcentajePaises > 50) {
                estadoActual = "GUERRA MUNDIAL";
            } else if (ev.getTipo().equalsIgnoreCase("Batalla") && porcentajePaises >= 30) {
                estadoActual = "CONVOCAR ONU: REUNIÓN URGENTE";
            }

            if (ev.getTipo().equalsIgnoreCase("Batalla") && ev.isEsPrimerMundo() && ev.isUsaArmasNucleares()) {
                estadoActual = "GUERRA MUNDIAL";
            }

            if (ev.getPorcentajeBajas() >= 50) {
                estadoActual = "CONVOCAR ONU: CARÁCTER URGENTE";
            }
        }
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public String getNombreConflicto() {
        return nombreConflicto;
    }
}
