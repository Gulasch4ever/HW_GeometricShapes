package fh.ima.swengb;

import fh.ima.swengb.models.Dim2.Angular.Parallelogram;
import fh.ima.swengb.models.Dim2.Angular.Triangle;
import fh.ima.swengb.models.Dim2.circular.Circle;
import fh.ima.swengb.models.Dim3.Cube;
import fh.ima.swengb.models.Dim3.Skittle;
import fh.ima.swengb.models.Dim3.SquarePyramid;
import sun.applet.Main;

/**
 * Created by laszlobalo on 05.11.16.
 */
public class Operations {

    public static void main(String[] args) {


        Main main = new Main();
        main.doit();

    }

    private void doit(){



        System.out.println("---------------------2 dim---------------------");

        Parallelogram p1 = new Parallelogram(3.0,2.0,1.414);
        System.out.println(p1);

        Triangle t1 = new Triangle(3.0,4.0);
        Triangle t2 = new Triangle(3.0,4.0);
        System.out.println(t1.equals(t2));
        System.out.println(t1);

        Circle c1 = new Circle(3.0);
        Circle c2 = new Circle(3.0);
        System.out.println(c1.equals(c2));
        System.out.println(c1);




        System.out.println("---------------------3 dim---------------------");

        Cube cube1 = new Cube(3.0);
        System.out.println(cube1);

        Skittle skitte1 = new Skittle(3.0,5.0);
        System.out.println(skitte1);

        SquarePyramid s1 = new SquarePyramid(3.0,3.0);
        System.out.println(s1);


    }
}
