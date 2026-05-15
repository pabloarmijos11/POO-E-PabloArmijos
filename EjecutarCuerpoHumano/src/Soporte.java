
public class Soporte {

    private String serie;
    private String material;
    private double tamanio;

    //metodos get y set
    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    
    public boolean parar(){
        if (tamanio <= 170) {
            return true;
        }else{
            return false;
        }
    }

}
