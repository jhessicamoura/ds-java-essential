package estrutura_repetitiva;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, fatorial = 0;

        System.out.print("Digite o valor de N: ");
        n = sc.nextInt();

        for (int i = n; i > 0; i--){
            n *= i;
            fatorial = n;
        }

        System.out.println("FATORIAL = " + fatorial);

        sc.close();

    }
}
