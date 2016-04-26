package dz.module4;

/**
 * Created by Володимир on 25.04.2016.
 */
public class Rectangle extends Figure {
    private double h;
    private double w;

    public Rectangle(double h, double w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public double square() {
        return h *w;
    }
}
