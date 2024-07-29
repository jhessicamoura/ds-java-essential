package estrutura_repetitiva;

import java.util.Scanner;

public class SequenciaImpares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, contador = 1;

        System.out.print("Digite o valor de x: ");
        x = sc.nextInt();

        for (int i = 0; contador < x; i++){
            System.out.println(contador);
            contador += 2;
        }

        sc.close();

    }
}
