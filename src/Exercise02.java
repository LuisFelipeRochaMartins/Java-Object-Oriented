import Objects.Sequence;

import java.util.Scanner;
public class Exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número da sequência: ");
        int n1 = input.nextInt();

        System.out.println("Informe o segundo número da sequência: ");
        int n2 = input.nextInt();
        int n3 = 0;

        if(n2<n1){
            n3 = n1;
            n1 = n2;
            n2 = n3;
        }

        Sequence se = new Sequence(n1,n2);
        System.out.println(se);
        input.close();
    }
}
