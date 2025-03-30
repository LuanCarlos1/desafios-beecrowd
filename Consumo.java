import java.util.Scanner;

public class Consumo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int distanciaPercorrida = sc.nextInt();
        double totalGasto = sc.nextDouble();

        double consumo = distanciaPercorrida/totalGasto;

        System.out.printf("%.3f km/l\n", consumo);

        sc.close();
    }
}
