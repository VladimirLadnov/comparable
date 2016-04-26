package dz.module4;

/**
 * Created by ��������� on 25.04.2016.
 */
public class Triangle extends Figure {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double square() {
        return 0.5 * base * height;
    }
}
