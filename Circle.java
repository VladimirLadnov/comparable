package dz.module4;

/**
 * Created by Володимир on 25.04.2016.
 */
public class Circle extends Figure{
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double square() {
        return Math.PI * r * r;
    }
}
