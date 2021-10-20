package de.medieninformatik.softwaretechnik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuArea  {

    int rad;
    /**
     * Constructor of the MenuArea-class, MenuBar and its functions are initialized here
     * @param cpa instance of PaintArea
     * @return mb instance of MenuBar
     */
    public MenuBar MenuArea(PaintArea cpa, PaintAreaController pac){
        MenuBar mb = new MenuBar();
        Menu menu = new Menu("Menu");
        Menu submenu = new Menu("Backgroundcolor");
        Menu submenu2 = new Menu("circular radius");
        MenuItem radius = new MenuItem("set Radius");
        submenu2.add(radius);
        radius.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rad = Integer.parseInt(JOptionPane.showInputDialog("Please input radius",50));
                pac.getRadius(rad);
            }
        });

        MenuItem i1 = new MenuItem("White");
        i1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cpa.changeBGC(Color.WHITE);
            }
        });
        MenuItem i2 = new MenuItem("Grey");
        i2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cpa.changeBGC(Color.LIGHT_GRAY);
            }
        });
        MenuItem i3 = new MenuItem("Red");
        i3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cpa.changeBGC(Color.RED);
            }
        });
        MenuItem i4 = new MenuItem("Blue");
        i4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cpa.changeBGC(Color.BLUE);
            }
        });
        MenuItem i5 = new MenuItem("Green");
        i5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cpa.changeBGC(Color.GREEN);
            }
        });
        MenuItem i6 = new MenuItem("Yellow");
        i6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cpa.changeBGC(Color.YELLOW);
            }
        });

        submenu.add(i1);
        submenu.add(i2);
        submenu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        submenu.add(i6);

        menu.add(submenu);
        menu.add(submenu2);
        mb.add(menu);

        return mb;
    }



}

