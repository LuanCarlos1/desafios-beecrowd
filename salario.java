import java.util.Scanner;

public class salario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numFuncionario = sc.nextInt();
        int horasDeTrabalho = sc.nextInt();
        double valorPorHora = sc.nextDouble();

        double salary = horasDeTrabalho * valorPorHora;

        System.out.println("NUMBER = " + numFuncionario);
        System.out.printf("SALARY = %.2f\n", salary);

        sc.close();
    }
}
