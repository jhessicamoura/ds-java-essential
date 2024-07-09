package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Terreno {
        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            double largura, comprimento, metroQuadrado, area, preco;

            System.out.print("Digite a largura do terreno: ");
            largura = sc.nextDouble();
            System.out.print("Digite o comprimento do terreno: ");
            comprimento = sc.nextDouble();
            System.out.print("Digite o valor do metro quadrado: ");
            metroQuadrado = sc.nextDouble();

            area = largura * comprimento;
            System.out.printf("Area do terreno = %.2f%n", area);

            preco = metroQuadrado * area;
            System.out.printf("Preço do terreno = %.2f", preco);

            sc.close();

        }
}