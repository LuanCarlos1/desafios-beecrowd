import java.util.Scanner;

public class Distancia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int distanciaKm = sc.nextInt();
        int tempo = distanciaKm * 2;

        System.out.println(tempo + " minutos");

        sc.close();
    }
}
