package fh.ima.swengb;

import fh.ima.swengb.models.Dim2.Angular.Parallelogram;
import fh.ima.swengb.models.Dim2.Angular.Triangle;
import fh.ima.swengb.models.Dim2.Dim2;
import fh.ima.swengb.models.Dim2.circular.Circle;
import fh.ima.swengb.models.Dim3.Circular.Cube;
import fh.ima.swengb.models.Dim3.Dim3;
import fh.ima.swengb.models.Dim3.Circular.Skittle;
import fh.ima.swengb.models.Dim3.Angular.SquarePyramid;
import fh.ima.swengb.models.GeometricShapes;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by laszlobalo on 05.11.16.
 */
public class Operations {

    public static void main(String[] args) {


        Operations operations = new Operations();
        operations.doit();

    }

    private void doit() {

        //dim2
        List<Dim2> dim2List = new ArrayList<>();
        fillList2dim(dim2List);
        printList(dim2List);


        //dim3
        List<Dim3> dim3List = new ArrayList<>();
        fillList3d(dim3List);
        printList3d(dim3List);



    }

    private void printList(List<Dim2> dim2List) {

        System.out.println("---------------------2 dim---------------------");

        double sumArea = 0;
        double sumPerimeter = 0;

        for (GeometricShapes geometricShape : dim2List) {
            System.out.println(geometricShape);
        }

        for (Dim2 geometricShape : dim2List) {
            sumArea += geometricShape.calculateArea();
        }

        System.out.println(String.format("sum of all areas = %.2f", sumArea));

        for (Dim2 geometricShape : dim2List) {
            sumPerimeter += geometricShape.calculatePerimeter();
        }

        System.out.println(String.format("sum of all perimeters = %.2f",sumPerimeter));
    }

    private void fillList2dim(List<Dim2> dim2List) {

        dim2List.add(new Parallelogram(3.0, 2.0, 1.414));
        dim2List.add(new Parallelogram(3.0, 2.0, 1.414));
        dim2List.add(new Triangle(3.0, 4.0));
        dim2List.add(new Triangle(3.0, 5.0));
        dim2List.add(new Circle(3.0));
        dim2List.add(new Circle(4.0));
    }





    private void fillList3d(List<Dim3> dim3List) {


        dim3List.add(new Cube(3.0));
        dim3List.add(new Skittle(3.0,5.0));
        dim3List.add(new SquarePyramid(3.0,3.0));
    }

    private void printList3d(List<Dim3> dim3List) {

        System.out.println("---------------------3 dim---------------------");

        double sumVolume = 0;
        double sumSurfaceArea = 0;

        for (Dim3 geometricShape : dim3List) {
            System.out.println(geometricShape);
        }

        for (Dim3 geometricShape : dim3List) {
            sumVolume += geometricShape.calculateVolume();

        }



        System.out.println(String.format("sum of all volumes = %.2f", sumVolume));

        for (Dim3 geometricShape : dim3List) {
            sumSurfaceArea += geometricShape.calculateSurfaceArea();
        }

        System.out.println(String.format("sum of all surfaces = %.2f",sumSurfaceArea ));

    }

}
