package fh.ima.swengb.models.Dim2.circular;

import fh.ima.swengb.models.Dim2.Dim2;

/**
 * Created by laszlobalo on 05.11.16.
 */
public abstract class Circular extends Dim2 {

    protected double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circular circular = (Circular) o;

        return Double.compare(circular.radius, radius) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }
}
