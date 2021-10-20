package de.medieninformatik.softwaretechnik;

import java.awt.*;

/**
 * @author  Nick Hartmann   m29176
 *          Janik Hagen     m29127
 * @date    19.10.2021
 * Softwaretechnik Praktikum Nr. 1
 *
 * This is the PaintArea class, where the visual content of the PaintArea is set.
 * The class contains a constructor
 */

public class PaintArea extends Canvas  {

    /**
     * this is the Constructor of the PaintArea class, which sets the basic look of the PaintArea
     */
    public PaintArea() {
        setSize(1000, 700);
        setLocation(0,0);
        setBackground(Color.LIGHT_GRAY);
    }

    public void paint(Graphics g) {

    }

    public void changeBGC (Color c) {
        setBackground(c);
    }
}
