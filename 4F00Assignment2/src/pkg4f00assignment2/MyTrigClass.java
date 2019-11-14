package pkg4f00assignment2;

/**
 * This class is used to compute Trigonometric Functions
 * @author Param Jansari [6046833]
 */
public class MyTrigClass {

    public static final double PI = 3.141592653589793238462643383279502884197169399;
    public static final int PRECISION = 50;

    /**
     * Return the trigonometric sine of an angle if argument is NaN or infinity,
     * it will throw TrigException if argument is 0, it will return 0
     *
     * @param x in radians
     * @return sine of x
     */
    public static double sin(double x) {
        if (Double.isInfinite(x) || Double.isNaN(x)) {
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

    /**
     * Return the trigonometric cosine of an angle if argument is NaN or
     * infinity, it will throw TrigException if argument is 0, it will return 1
     *
     * @param x in radians
     * @return cosine of x
     */
    public static double cos(double x) {
        if (Double.isInfinite(x) || Double.isNaN(x)) {
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

    /**
     * Return the trigonometric tangent of an angle 
     * if argument is NaN or infinity, it will throw TrigException
     * if argument is 0, it will return 0
     * @param x in radians
     * @return tangent of x
     */
    public static double tan(double x) {

        if (Double.isInfinite(x) || Double.isNaN(x)) {
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

    /**
     * This method will return the cotangent of an angle
     * if argument is NaN or infinity, it will throw TrigException
     * if argument results in sin(x) being 0, then it will throw TrigException
     * @param x in radians
     * @return cotangent of x
     */
    public static double cot(double x) {
        if (sin(x) == 0) {
            throw new TrigException("Dividing by zero! Invalid angle!");
        }
        return 1 / tan(x);
    }

    /**
     * This method will return the secant of an angle
     * if argument is NaN or infinity, it will throw TrigException
     * if argument results in cos(x) being 0, it will throw TrigException
     * @param x in radians
     * @return secant of x
     */
    public static double sec(double x) {
        if (cos(x) == 0) {
            throw new TrigException("Dividing by zero! Invalid angle!");
        }
        return 1 / cos(x);
    }

    /**
     * This method returns the cosecant of an angle
     * if argument is NaN or infinity, it will throw TrigException
     * if argument results in sin(x) being 0, then it will throw TrigExeption
     * @param x
     * @return 
     */
    public static double csc(double x) {
        if (sin(x) == 0) {
            throw new TrigException("Dividing by zero! Invalid angle!");
        }
        return 1 / sin(x);
    }

    /**
     * This method converts degrees to radians
     * @param degrees
     * @return radians
     */
    public static double toRadians(double degrees) {
        return degrees * PI / 180;
    }

    /**
     * This method converts radians to degrees
     * @param radians
     * @return degrees
     */
    public static double toDegrees(double radians) {
        return radians * 180 / PI;
    }

    /**
     * This method gives the square root of a number
     * @param number
     * @return 
     */
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

    /**
     * This method returns the power of a base number raised to an exponent
     * @param base
     * @param exp
     * @return 
     */
    public static double power(double base, int exp) {
        double result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    /**
     * This method gives a factorial of a number
     * @param number
     * @return 
     */
    public static double factorial(double number) {
        double result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
