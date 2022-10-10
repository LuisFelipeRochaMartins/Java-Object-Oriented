import Objects.Bank;

import java.util.Random;
import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("Creating account... ");
        int n = generator.nextInt(1, 9999);

        System.out.print("Type your name: ");
        String name = input.nextLine();

        System.out.print("How much many you want to deposit? ");
        double balance = input.nextDouble();

        Bank bank = new Bank(n, name, balance);
        System.out.println(bank);

        while (true) {

            String opc = input.nextLine();
            System.out.print("Want to deposit? Y/N ");
            opc = input.nextLine();
            if(opc.equalsIgnoreCase("Y")) {
                System.out.print("How much you want to deposit? ");
                double x = input.nextDouble();
                bank.deposit(x);
                opc = input.nextLine();
            }
            System.out.print("Want to withdraw? Y/N");
            opc = input.nextLine();
            if(opc.equalsIgnoreCase("Y")){
                double x = 0;
                System.out.print("How much you want to withdrw? ");
                x = input.nextDouble();
                bank.withdraw(x);
                opc = input.nextLine();
            }
            System.out.print("Want to leave? Y/N");
            opc = input.nextLine();


            if(opc.equalsIgnoreCase("Y")){
                break;
            }
        }
        System.out.println(bank);
    }
}
