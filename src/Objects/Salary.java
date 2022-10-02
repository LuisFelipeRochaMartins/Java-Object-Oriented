package Objects;

public class Salary {

    private double hour;
    private double month;
    private double bruto;
    private double IR = 0.11f;
    private double INSS = 0.08f;
    private double sindicate = 0.05f;

    public Salary(double hour, double month){
        this.setHour(hour);
        this.setMonth(month);
        this.bruto = (hour*month);
    }
    public double valueINSS(){
        return (INSS*bruto);
    }
    public double valueIR(){
        return (IR*bruto);
    }
    public double valueSindicate(){
        return (sindicate*bruto);
    }
    public double valueLiquido(){
        return((bruto)-(valueINSS())-(valueSindicate())-(valueIR()));
    }
    private void setMonth(double month) {
        this.month  = month;
    }
    private void setHour(double hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("Salário Bruto :R$ ").append(bruto+"\n");
        sb.append("INSS :R$ ").append(valueINSS()+"\n");
        sb.append("Sindicato : R$ ").append(valueSindicate()+"\n");
        sb.append("IR : R$ ").append(valueIR()+"\n");
        sb.append("Salário Líquido : R$ ").append(valueLiquido()+"\n");
        return sb.toString();
    }
}
