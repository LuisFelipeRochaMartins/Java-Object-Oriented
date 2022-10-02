import Objects.Menu;

import java.util.Scanner;
public class Exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu conta = new Menu();

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        boolean run = true;

        while (run){
            System.out.println("Quantos cachorros quentes você quer? ");
            n1+= input.nextInt();

            System.out.println("Quantos bauru simples você quer? ");
            n2+= input.nextInt();

            System.out.println("Quantos bauru com ovo você quer? ");
            n3+= input.nextInt();

            System.out.println("Quantos hamburgers você quer? ");
            n4+= input.nextInt();

            System.out.println("Quantos chesseburgers você quer? ");
            n5+= input.nextInt();

            System.out.println("Quantos refrigerantes você quer? ");
            n6+= input.nextInt();

            String opc = input.nextLine();
            System.out.println("Deseja continuar? " +
                    "\nS - Para continuar" +
                    "\nQualquer outra tecla para cancelar");
            opc = input.nextLine();
            if(!(opc.equalsIgnoreCase("s"))){
                break;
            }
        }
        System.out.println(conta.bill(n1,n2,n3,n4,n5,n6));


    }

}
