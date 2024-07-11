package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Aumento {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salarioAtual, novoSalario, aumento = 0.0;
        int porcentagem = 0;

        System.out.print("Digite o salario da pessoa: ");
        salarioAtual = sc.nextDouble();

        if (salarioAtual <= 1000.00) {
            aumento = (salarioAtual * 20) / 100;
            porcentagem = 20;
        } else if (salarioAtual > 1000.00 && salarioAtual <= 3000.00) {
            aumento = (salarioAtual * 15) / 100;
            porcentagem = 15;
        } else if (salarioAtual > 3000.00 && salarioAtual <= 8000.00) {
            aumento = (salarioAtual * 10) / 100;
            porcentagem = 10;
        } else {
            aumento = (salarioAtual * 5) / 100;
            porcentagem = 5;
        }

        novoSalario = salarioAtual + aumento;
        System.out.printf("Novo salario = %.2f%n", novoSalario);
        System.out.printf("Aumento = R$ %.2f%n", aumento);
        System.out.printf("Porcentagem =  %d %%", porcentagem);

        sc.close();
    }
}
