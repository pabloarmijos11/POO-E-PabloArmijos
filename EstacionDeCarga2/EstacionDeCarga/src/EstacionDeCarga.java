import java.util.ArrayList;
public class EstacionDeCarga {
    private ArrayList<VehiculoElectrico> listaVehiculos;

    public EstacionDeCarga() {
        this.listaVehiculos = new ArrayList<>();
    }

    public void registrarVehiculos(VehiculoElectrico v) {
        listaVehiculos.add(v);
        System.out.println("Vehículo " + v.getMarca() + " registrado con exito.");
    }
    
    public void limpiarLista(){
        listaVehiculos.clear();
        System.out.println("Lista de vehiculos limpiada");
    }
    
    public void usarBateriaVehiculos(double cantidadParaTodos){
        for (int i = 0; i < listaVehiculos.size(); i++) {
            VehiculoElectrico v = listaVehiculos.get(i);
            v.usarBateria(cantidadParaTodos);
        }    
    }

    public void mostrarEstadoVehiculos() {
        for (int i = 0; i < listaVehiculos.size(); i++) {
            VehiculoElectrico v = listaVehiculos.get(i);
            v.mostrarEstado();
        }
    }
    
    public void suministrarEnergia() {
        System.out.println("\n--- Suministrando energia fija (15.0 kWh) ---");
        for (int i = 0; i < listaVehiculos.size(); i++) {
            VehiculoElectrico v = listaVehiculos.get(i);
            v.cargar(15.0);
        }
    }    
}
