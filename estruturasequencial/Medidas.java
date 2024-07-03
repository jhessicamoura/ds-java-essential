package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Medidas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, quadrado, triangulo, trapezio;

        System.out.print("Digite a medida A: ");
        A = sc.nextDouble();
        System.out.print("Digite a medida B: ");
        B = sc.nextDouble();
        System.out.print("Digite a medida C: ");
        C = sc.nextDouble();

        quadrado = A * 4;
        triangulo = (A * B) /2;
        trapezio = ((A + B) * C) /2;

        System.out.printf("AREA DO QUADRADO = %.4f%n", quadrado);
        System.out.printf("AREA DO TRIANGULO = %.4f%n", triangulo);
        System.out.printf("AREA DO TRAPEZIO = %.4f%n", trapezio);

    }
}
