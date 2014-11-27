package q4;

import java.util.Scanner;

/**
 * <p> The class Cube computes the area and volume of a cube given its
 * side length. A = 6*(l*l) and V = l*l*l.
 * </p>
 *
 * @author Clyde Chen, Set B
 * @version 1.0
 */
public class Cube {
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
        // declare variables
        /**
         * The length of the cube's side is stored in the variable
         * "length". Variables "area" and "volume" are used to
         * store the computed results. The "constant" variables
         * "six", "squared", and "cubed" are used to avoid a
         * checkstyle error regarding magic numbers.
         */
        int length;
        int area;
        int volume;
        // prompt and store value of length
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of the cube");
        length = scan.nextInt();
        scan.close();
        // compute area and volume of cube
        final int six = 6;
        final int squared = 2;
        final int cubed = 3;
        area = (int) (six * (Math.pow(length, squared)));
        volume = (int) Math.pow(length, cubed);
        System.out.println("The cube has volume of " + volume + " and area of "
                + area);
        System.out.println("Question four was called and ran sucessfully.");
    }

};
