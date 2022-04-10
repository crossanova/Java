import java.util.*;
import java.lang.Math;
import java.io.*;

class Quad {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c;
        double[] x = new double[2];
        System.out.println("Quadratic equation is of the form : ");
        System.out.println("ax^2 + bx + c = 0\n");
        System.out.println("Enter the following values");
        System.out.print("Coefficient of x^2 (a) = ");
        try {
            a = Integer.parseInt(br.readLine());
            if (a == 0) {
                System.out.println("");
                throw new ArithmeticException("Can't have 0 as the coefficient of x^2.");
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.print("\nCoefficient of x^2 (a) = ");
            a = Integer.parseInt(br.readLine());
        }
        System.out.print("Coefficient of x (b) = ");
        b = Integer.parseInt(br.readLine());
        System.out.print("Value of c = ");
        c = Integer.parseInt(br.readLine());
        System.out.println("\nYour equation is : ");
        if (a == 1) {
            if (b == 0){
                if (c == 0) {
                    System.out.println("x^2 = 0");
                }
                else if (c < 0) {
                    System.out.println("x^2 - " + (-1 * c) + " = 0");
                }
                else {
                    System.out.println("x^2 + " + c + " = 0");
                }
            }
            else if (b == 1) {
                if (c == 0) {
                    System.out.println("x^2 + x = 0");
                }
                else if (c < 0) {
                    System.out.println("x^2 + x - " + (-1 * c) + " = 0");
                }
                else {
                    System.out.println("x^2 + x + " + c + " = 0");
                }
            }
            else if (b < 0) {
                if (c == 0) {
                    System.out.println("x^2 - " + (-1 * b) + "x = 0");
                }
                else if (c < 0) {
                    System.out.println("x^2 - " + (-1 * b) + "x - " + (-1 * c) + " = 0");
                }
                else {
                    System.out.println("x^2 - " + (-1 * b) + "x - " + c + " = 0");
                }
            }
            else {
                if (c == 0) {
                    System.out.println("x^2 + " + b + "x = 0");
                }
                else if (c < 0) {
                    System.out.println("x^2 - " + b + "x - " + (-1 * c) + " = 0");
                }
                else {
                    System.out.println("x^2 + " + b + "x + " + c + " = 0");
                }
            }
        }
        else {
            if (b == 0){
                if (c == 0) {
                    System.out.println(a + "x^2 = 0");
                }
                else if (c < 0) {
                    System.out.println(a + "x^2 - " + (-1 * c) + " = 0");
                }
                else {
                    System.out.println(a + "x^2 + " + c + " = 0");
                }
            }
            else if (b == 1) {
                if (c == 0) {
                    System.out.println(a + "x^2 + x = 0");
                }
                else if (c < 0) {
                    System.out.println(a + "x^2 + x - " + (-1 * c) + " = 0");
                }
                else {
                    System.out.println(a + "x^2 + x + " + c + " = 0");
                }
            }
            else if (b < 0) {
                if (c == 0) {
                    System.out.println(a + "x^2 - " + (-1 * b) + "x = 0");
                }
                else if (c < 0) {
                    System.out.println(a + "x^2 - " + (-1 * b) + "x - " + (-1 * c) + " = 0");
                }
                else {
                    System.out.println(a + "x^2 - " + (-1 * b) + "x - " + c + " = 0");
                }
            }
            else {
                if (c == 0) {
                    System.out.println(a + "x^2 + " + b + "x = 0");
                }
                else if (c < 0) {
                    System.out.println(a + "x^2 - " + b + "x - " + (-1 * c) + " = 0");
                }
                else {
                    System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
                }
            }
        }
        System.out.println("\nRoots of the equation : ");
        x[0] = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        x[1] = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("x = " + x[0] + ", " + x[1]);
    }
}
