package Objects;

public class Square {

    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide(double side) {
        return side;
    }

    public double areaSqr(double getSide) {
        return (getSide * getSide);
    }

    public void changeSideValue(double x) {
        side = getSide(x);
    }
}
