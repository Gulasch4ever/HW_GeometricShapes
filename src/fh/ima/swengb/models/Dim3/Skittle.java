package fh.ima.swengb.models.Dim3;

/**
 * Created by laszlobalo on 05.11.16.
 */
public class Skittle extends Dim3 {

    public Skittle(double r,double h){
        this.sideA = r;
        this.sideB = h;
    }

    @Override
    public double calculateVolume() {
        return (1/3)*sideA*sideA*sideB;
    }

    @Override
    public double calculateSurfaceArea() {
        return Math.PI*sideA*(sideA+Math.sqrt(sideA*sideA+sideB*sideB));
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
        final StringBuffer sb = new StringBuffer("Skittle{");
        sb.append("r=").append(sideA);
        sb.append("h=").append(sideB);
        sb.append(", volume=").append(calculateVolume());
        sb.append(", surface area=").append(calculateSurfaceArea());
        sb.append('}');
        return sb.toString();

    }
}
