package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distancia;
        double mediaConsumo, combustivelGasto;

        System.out.print("Distancia percorrida: ");
        distancia = sc.nextInt();
        System.out.print("Combustível gasto: ");
        combustivelGasto = sc.nextDouble();

        mediaConsumo = distancia / combustivelGasto;
        System.out.printf("Combustível medio = %.3f", mediaConsumo);

        sc.close();

    }
}
