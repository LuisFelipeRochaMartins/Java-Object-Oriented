package Objects;

import java.nio.MappedByteBuffer;

public class Menu {
    private double cachorro = 1.20f;

    private double bauruS = 1.30f;

    private double bauruO = 1.50f;

    private double hamburger = 1.20f;

    private double chesseb = 1.30f;

    private double soda = 1;

    public void setCachorro(double cachorro) {
        this.cachorro = cachorro;
    }

    public void setBauruS(double bauruS) {
        this.bauruS = bauruS;
    }

    public void setBauruO(double bauruO) {
        this.bauruO = bauruO;
    }

    public void setHamburger(double hamburger) {
        this.hamburger = hamburger;
    }

    public void setChesseb(double chesseb) {
        this.chesseb = chesseb;
    }

    public void setSoda(double soda) {
        this.soda = soda;
    }


    public double valueCachorro(int a){
        return(cachorro*a);
    }
    public double valueBauruS(int b){
        return(bauruS*b);
    }
    public double valueBauruO(int c) {
        return (bauruO * c);
    }
    public double valueHamburger(int d) {
        return (hamburger * d);
    }
    public double valueChesseb (int e){
        return (chesseb*e);
    }public double valueSoda (int f){
        return (soda*f);
    }
    public String billMostrar (int a,int b,int c, int d, int e,int f){
        StringBuilder bill = new StringBuilder();
        bill.append("Cachorro Quente : R$ ").append(valueCachorro(a)+"\n");
        bill.append("Bauru Simples : R$ ").append(valueBauruS(b)+"\n");
        bill.append("Bauru Com Ovo : R$ ").append(valueBauruO(c)+"\n");
        bill.append("Hamburger: R$ ").append(valueHamburger(d)+"\n");
        bill.append("Chesseburger : R$ ").append(valueChesseb(e)+"\n");
        bill.append("Refrigerante : R$ ").append(valueSoda(f)+"\n");
        bill.append("Total : R$ ").append(valueSoda(a)+valueBauruS(b)+valueBauruO(c)+valueHamburger(d)+valueChesseb(e)+valueSoda(f));
        return (bill.toString());
    }
}
