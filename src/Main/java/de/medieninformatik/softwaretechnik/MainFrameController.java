package de.medieninformatik.softwaretechnik;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @author  Nick Hartmann   m29176
 *          Janik Hagen     m29127
 * @date    19.10.2021
 * Softwaretechnik Praktikum Nr. 1
 *
 * This is the MainFrameController-class, it contains the WindowListener methods. The only method which the program invokes is the windowClosing method.
 */
public class MainFrameController implements WindowListener {
    @Override
    public void windowOpened(WindowEvent e) {

    }

    /**
     * Disposes the window on closing
     * @param e
     */
    @Override
    public void windowClosing(WindowEvent e) {
        e.getWindow().dispose();
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
