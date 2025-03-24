import java.util.Scanner;

public class Esfera {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double ray = input.nextDouble();

        double volume = ((4.0 / 3) * 3.14159 * Math.pow(ray,3));

        System.out.printf("VOLUME = %.3f\n", volume);

        input.close();
    }
}
