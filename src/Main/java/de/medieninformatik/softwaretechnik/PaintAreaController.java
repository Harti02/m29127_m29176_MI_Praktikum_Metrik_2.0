package de.medieninformatik.softwaretechnik;


import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;

/**
 * @author  Nick Hartmann   m29176
 *          Janik Hagen     m29127
 * @date    19.10.2021
 * Softwaretechnik Praktikum Nr. 1
 *
 * This is the PaintAreaController class, which controls the PaintArea by adding visual elements on Mouseclick events
 */
public class PaintAreaController implements MouseListener {

    int x1;                 // for coordinates of the first circle
    int y1;
    int x2;                 // for coordinates of the second circle
    int y2;

    int count=0;            // used for counting how often the mouse is clicked
    int rad = 50;           // variable used for both width and height

    Canvas comp;            // Canvas object


    public int getRadius(int r){
        rad = r;
        return rad;
    }


    /**
     * This method starts when the MouseListener recognizes a doubleclick of the mous.
     * For the first doubleclick a circle is drawn around the center, as is for the second
     * doubleclick. The third doubleclick resets the canvas.
     */
    @Override
    public void mouseClicked(MouseEvent e) {

        comp = (Canvas) e.getSource();
        Graphics g = comp.getGraphics();
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D ellipse2D;

        Font f = new Font("Arial", Font.BOLD, 15);            // only for the string output
        g2.setFont(f);

        g2.setColor(Color.RED);
        g2.setStroke(new BasicStroke(6));

        if (e.getClickCount()== 2){                     // when it's a double-mouseclick

            switch (count) {
                case 0:
                    x1 = e.getX();
                    y1 = e.getY();
                    String string1 = "X Coordi: " + e.getX() + "   &   Y Coordi: " + e.getY();
                    ellipse2D = new Ellipse2D.Float(
                            x1, y1,
                            (float)rad,(float)rad);
                    g2.draw(ellipse2D);


                    g2.setColor(Color.BLACK);
                    g2.drawString(string1, x1 - rad, y1 - rad/2);

                    count++;
                    break;

                case 1:
                    x2 = e.getX();
                    y2 = e.getY();
                    String string2 = "X Coordi: " + e.getX() + "   &   Y Coordi: " + e.getY();
                    ellipse2D = new Ellipse2D.Float(
                            x2, y2,
                            (float)rad,(float)rad);
                    g2.draw(ellipse2D);

                    g2.setColor(Color.BLACK);
                    g2.drawString(string2, x2 - rad, y2 -rad/2);

                    g2.setColor(Color.BLUE);
                    g2.setStroke(new BasicStroke(3));
                    g2.drawLine(x1+rad/2, y1+rad/2, x2+rad/2, y2+rad/2);

                    String stringDistance = "Distance: " + (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) + "px";      // Pythagoras' Theorem
                    g2.drawString(stringDistance, 800, 600);

                    count++;
                    break;

                case 2:
                    repaint();
            }
        }
    }

    /**
     * resets/clears the canvas and resets the count to 0 so the Mouseclick Counter works again after clicking the button under the canvas
     */
    public void repaint() {
        comp.repaint();
        count=0;
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
