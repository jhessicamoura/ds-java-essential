package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class MenorDeTres {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valor1, valor2, valor3;

        System.out.print("Primeiro valor: ");
        valor1 = sc.nextInt();
        System.out.print("Segundo valor: ");
        valor2 = sc.nextInt();
        System.out.print("Terceiro valor: ");
        valor3 = sc.nextInt();

        if ((valor1 < valor2) && (valor1 < valor3)){
            System.out.print("MENOR = " + valor1);
        } else if ((valor2 < valor1) && (valor2 < valor3)){
            System.out.print("MENOR = " + valor2);
        } else {
            System.out.print("MENOR = " + valor3);
        }

        sc.close();

    }
}
