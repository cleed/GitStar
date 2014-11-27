package q1;

import java.util.Scanner;

/**
 * <p> This class breaks a monetary amount represented by a double into
 * the fewest number of overall bills&coins needed. This is done by taking
 * the bill of the highest value from the total sum until we can no longer
 * take more without going into a negative monetary amount, and doing this
 * for currencies of different values until we reach the smallest one. 
 * According to logic of induction, an amount of currency of higher value 
 * directly translates to a higher amount of the curency of a lower value.
 * Thus, the top-down approach correctly gives us the least amount of bill
 * and coins needed for the change.
 * </p>
 *
 * @author Clyde Chen, Set B
 * @version 1.0
 */
public class Change {
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
        // Declare required variables
        /**
         * Here is where the variables are decalred:
         * <ul>
         * <li>tenDollar: the amount of ten dollar
         *  bills required for the change</li>
         * <li>fiveDollar: the amount of five dollar
         *  bills required for the change</li>
         * <li>twoDollar: the amount of ten dollar 
         * coins required for the change</li>
         * <li>quarters: the amount of quarter 
         * coins required for the change
         * note that loonies($1) are missing, 
         * this is due to the example
         * given in the question does not 
         * include one dollar coins.</li>
         * <li>dimes: the amount of ten cent 
         * coins required for the change</li>
         * <li>nickles: the amount of five cent
         *  coins required for the change</li>
         * <li>pennies: the amount of one cent 
         * coins required for the change</li>
         * <li>amount: represents the amount 
         * the user has entered</li>
         * <li>tempAmount: a temporary variable 
         * used to keep track of how much
         * is left in the total amount after each
         *  change was taken out, this helps
         * to calculate the amount of bill/coin 
         * of the next currency needed next
         * to make the next change</li>
         * </ul>
         */
        double amount;
        double tempAmount;
        int tenDollar;
        int fiveDollar;
        int twoDollar;
        int quarters;
        int dimes;
        int nickles;
        int pennies;
        /**
         * These "constant" variables represent the face value of the bills or
         * coins in dollars. Thus ten is 10, two is 2, and penny is 0.01, etc.
         */
        final double ten = 10;
        final double five = 5;
        final double two = 2;
        final double quarter = 0.25;
        final double dime = 0.1;
        final double nickle = 0.05;
        final double penny = 0.01;
        // prompt and read out user entered value
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your monetary amount: ");
        amount = scan.nextDouble();
        // Calculate the amount needed from top to bottom
        // the "tempAmount -= statements" are the same as tempAmount%dollarValue
        tempAmount = amount;
        tenDollar = (int) (tempAmount / ten);
        tempAmount -= ten * tenDollar;
        fiveDollar = (int) (tempAmount / five);
        tempAmount -= five * fiveDollar;
        twoDollar = (int) (tempAmount / two);
        tempAmount -= two * twoDollar;
        quarters = (int) (tempAmount / quarter);
        tempAmount -= quarter * quarters;
        dimes = (int) (tempAmount / dime);
        tempAmount -= dime * dimes;
        nickles = (int) (tempAmount / nickle);
        tempAmount -= nickle * nickles;
        pennies = (int) (tempAmount / penny);
        scan.close();
        System.out.println(tenDollar + " ten dollar bills \n" + fiveDollar
                + " five dollar bills \n" + twoDollar + " two dollar coin \n"
                + quarters + " quarters \n" + dimes + " dimes \n" + nickles
                + " nickles \n" + pennies + " pennies");

        System.out.println("Question one was called and ran sucessfully.");
    }

};
