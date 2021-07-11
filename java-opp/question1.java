//The time period of a Simple Pendulum is given by the formula:
//T = 2π√(l/g)
//Write a program to calculate the time period of a Simple Pendulum by taking length and
//acceleration due to gravity (g) as inputs.

import java.util.*;
class Pendulam{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length: ");
        double l = in.nextDouble();
        System.out.print("Enter g: ");
        double g = in.nextDouble();
        double t = 2 * (22.0 / 7.0) * Math.sqrt(l/g);
        System.out.println("T = " + t);
    }
}