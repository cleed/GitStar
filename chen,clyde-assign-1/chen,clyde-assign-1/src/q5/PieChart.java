package q5;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <p>
 * This class draws a circle using the drawOval(x,y,diameterV,diameterL) method,
 * then draws filled arcs that covers the circle. The arcs each have a degree of
 * 45, thus 8 of them will fill the complete 360 degrees of the circle. Each arc
 * will have its side length equal to the radius of the circle radius = 80, and 
 * is represented by its unique color with respect to the other arcs. The
 * drawing is done within a JFrame and onto a JPanel.
 * </p>
 *
 * @author Clyde Chen, Set B
 * @version 1.0
 */
public class PieChart extends JFrame {
    /**
     * <p>
     * The x position of the text.
     * </p>
     */
    private static final int X_POSITION = 20;

    /**
     * <p>
     * The y position of the text.
     * </p>
     */
    private static final int Y_POSITION = 20;

    /**
     * <p>
     * The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).
     * </p>
     */
    public PieChart() {
        super("Cut the pie!");
        /**
         * Constant variables are here to avoid magic number checkstyle error
         */
        final int treeFiddy = 350;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new PieChartPanel());
        setSize(treeFiddy, treeFiddy);
        setVisible(true);
    }

    /**
     * <p>
     * A panel that acts as the Frame's content pane.
     * </p>
     */
    class PieChartPanel extends JPanel {

        /**
         * <p>
         * The default contructor that retreives an image to draw.
         * </p>
         */
        public PieChartPanel() {
        }

        /**
         * <p>
         * Called by the environment when the frame needs to be updated.
         * </p>
         *
         * @param g
         *            the graphics context with which we paint into.
         */
        public void paintComponent(Graphics g) {
            /**
             * These following constant variables declared are all here
             * to avoid the magic number checkstyle error. The exception
             * being the variable "temp" tracks the angle at which the
             * next arc should be drawn
             */
            int temp = 0;
            final int midPoint = 50;
            final int angle = 45;
            final int radius = 80;
            super.paintComponent(g);
            setBackground(Color.white);
            g.setColor(Color.black);
            g.drawString("Something interesting ...", X_POSITION, Y_POSITION);
            g.drawOval(midPoint, midPoint, radius, radius);
            // draw the filled arcs, starting with the one on top
            g.fillArc(midPoint, midPoint, radius, radius, temp, angle);
            g.setColor(Color.green);
            // increment the angle at where the next arc will be drawn
            temp += angle;
            g.fillArc(midPoint, midPoint, radius, radius, temp, angle);
            g.setColor(Color.cyan);
            temp += angle;
            g.fillArc(midPoint, midPoint, radius, radius, temp, angle);
            g.setColor(Color.pink);
            temp += angle;
            g.fillArc(midPoint, midPoint, radius, radius, temp, angle);
            g.setColor(Color.yellow);
            temp += angle;
            g.fillArc(midPoint, midPoint, radius, radius, temp, angle);
            g.setColor(Color.blue);
            temp += angle;
            g.fillArc(midPoint, midPoint, radius, radius, temp, angle);
            g.setColor(Color.red);
            temp += angle;
            g.fillArc(midPoint, midPoint, radius, radius, temp, angle);
            g.setColor(Color.orange);
            temp += angle;
            g.fillArc(midPoint, midPoint, radius, radius, temp, angle);
            g.setColor(Color.magenta);
        }
    }

    // radius of circle is 40
    // center of circle is (50, 50)
    //

    /**
     * <p>
     * The main method.
     * </p>
     * 
     * @param args
     *              main method default parameter
     */
    public static void main(String[] args) {
        new PieChart();
    }

};
