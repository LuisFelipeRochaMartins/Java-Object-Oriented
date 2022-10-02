import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número da sequência: ");
        int n1 = input.nextInt();

        System.out.println("Informe o segundo número da sequência: ");
        int n2 = input.nextInt();

        if(n1>n2){
            System.out.println("Inversão");
            for (int i = n2; i <= n1; i++) {
                System.out.print(i+"|");
            }
        }else{
            for (int k = n1; k <= n2; k++) {
                System.out.print(k+"|");
            }
        }
        input.close();
    }
}
