package q3;

import java.util.Scanner;

/**
 * <p> This class reads two floating point numbers and computes their
 * sum, difference, quotient, and product. This is done by using the
 * arithmetic operators +, -, /, and * with the two numbers.
 * </p>
 *
 * @author Clyde Chen, Set B
 * @version 1.0
 */
public class Arithemtic {
    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {
        // your code will go here!!!
        // declare variables, double used to avoid possible overflow errors
        /**
         * The variables "first" and "second" are used to store the two
         * numbers read from the user. The first number is used as the
         * first operand and the second as the second operand for all
         * the arithmetic computations. The variables sum, difference,
         * quotient, and product are used to store the results. These
         * are all declared as doubles to account for any possible 
         * overflow errors.
         */
        float first;
        float second;
        double sum;
        double difference;
        double quotient;
        double product;
        // prompt for values from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first floating point number: ");
        first = scan.nextFloat();
        System.out.println("Please now enter the second one: ");
        second = scan.nextFloat();
        scan.close();
        // arithmetic magic
        sum = first + second;
        difference = first - second;
        quotient = first / second;
        product = first * second;
        System.out.println("The two numbers have a sum of "
        + sum + ", a difference of " + difference 
        + "\n, a quotient of " + quotient 
        + ", and a product of " + product);
        System.out.println("Question three was called and ran sucessfully.");
    }

};
