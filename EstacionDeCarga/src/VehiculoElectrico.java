
public class VehiculoElectrico {

    private String marca;
    private String modelo;
    private Bateria b;

    public VehiculoElectrico() {
        this.b = new Bateria();
    }

    public void cargar(double kwh) {
        double limiteSalud = b.getCapacidadMaxima() * (b.getEstadoSalud() / 100.0);

        if ((b.getCapacidadActual() + kwh) <= limiteSalud) {
            b.setCapacidadActual(b.getCapacidadActual() + kwh);
        } else {
            b.setCapacidadActual(limiteSalud);
        }
    }

    public void mostrarEstado() {
        double limiteSalud = b.getCapacidadMaxima() * (b.getEstadoSalud() / 100.0);
        System.out.printf("Vehículo: %s %s | Batería: %.2f/%.2f kWh | Salud: %d%% | Límite Real: %.2f kWh\n",
                marca, modelo, b.getCapacidadActual(), b.getCapacidadMaxima(), b.getEstadoSalud(), limiteSalud);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Bateria getB() {
        return b;
    }
}
