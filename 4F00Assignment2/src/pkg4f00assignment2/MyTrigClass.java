/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4f00assignment2;

/**
 *
 * @author Param
 */
public class MyTrigClass {

    public static final double PI = 3.141592653589793;
    public static final int PRECISION = 15;

    public static double sin(double x) {
        if (x == Double.NEGATIVE_INFINITY || !(x < Double.POSITIVE_INFINITY)) {
            return Double.NaN;
        }

        x = MyTrigClass.toRadians(x);

        // The domain of Sine is [0,2Pi]
        x %= 2 * PI;

        // If angle is negative, make it positive
        if (x < 0) {
            x = 2 * PI - x;
        }

        // Since Sine is an odd function, we can limit a to [0,PI]
        int sign = 1;
        if (x > PI) {
            x -= PI;
            sign = -1;
        }

        double result = 0;
        for (int i = 0; i <= PRECISION; i++) {
            result += power(-1, i) * (power(x, 2 * i + 1) / factorial(2 * i + 1));
        }

        return sign * result;
    }

    public static double cos(double x) {
        return 0;
    }

    public static double tan(double x) {
        return 0;
    }

    public static double cot(double x) {
        return 0;
    }

    public static double sec(double x) {
        return 0;
    }

    public static double csc(double x) {
        return 0;
    }

    public static double toRadians(double degrees) {
        return degrees * PI / 180;
    }

    public static double toDegrees(double radians) {
        return radians * 180 / PI;
    }

    public static double sqrt(double number) {
        //base case
        if (number == 0 || number == 1) {
            return number;
        }

        double sqrt = number / 2;
        double temp = 0;

        while (sqrt != temp) {
            temp = sqrt;

            sqrt = (number / temp + temp) / 2;
        }

        return sqrt;
    }

    public static double power(double base, int exp) {
        double result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    public static double factorial(double number) {
        double result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
