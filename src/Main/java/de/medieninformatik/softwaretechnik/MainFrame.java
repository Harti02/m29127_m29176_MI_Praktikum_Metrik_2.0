package de.medieninformatik.softwaretechnik;

import java.awt.*;
/**
 * @author  Nick Hartmann   m29176
 *          Janik Hagen     m29127
 * @date    19.10.2021
 * Softwaretechnik Praktikum Nr. 1
 *
 * This is the MainFrame-class, it extends the Class Frame and implements the ActionListener for the press of a button
 * The MainFrame class consists of the constructor, where the settings for the AWT Frame are set.
 */
public class MainFrame extends Frame {

    MainFrameController mfc = new MainFrameController();
    PaintAreaController pac = new PaintAreaController();

    PaintArea paintArea = new PaintArea();
    MenuArea menuArea = new MenuArea();

    /**
     * Constructor of the MainFrame-class
     */
    public MainFrame()  {
        setTitle("MainFrame V 1.3");
        setSize(1000,800);
        setVisible(true);
        addWindowListener(mfc);

        add(paintArea);
        paintArea.addMouseListener(pac);
        setMenuBar(menuArea.MenuArea(paintArea, pac));
    }
}
