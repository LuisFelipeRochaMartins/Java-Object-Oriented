package Objects;

public class Person {

    private String name;
    private String surname;

    private int age;

    private double weight;

    private double height;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }
    public String getSurname(){
        return surname;
    }

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public Person(String name, String surname, int age, double kg, double h){
        this.name = name;
        this.surname = surname;
        this.age= age;
        this.weight=kg;
        this.height=h;
    }
    public String nomeCompleto(){
        return(name+" "+ surname);
    }
    public int growUp(int x){
        if (age<21){
            double n = height;
            height +=0.05;
        }
        return (x+1);
    }
    public double fat(double a,double b){
        setHeight(a+b);
        return (a+b);
    }
    public double loseWeight(double c,double d ){
        setHeight(c-d);
        return(c-d);
    }
    public double higher(double f, double h){
        setHeight(f+h);
        return(f+h);
    }
}
