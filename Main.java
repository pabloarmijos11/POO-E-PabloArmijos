
public class main {

    public static void main(String[] args) {

        triangulo miTriangulo = new triangulo();

        miTriangulo.base = 5.0;
        miTriangulo.altura = 3.0;
        miTriangulo.lado1 = 5.0;
        miTriangulo.lado2 = 4.0;
        miTriangulo.lado3 = 3.0;

        miTriangulo.calcularArea();
        miTriangulo.calcularPerimetro();
        double angulos = miTriangulo.calcularAngulos();

        System.out.println("Area del triangulo: " + miTriangulo.area);
        System.out.println("Perimetro del triangulo: " + miTriangulo.perimetro);
        System.out.println("Suma de angulos del triangulo: " + angulos);
    }

}
