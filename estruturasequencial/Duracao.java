package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Duracao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int duracao, segundos, minutos, horas, resto;

        System.out.print("Digite a duracao em segundos: ");
        duracao = sc.nextInt();

        horas = duracao / 3600;
        resto = duracao % 3600;

        minutos = resto / 60;
        segundos = resto % 60;

        System.out.printf("%d:%d:%d", horas, minutos, segundos);

        sc.close();
    }
}
