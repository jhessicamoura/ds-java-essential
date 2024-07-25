package estrutura_repetitiva;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Deseja a tabuada para qual valor? ");
        N = sc.nextInt();

        for (int i = 0; i <= 10; i++){
            System.out.println(N + " x " + i + " = " + N*i);
        }

        sc.close();

    }
}
