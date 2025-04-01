import java.util.Scanner;

public class ConversaoDeTempo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tempoGasto = sc.nextInt();

        int horas, minutos, segundos;

        horas = tempoGasto / 3600;
        minutos = (tempoGasto % 3600) / 60;
        segundos = tempoGasto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();
    }
}
