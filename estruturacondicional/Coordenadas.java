package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Coordenadas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.print("Valor de X: ");
        x = sc.nextDouble();
        System.out.print("Valor de Y: ");
        y = sc.nextDouble();

        if (y > 0 && x > 0){
            System.out.println("Q1");
        } else if (y > 0 && x < 0){
            System.out.println("Q2");
        } else if (y < 0 && x < 0) {
            System.out.println("Q3");
        } else if (y < 0 && x > 0){
            System.out.println("Q4");
        } else if (y == 0 && x == 0) {
            System.out.println("Origem");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else {
            System.out.println("Eixo Y");
        }

        sc.close();




    }
}
