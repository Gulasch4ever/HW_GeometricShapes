package fh.ima.swengb.models.Dim2.Angular;


import fh.ima.swengb.models.Dim2.Dim2;

/**
 * Created by laszlobalo on 05.11.16.
 */
public abstract class Angular extends Dim2 {

    protected double length;
    protected double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Angular angular = (Angular) o;

        if (Double.compare(angular.length, length) != 0) return false;
        return Double.compare(angular.width, width) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(length);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
