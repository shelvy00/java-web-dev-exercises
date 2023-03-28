package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {

    public static void main(String[] args) {
//        double radius;
//        double result;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        Double radius = input.nextDouble();
        input.close();

        //Double result = 3.14 * radius * radius;
        Double result = Circle.getArea(radius);
        System.out.println("The area of a circle of radius" + radius + "is:" + result);
    }
}
