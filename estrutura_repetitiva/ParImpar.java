package estrutura_repetitiva;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, num = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            num = sc.nextInt();
            if (num % 2 == 0 && num > 0){
                System.out.println("PAR POSITIVO");
            } else if (num % 2 == 0 && num < 0) {
                System.out.println("PAR NEGATIVO");
            } else if (num % 2 != 0 && num > 0) {
                System.out.println("IMPAR POSITIVO");
            } else if (num % 2 != 0 && num < 0) {
                System.out.println("IMPAR NEGATIVO");
            } else {
                System.out.println("NULO");
            }
        }

        sc.close();

    }
}
