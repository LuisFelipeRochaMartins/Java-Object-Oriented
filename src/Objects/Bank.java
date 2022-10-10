package Objects;

public class Bank {

    private int account;
    private String name;
    private double balance;

    public Bank (int account, String name, double balance){
        this.account = account;
        this.name = name;
        this.balance=balance;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void deposit(double n){
        this.balance+=n;
    }
    public void withdraw(double n){
        this.balance-=n;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("Account : ").append(account+"\n");
        sb.append("Name : ").append(name+"\n");
        sb.append("Balance :").append(balance+"\n");
        return sb.toString();
    }
}
