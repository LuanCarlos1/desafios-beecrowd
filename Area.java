import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double areaTriangulo = (A * C) / 2;
        double areaCirculo = 3.14159 * (Math.pow(C,2));
        double areaTrapezio = ((A + B) * C) / 2;
        double areaQuadrado = Math.pow(B,2);
        double areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);

        input.close();
    }
}
