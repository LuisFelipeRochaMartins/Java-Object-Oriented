package Objects;

public class Sequence {
    private int n1;
    private int n2;

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    public Sequence(int x,int y){
        this.setN1(x);
        this.setN2(y);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sequence ");
        for (int i = n1+1; i <n2; i++) {
            sb.append(i+"|");
        }
        return (sb.toString());
    }
}

