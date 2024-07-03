package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Circulo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double r, area, pi=3.14159;

        System.out.print("Digite o valor do raio do circulo: ");
        r = sc.nextDouble();

        area = pi * (Math.pow(r, 2.0));
        System.out.printf("AREA = %.3f", area);

    }
}
