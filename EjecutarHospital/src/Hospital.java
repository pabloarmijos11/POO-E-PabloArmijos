
public class Hospital {

    private String nombreHospital;
    private String ciudadHospital;
    private int numDoc;
    private int numCamas;
    private double presupuesto;

    //Uso de Constructores
    public Hospital() {

    }

    public Hospital(String nombreHospital, int numDoc, int numCamas, double presupuesto) {
        this.nombreHospital = nombreHospital;
        this.ciudadHospital = "Quito";
        this.numDoc = numDoc;
        this.numCamas = numCamas;
        this.presupuesto = presupuesto;
    }

    public Hospital(String ciudadHospital, int numDoc, int numCamas) {
        this.nombreHospital = nombreHospital;
        this.ciudadHospital = "Quito";
        this.numDoc = numDoc;
        this.numCamas = numCamas;
        this.presupuesto = 250000.10;
    }

    public Hospital(String nombreHospital, String ciudadHospital, int numDoc, int numCamas, double presupuesto) {
        this.nombreHospital = nombreHospital;
        this.ciudadHospital = ciudadHospital;
        this.numDoc = numDoc;
        this.numCamas = numCamas;
        this.presupuesto = presupuesto;
    }

    //Metodos get y set
    public String getNombreHospital() {
        return nombreHospital;
    }

    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    public String getCiudadHospital() {
        return ciudadHospital;
    }

    public void setCiudadHospital(String ciudadHospital) {
        this.ciudadHospital = ciudadHospital;
    }

    public int getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

}
