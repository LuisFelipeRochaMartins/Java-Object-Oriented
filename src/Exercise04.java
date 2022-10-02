import Objects.Salary;

import java.util.Scanner;
public class Exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.print("Informe o valor que você ganha por hora: ");
        double n = input.nextDouble();

        System.out.print("Informe quantas horas trabalha por mês: ");
        double time = input.nextDouble();



        Salary folha = new Salary(n,time);
        System.out.println(folha);
        input.close();
    }
}
