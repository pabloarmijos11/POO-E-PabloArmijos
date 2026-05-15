public class EjecutarCuerpoHumano {
    public static void main(String[] args) {
         //1. Crear Objetos 
         Soporte s1 = new Soporte();
         Cerebro c1 = new Cerebro();
         Pulmones pl1 = new Pulmones();
         Pulmones pl2 = new Pulmones();
         CuerpoHumano cpUno = new CuerpoHumano();
         
         //2. Asignar valores
         s1.setSerie("Sop001");
         s1.setMaterial("Plastico");
         s1.setTamanio(156);
         
         c1.setIdCerebro("Cer001");
         c1.setColor("gris");
         c1.setForma("Ovalado");
         c1.setCantNeuronas(40);
         c1.setEstado("Activo");
         
         pl1.setIdPulmon("Pul015");
         pl1.setColor("Blanco");
         pl1.setPeso("5 kg");
         pl1.setAlveolos(578);
         
         //Cuerpo Humano
         
         cpUno.setSerieCH("CH007");
         cpUno.setColor("cafe");
         cpUno.setMaterial("Plastico");
         cpUno.setTamanio("156 cm");
         cpUno.setPeso("80 kg");
         cpUno.setC(c1);
         cpUno.setP(pl1);
         cpUno.setS(s1);
         
         //Mostrar Datoos en pantalla
         
         System.out.println("-------- CUERPO HUMANO #" +cpUno.getSerieCH()+ " --------");
         System.out.println(" * Cantidad de alveolos: " +cpUno.getP().getAlveolos() +" millones");
         System.out.println(" * Cantidad de neuronas: " +cpUno.getC().getCantNeuronas());
         System.out.println(" ** Con esta cantidad de neuronas, el nivel intelectual es " +cpUno.getC().pensar());
         System.out.println(" * El precio del cuerpo humano es de: $" + cpUno.calcularPrecio());
         System.out.println(" * El cuerpo pesa " +cpUno.getPeso()+ " y mide " + cpUno.getTamanio());
         
         
    }
}
