package fh.ima.swengb.models.Dim3;

import fh.ima.swengb.models.GeometricShapes;

/**
 * Created by laszlobalo on 05.11.16.
 */
public abstract class Dim3 extends GeometricShapes {

    protected double sideA;
    protected double sideB;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dim3 dim3 = (Dim3) o;

        if (Double.compare(dim3.sideA, sideA) != 0) return false;
        return Double.compare(dim3.sideB, sideB) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public abstract double calculateVolume();

    public abstract double calculateSurfaceArea();
}
