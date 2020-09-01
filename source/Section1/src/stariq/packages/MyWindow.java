package stariq.packages;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {

    public MyWindow(String title){
        super(title);
        setSize(500,140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
        graphics.setFont(sansSerifLarge);
        graphics.drawString("The Complete Java Developer Course", 60, 60);
        graphics.setFont(sansSerifSmall);
        graphics.drawString("by Tim Buchalka", 60, 100);
    }
}
