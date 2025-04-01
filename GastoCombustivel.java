import java.util.Scanner;

public class GastoCombustivel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tempoGasto = sc.nextInt();
        int velocidadeMedia = sc.nextInt();

        int kmPercorrido = tempoGasto * velocidadeMedia;

        double litrosGastos = kmPercorrido / 12.0;

        System.out.printf("%.3f\n", litrosGastos);

        sc.close();
    }
}
