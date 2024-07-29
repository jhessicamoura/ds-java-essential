package estrutura_repetitiva;

import java.util.Scanner;

public class DentroFora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, numero = 0, dentro = 0, fora = 0;

        System.out.print("Quantos numeros você vai digitar? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();
            if (numero >= 10 && numero <= 20){
                dentro++;
            } else {
            fora++;
            }
        }

        System.out.println(dentro + " DENTRO");
        System.out.print(fora + " FORA");

        sc.close();

    }
}
