package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Glicose {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double glicose;

        System.out.print("Digite a medida da glicose: ");
        glicose = sc.nextDouble();

        if (glicose > 140.0) {
            System.out.print("Classificacao: diabetes");
        } else if (glicose > 100.0 && glicose <= 140.0 ) {
            System.out.print("Classificacao: elevado");
        } else if (glicose <= 100) {
            System.out.print("Classificacao: normal");
        }

        sc.close();

    }

}
