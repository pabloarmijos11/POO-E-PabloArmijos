
public class Pulmones {

    private String idPulmon;
    private int alveolos;
    private String color;
    private String peso;
    
    //metodos get y set

    public String getIdPulmon() {
        return idPulmon;
    }

    public void setIdPulmon(String idPulmon) {
        this.idPulmon = idPulmon;
    }

    public int getAlveolos() {
        return alveolos;
    }

    public void setAlveolos(int alveolos) {
        this.alveolos = alveolos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    public String respirar(){
        String msn = "Los pulmones utilizan " + alveolos+ " para respirar";
        return msn;
    }
    
    
}
