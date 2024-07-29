package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double media = 0.0, num1 = 0.0, num2 = 0.0, num3 = 0.0;

        System.out.print("Quantos casos voce vai digitar? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Digite tres numeros: ");
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();
            num3 = sc.nextDouble();

            media = ((num1 * 2) + (num2 * 3) + (num3 * 5)) / 10;
            System.out.printf("MEDIA = %.1f%n", media);

        }

        sc.close();

    }
}
