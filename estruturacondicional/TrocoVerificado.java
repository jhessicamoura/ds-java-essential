package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class TrocoVerificado {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double precoUnd, dinheiroRecebido, troco, total;
        int qntUnd;

        System.out.print("Preço unitário do produto: ");
        precoUnd = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        qntUnd = sc.nextInt();
        System.out.print("Dinheiro recebido: ");
        dinheiroRecebido = sc.nextDouble();

        total = precoUnd * qntUnd;
        troco = dinheiroRecebido - total;

        if (troco < 0){
            troco = total - dinheiroRecebido;
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", troco);
        } else {
            System.out.printf("TROCO = %.2f", troco);
        }

        sc.close();

    }

}
