import java.util.Scanner;

public class CalculoSimples {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codPart1 = sc.nextInt();
        int numPart1 = sc.nextInt();
        double pricePart1 = sc.nextDouble();

        int codPart2 = sc.nextInt();
        int numPart2 = sc.nextInt();
        double pricePart2 = sc.nextDouble();

        double total = (numPart1 * pricePart1) + (numPart2 * pricePart2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);


        sc.close();
    }
}
