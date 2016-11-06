package fh.ima.swengb.models.Dim3;



/**
 * Created by laszlobalo on 05.11.16.
 */
public class Cube extends Dim3 {

    public Cube(double a){
        this.sideA = a;
    }

    @Override
    public double calculateVolume() {
        return sideA*sideA*sideA;
    }

    @Override
    public double calculateSurfaceArea() {
        return 6*(sideA*sideA);
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
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cube{");
        sb.append("a=").append(sideA);
        sb.append(", volume=").append(calculateVolume());
        sb.append(", surface area=").append(calculateSurfaceArea());
        sb.append('}');
        return sb.toString();

    }
}
