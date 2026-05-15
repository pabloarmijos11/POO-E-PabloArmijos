
public class triangulo {

    public int id;
    public int numLados;
    public int numVertices;
    public String color;
    public double area;
    public double perimetro;
    public String tipo;
    public double base;
    public double altura;
    public double lado1;
    public double lado2;
    public double lado3;

    public void calcularArea() {
        area = 0.5 * base * altura;
    }

    public void calcularPerimetro() {
        perimetro = lado1 + lado2 + lado3;
    }

    public double calcularAngulos() {
        double angulo1 = Math.acos((Math.pow(lado2, 2) + Math.pow(lado3, 2) - Math.pow(lado1, 2)) / (2 * lado2 * lado3));
        double angulo2 = Math.acos((Math.pow(lado1, 2) + Math.pow(lado3, 2) - Math.pow(lado2, 2)) / (2 * lado1 * lado3));
        double angulo3 = Math.acos((Math.pow(lado1, 2) + Math.pow(lado2, 2) - Math.pow(lado3, 2)) / (2 * lado1 * lado2));
        return angulo1 + angulo2 + angulo3;
    }

}
