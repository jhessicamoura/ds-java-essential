package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade, soma = 0;
        double media, i = 0.0;

        System.out.println("Digite as idades: ");
        idade = sc.nextInt();

        if (idade > 0){
            for (i = 0; idade > 0; i++){
                soma += idade;
                idade = sc.nextInt();
            }
            media = soma / i;
            System.out.printf("MEDIA = %.2f", media);
        } else {
            System.out.println("IMPOSSIVEL CALCULAR");
        }


        sc.close();

    }
}
