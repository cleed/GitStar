package q2;

import java.util.Scanner;

/**
 * <p> This class reads an integer amount from the user that represents the
 * number of seconds in a stretch of time and converts this into a format
 * that's more widely accepted (i.e. hours:minutes:seconds). This is done
 * by calculating the max hour amount, then the minute, then the seconds
 * that will fit into the total second amount. The variable second is used
 * to store the amount of total seconds, as well as its states when each
 * of the values (namely hour and minute) are taken account of. The remaining
 * second value is the amount of seconds that should be represented in this
 * format, thus it is used as so.
 * </p>
 *
 * @author Clyde Chen, Set B
 * @version 1.0
 */
public class SecondsConvert {
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
        // decalre variables needed
        /**
         * Variables and constant declarations:
         * <ul>
         * <li> hour represents the number of hours 
         * that will fit into this time </li>
         * <li> minute represents the number of hours
         * that will fit into this time </li>
         * <li> second represents the total amount of seconds 
         * needed to be converted as well as the number of 
         * seconds left to be converted after each step
         * of the conversion </li>
         * <li>sHour represents how many seconds (3600) are in an hour,
         * this should be a constant number</li>
         * <li>sMinute represents how many seconds (60) are in a minute,
         * this should also be a constant number</li>
         * </ul>
         */
        final int sHour = 3600;
        final int sMinute = 60;
        int hour;
        int minute;
        int second;
        // declare scanner class and prompt for integer value
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of "
        + "seconds as an integer value");
        second = scan.nextInt();
        scan.close();
        // subtract hours and minutes from the amount, 1h = 3600s, 1m = 60s
        hour = second / sHour; // the number of hours that fits
        second %= sHour; // seconds left after hour taken out
        minute = second / sMinute; // the number of minutes that fit
        second %= sMinute; // the leftover seconds
        /*
         * "%02d" was used here to ensure two decimal digits were displayed
         * for the minute and second values, to make the final representation 
         * better resemble a format we usually use to display time
         */
        System.out.println(hour + ":" + String.format("%02d", minute) + ":"
        + String.format("%02d", second));
        System.out.println("Question two was called and ran sucessfully.");
    }

};
