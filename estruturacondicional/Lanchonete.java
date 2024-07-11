package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod, qntd;
        double total, preco;

        System.out.print("Codigo do produto comprado: ");
        cod = sc.nextInt();
        System.out.print("Quantidade comprada: ");
        qntd = sc.nextInt();

        if (cod == 1) {
            preco = 5.00;
        } else if (cod == 2) {
            preco = 3.50;
        } else if (cod == 3){
            preco = 4.80;
        } else if (cod == 4) {
            preco = 8.90;
        } else {
            preco = 7.32;
        }

        total = preco * qntd;
        System.out.printf("Valor a pagar: R$ %.2f", total);

        sc.close();

    }
}
