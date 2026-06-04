
public class Libreta {

    private String nombreEstudiante;
    private double promedio;
    private String promedioCualitativo;
    //Conjunto de arreglos de objetos
    private Materia[] m;

    public Libreta(String nombreEstudiante, Materia[] m) {
        this.nombreEstudiante = nombreEstudiante;
        this.m = m;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public double getPromedio() {
        return promedio;
    }

    public void calcularPromedio() {
        double suma = 0;

        for (int i = 0; i < m.length; i++) {
            suma += getM()[i].getNota();
        }

        promedio = suma / m.length;
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

    public Materia[] getM() {
        return m;
    }

    public void setM(Materia[] m) {
        this.m = m;
    }

}
