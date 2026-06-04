public class VehiculoElectrico {
    private String marca;
    private String modelo;
    private Bateria bateria;

    public VehiculoElectrico() {
        this.bateria = new Bateria();
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

    public Bateria getBateria() {
        return bateria;
    }
    
    public void setAtributosBateria(double capMax, double capActual, int estSalud){
        this.bateria.setCapacidadMaxima(capMax);        
        this.bateria.setCapacidadActual(capActual);
        this.bateria.setEstadoSalud(estSalud);
    }
    
    public void mostrarEstado() {
        double limiteSalud = bateria.getCapacidadMaxima() * (bateria.getEstadoSalud() / 100.0);
        System.out.printf("Vehículo: %s %s | Batería: %.2f/%.2f kWh | Salud: %d%% | Límite Real: %.2f kWh\n",
                marca, modelo, bateria.getCapacidadActual(), bateria.getCapacidadMaxima(), bateria.getEstadoSalud(), limiteSalud);
    }

    public void usarBateria(double cantidad){
        bateria.usar(cantidad);
    }
    
    public void cargar(double kwh) {
        double limiteSalud = bateria.getCapacidadMaxima() * (bateria.getEstadoSalud() / 100.0);

        if ((bateria.getCapacidadActual() + kwh) <= limiteSalud) {
            bateria.setCapacidadActual(bateria.getCapacidadActual() + kwh);
        } else {
            bateria.setCapacidadActual(limiteSalud);
        }
    }
}
