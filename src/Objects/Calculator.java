package Objects;

public class Calculator {
    private double n1;
    private double n2;

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double sum(){
        return(this.n1+this.n2);
    }
    public double subtration(){
        return(this.n1-this.n2);
    }
    public double multiplication(){
        return(this.n1*this.n2);
    }
    public double division (){
        if(this.n2!=0) {
            return (this.n1 / this.n2);
        }else{
            throw new IllegalArgumentException("Argumento inválido, divisão por 0");
        }
    }

}
