package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Terreno {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura, comprimento, valor_metro, area, preco;

        System.out.printf("Digite a largura do terreno: ");
        largura = sc.nextDouble();
        System.out.printf("Digite o comprimento do terreno: ");
        comprimento = sc.nextDouble();
        System.out.printf("Digite o valor do metro quadrado: ");
        valor_metro = sc.nextDouble();

        area = comprimento * largura;
        System.out.printf("Area do terreno = %.2f%n", area);

        preco = valor_metro * area;
        System.out.printf("Preco do terreno = %.2f", preco);


        sc.close();

    }


}