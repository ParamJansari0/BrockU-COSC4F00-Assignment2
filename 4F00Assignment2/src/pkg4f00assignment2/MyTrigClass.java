/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4f00assignment2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Param
 */
public class MyTrigClass {

    public static final double PI = 3.141592653589793238462643383279502884197169399;
    public static final int PRECISION = 50;

    public static double sin(double x) {
        if (Double.isInfinite(x)) {
            throw new TrigException();
        }

        if (x == 0) {
            return 0;
        }
        double sum = x;
        for (int i = 1; i <= PRECISION; i++) {
            sum += power(-1, i) * power(x, 2 * i + 1) / factorial(2 * i + 1);
        }
        return sum;
    }

    public static double cos(double x) {
        if (Double.isInfinite(x)) {
            throw new TrigException();
        }

        if (x == 0) {
            return 1;
        }

        double sum = 1;
        for (int i = 1; i <= PRECISION; i++) {
            sum += power(-1, i) * power(x, 2 * i) / factorial(2 * i);
        }
        return sum;
    }

    public static double tan(double x) {

        if (Double.isInfinite(x)) {
            throw new TrigException();
        }

        if (x == 0) {
            return 0;
        }

        if (cos(x) == 0) {
            throw new TrigException("Dividing by zero! Invalid angle!");
        }

        return sin(x) / cos(x);
    }

    public static double cot(double x) {
        if (sin(x) == 0) {
            throw new TrigException("Dividing by zero! Invalid angle!");
        }
        return 1 / tan(x);
    }

    public static double sec(double x) {
        if (cos(x) == 0) {
            throw new TrigException("Dividing by zero! Invalid angle!");
        }
        return 1 / cos(x);
    }

    public static double csc(double x) {
        if (sin(x) == 0) {
            throw new TrigException("Dividing by zero! Invalid angle!");
        }
        return 1 / sin(x);
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
