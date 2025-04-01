import java.util.Scanner;

public class Cedulas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valorTotal = sc.nextInt();
        System.out.println(valorTotal);

        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        for (int nota : notas) {
            int quantidade = valorTotal / nota;
            System.out.println(quantidade + " nota(s) de R$ " + nota + ",00");
            valorTotal %= nota;
        }

        sc.close();

    }
}
