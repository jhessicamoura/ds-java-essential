package estrutura_repetitiva;

import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool = 0, gasolina = 0, diesel = 0, codigo = 0;

        System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
        codigo = sc.nextInt();

        while (codigo != 4){
            if (codigo == 1){
                alcool ++;
            } else if (codigo == 2) {
                gasolina ++;
            } else if (codigo == 3){
                diesel ++;
            }
            System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
            codigo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();

    }
}
