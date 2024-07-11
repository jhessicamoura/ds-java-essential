package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2, resto, resultado;

        System.out.println("Digite dois numeros inteiros: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        //Primeiro if ajusta a ordem que o usuario digitou os numeros para fazer a divisão
        if (num1 > num2){
            resultado = num1 / num2;
            resto = num1 % num2;
        } else {
            resultado = num2 / num1;
            resto = num2 % num1;
        }

        //Segundo if determina se são multiplos ou não a partir do resto da divisão acima
        if (resto == 0){
            System.out.println("São multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }

        sc.close();

    }
}
