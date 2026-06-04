
public class Libreta {

    private String nombreEstudiante;
    private double[] notas;
    private double promedio;
    private String promedioCualitativo;

    public Libreta(String nombreEstudiante, double[] notas) {
        this.nombreEstudiante = nombreEstudiante;
        this.notas = notas;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getPromedio() {
        return promedio;
    }

    public void calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }

        promedio = suma / notas.length;
    }

    public String getPromedioCualitativo() {
        return promedioCualitativo;
    }

    public void calcularPromedioCualitativo() {
        if (promedio >= 0 && promedio < 3.10) {
            promedioCualitativo = "Regular";
        } else if (promedio >= 3.10 && promedio < 5.10) {
            promedioCualitativo = "Insuficiente";
        } else if (promedio >= 5.10 && promedio < 7.10) {
            promedioCualitativo = "Bueno";
        } else if (promedio >= 7.10 && promedio < 9.10) {
            promedioCualitativo = "Muy Bueno";
        } else if (promedio >= 9.10 && promedio <= 10) {
            promedioCualitativo = "Excelente";
        }
    }

}
