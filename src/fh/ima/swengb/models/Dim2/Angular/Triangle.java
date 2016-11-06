package fh.ima.swengb.models.Dim2.Angular;

/**
 * Created by laszlobalo on 05.11.16.
 */
public class Triangle extends Angular {


    public Triangle(double a, double b){
        this.length = a;
        this.width = b;
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
    public double calculateArea() {
        return (length*width)/2;
    }

    @Override
    public double calculatePerimeter() {
        return length+width+Math.sqrt(length*length+width*width);
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Triangle{");
        sb.append("a=").append(length);
        sb.append(", b=").append(width);
        sb.append(", area=").append(calculateArea());
        sb.append(", perimeter=").append(calculatePerimeter());
        sb.append('}');
        return sb.toString();

    }
}
