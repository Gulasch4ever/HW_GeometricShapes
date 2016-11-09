package fh.ima.swengb.models.Dim3.Angular;

import fh.ima.swengb.models.Dim3.Dim3;

/**
 * Created by laszlobalo on 05.11.16.
 */
public class SquarePyramid extends Angular3D {

    public SquarePyramid(double a, double h){
        this.sideA = a;
        this.sideB = h;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public double calculateVolume() {
        return (1.0/3.0)*sideA*sideA*sideB;
    }

    @Override
    public double calculateSurfaceArea() {
        return sideA*sideA+2*sideA*Math.sqrt((sideA/2.0)*(sideA/2.0)+sideB*sideB);
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SquarePyramid{");
        sb.append("a=").append(sideA);
        sb.append("h=").append(sideB);
        sb.append(", volume=").append(calculateVolume());
        sb.append(", surface area=").append(calculateSurfaceArea());
        sb.append('}');
        return sb.toString();

    }
}
