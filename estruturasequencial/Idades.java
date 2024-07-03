package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Idades {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome1, nome2;
        int idade1, idade2;
        double media;

        System.out.println("Dados da primeira pessoa:");
        System.out.print("Nome: ");
        nome1 = sc.nextLine();
        System.out.print("Idade: ");
        idade1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Dados da segunda pessoa:");
        System.out.print("Nome: ");
        nome2 = sc.nextLine();
        System.out.print("Idade: ");
        idade2 = sc.nextInt();

        media = (idade1 + idade2) / 2;
        System.out.printf("Aidade média de %s e %s é de %.1f anos", nome1, nome2, media);

    }

}
