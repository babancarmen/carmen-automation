package com.siit.course.hw.c4;

import static java.lang.Math.pow;

public class MathFunctions {

    public static void main(String[] args) {
        System.out.println("Cube volume is: "+ computeVolume(new Cube(5)));
        System.out.println("Sphere volume is: "+ computeVolume(new Sphere(5)));
        System.out.println("Pyramid volume is: "+ computeVolume(new Pyramid(5, 4)));
        System.out.println("Torus volume is: "+ computeVolume(new Torus(3, 10)));
        System.out.println("Rectangular volume is: "+ computeVolume(new Rectangular(5, 6, 9)));
    }

    // Cube
    public static double computeVolume(Cube cube) {
        return pow(cube.edge, 3);
    }

    // Sphere
    public static double computeVolume(Sphere sphere) {
        return 4 * Math.PI * pow(sphere.radius, 3) / 3;
    }

    // Pyramid
    public static double computeVolume(Pyramid pyramid) {
        return pow(pyramid.edge, 2) * pyramid.height / 3;
    }
    // Torus
    public static double computeVolume(Torus torus){
        return Math.PI * pow(torus.minorRadius, 2) * 2 * Math.PI * torus.majorRadius;
    }
    // Rectangular Parallelepiped
    public static double computeVolume(Rectangular rectangular) {
        return rectangular.length * rectangular.width * rectangular.height;
    }

}

class Rectangular{
    int length;
    int width;
    int height;

    public Rectangular(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
}
class Torus{
    int minorRadius;
    int majorRadius;

    public Torus(int minorRadius, int majorRadius) {
        this.minorRadius = minorRadius;
        this.majorRadius = majorRadius;
    }
}
class Pyramid {
    int height;
    int edge;

    public Pyramid(int height, int edge) {
        this.height = height;
        this.edge = edge;
    }
}

class Cube {
    int edge;

    public Cube(int edge) {
        this.edge = edge;
    }
}

class Sphere {
    int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }
}
