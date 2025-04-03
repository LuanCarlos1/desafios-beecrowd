import java.util.Scanner;

public class IdadeEmDias {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vida = sc.nextInt();
        int anosDeVida = vida / 365;
        vida = vida % 365;
        int mesesDeVida = vida / 30;
        vida = vida % 30;

        System.out.println(anosDeVida + " ano(s)");
        System.out.println(mesesDeVida + " mes(es)");
        System.out.println(vida + " dia(s)");

        sc.close();
    }
}
