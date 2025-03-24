import java.util.Scanner;

public class BonusSalario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double salary = sc.nextDouble();
        double sales = sc.nextDouble();

        double bonus = sales * 0.15;
        double total =  salary + bonus;

        System.out.printf("TOTAL = R$ %.2f\n", total);

        sc.close();
    }
}
