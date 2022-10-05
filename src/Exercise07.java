import Objects.Person;

import java.util.Scanner;
public class Exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Informe seu nome: ");
        String name = input.nextLine();

        System.out.print("Informe seu sobrenome idade");
        String surname = input.nextLine();

        System.out.print("Informe sua idade: ");
        int age = input.nextInt();

        System.out.print("Informe seu peso: ");
        double n = input.nextDouble();

        System.out.print("Informe sua altura: ");
        double h = input.nextDouble();

        Person person = new Person(name,surname,age,n,h);

        System.out.println(person.growUp(age));
        System.out.println(person.getHeight());
        double d = 2;
        double f = 0.03;
        System.out.println(person.loseWeight(n,d));
        System.out.println(person.fat(n,d));
        System.out.println(person.higher(h,f));



    }
}
