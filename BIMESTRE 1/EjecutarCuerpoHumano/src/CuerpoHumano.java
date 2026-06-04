public class CuerpoHumano {
    private String serieCH;
    private String tamanio;
    private String color;
    private String peso;
    private double precio;
    private String material;
    private Cerebro c;
    private Pulmones p;
    private Soporte s;

    public String getSerieCH() {
        return serieCH;
    }

    public void setSerieCH(String serieCH) {
        this.serieCH = serieCH;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
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

    public double getPrecio() {
        return precio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Cerebro getC() {
        return c;
    }

    public void setC(Cerebro c) {
        this.c = c;
    }

    public Pulmones getP() {
        return p;
    }

    public void setP(Pulmones p) {
        this.p = p;
    }

    public Soporte getS() {
        return s;
    }

    public void setS(Soporte s) {
        this.s = s;
    }
    
    public int calcularPrecio(){
        if (material.equals("Plastico")) {
            return 200;
        }else{
            return 400;
        }
    }
    
}
