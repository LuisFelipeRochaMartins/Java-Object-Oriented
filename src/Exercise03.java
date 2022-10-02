import Objects.Calculator;

import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        double int1 = input.nextInt();

        System.out.println("Informe outro número: ");
        double int2 = input.nextInt();

        Calculator calc = new Calculator();
        calc.setN1(int1);
        calc.setN2(int2);

        int operator = input.nextInt();

        System.out.println("Escolha o que deseja fazer : " +
                "\n1 - Para Soma" +
                "\n2 - Para Substração" +
                "\n3 - Para Multiplicação" +
                "\n4 - Para Divisão");
        operator = input.nextInt();
        if (operator==1){
            System.out.println(calc.sum());
        } else if (operator==2){
            System.out.println(calc.subtration());
        }else if (operator==3){
            System.out.println(calc.multiplication());
        } else if (operator==4){
            System.out.println(calc.division());
        }
        else if(operator<1 || operator>4){
            System.out.println("Operação inválida");
        }

    }
}
