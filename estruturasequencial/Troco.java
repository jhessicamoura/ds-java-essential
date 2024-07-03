package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Troco {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double precoUnd, pagamento, troco;
        int qntUnd;

        System.out.print("Preço unitário do produto: ");
        precoUnd = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        qntUnd = sc.nextInt();
        System.out.print("Dinheiro recebido: ");
        pagamento = sc.nextDouble();

        troco = pagamento - (precoUnd * qntUnd);
        System.out.printf("TROCO = %.2f", troco);

    }

}
