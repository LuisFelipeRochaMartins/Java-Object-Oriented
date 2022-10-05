import Objects.Square;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Square quad = new Square();

        System.out.println("Informe o valor do lado do quadrado: ");
        double n = input.nextDouble();

        quad.getSide(n);

        System.out.println("Área do quadrado com lado de " + quad.areaSqr(n));
        ;

        String opc = input.nextLine();
        System.out.println("Deseja mudar de valor? " +
                "\nS - Para mudar " +
                "\nQualquer outra tecla para não mudar ");
        opc = input.nextLine();

        if (opc.equalsIgnoreCase("s")) {
            System.out.println("Informe o valor do lado do quadrado: ");
            n = input.nextDouble();
            quad.getSide(n);

            System.out.println("Área do quadrado com lado de " + quad.areaSqr(n));
            ;
        }

    }

}
