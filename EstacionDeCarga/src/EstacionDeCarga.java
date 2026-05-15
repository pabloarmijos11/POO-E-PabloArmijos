
import java.util.ArrayList;

public class EstacionDeCarga {

    private ArrayList<VehiculoElectrico> listaVehiculos;

    public EstacionDeCarga() {
        this.listaVehiculos = new ArrayList<>();
    }

    public void registrarVehiculo(VehiculoElectrico v) {
        listaVehiculos.add(v);
        System.out.println("Vehículo " + v.getMarca() + " registrado con exito.");
    }

    public void suministrarEnergia() {
        System.out.println("\n--- Suministrando energia fija (15.0 kWh) ---");
        for (int i = 0; i < listaVehiculos.size(); i++) {
            VehiculoElectrico v = listaVehiculos.get(i);
            v.cargar(15.0);
        }
    }

    public void mostrarEstadoVehiculos() {
        for (int i = 0; i < listaVehiculos.size(); i++) {
            VehiculoElectrico v = listaVehiculos.get(i);
            v.mostrarEstado();
        }
    }
}
