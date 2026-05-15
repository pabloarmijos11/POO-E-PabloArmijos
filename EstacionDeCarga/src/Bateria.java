
public class Bateria {

    private double capacidadMaxima;
    private double capacidadActual;
    private int estadoSalud; 

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {
    if (capacidadActual > capacidadMaxima) {
        this.capacidadActual = capacidadMaxima;
    } else if (capacidadActual < 0) {
        this.capacidadActual = 0;
    } else {
        this.capacidadActual = capacidadActual;
    }
}

    public int getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(int estadoSalud) {
    if (estadoSalud >= 0 && estadoSalud <= 100) {
        this.estadoSalud = estadoSalud;
    } else {
        this.estadoSalud = 100;
    }
}

    public void usar(double cantidad) {
        capacidadActual -= cantidad;
        if (capacidadActual < 0) {
            capacidadActual = 0;
        }
    }
}
