package com.company;

public class Point
{
    public Point(double abscissa, double ordinate)
    {
        this.abscissa = abscissa;
        this.ordinate = ordinate;
    }

    public boolean onXaxis()
    {
        return ordinate == 0;
    }

    public boolean isSame(Point p2)
    {
        return (p2.abscissa == abscissa) && (p2.ordinate == ordinate);
    }

    public double distance (Point p2)
    {
        return Math.sqrt((p2.abscissa - abscissa)*(p2.abscissa - abscissa) + (p2.ordinate-ordinate)*(p2.ordinate-ordinate));
    }

    public boolean inUnitCircle()
    {
        return (abscissa * abscissa + ordinate * ordinate) <= 1;
    }

    public Point midpoint(Point p2)
    {
        double x = (abscissa + p2.abscissa)/2;
        double y = (ordinate + p2.ordinate)/2;
        return new Point(x,y);
    }

    public String toString()
    {
        return ("(" + abscissa + ", " + ordinate + ")");
    }

    double abscissa;
    double ordinate;
}
