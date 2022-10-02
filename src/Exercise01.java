import Objects.Person;

import java.util.Scanner;
public class Exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String n = input.nextLine();

        System.out.print("Informe seu sobrenome: ");
        String surname = input.nextLine();

        Person person = new Person(n,surname);
        System.out.println(person.nomeCompleto());

        input.close();
    }
}
