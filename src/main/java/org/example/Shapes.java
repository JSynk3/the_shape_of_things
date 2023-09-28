package org.example;

import java.util.ArrayList;
import java.util.List;

public class Shapes {

    public static void main(String[] args) {



        ThreeDimensionalShape sphere = new Sphere(2.0);
        ThreeDimensionalShape cube = new Cube(5.0);
        ThreeDimensionalShape cylinder = new Cylinder(4.0, 1.0);
        ThreeDimensionalShape cube2 = new Cube(3.625);


        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cube2);
        shapes.add(cylinder);


        shapes.forEach(System.out::println);


    }

}
