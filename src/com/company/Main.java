package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Point p1 = new Point(-0.4, -0.9);
        Point p2 = new Point(8.6, 9.1);

        //One-point method implementation
        System.out.println("Is the point on x-axis: " + p1.onXaxis());
        System.out.println("Is the point located in the unit circle: " + p1.inUnitCircle());

        //Two-point method implementation
        System.out.println("The midpoint of the two points is: " + p1.midpoint(p2));
        System.out.println("Distance between the two points is: " + p1.distance(p2));
        System.out.println("Are the two points equal: " + p1.isSame(p2));

    }
}
