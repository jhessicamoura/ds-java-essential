package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Operadora {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos;
        double valorFatura;

        System.out.print("Digite a quantidade de minutos: ");
        minutos = sc.nextInt();

        valorFatura = 50.0;

        if (minutos > 100) {
            valorFatura = valorFatura + (minutos - 100) * 2.0;
        }

        System.out.printf("Valor a pagar: R$ %.2f", valorFatura);

        sc.close();

    }
}
