package week5_6;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import java.io.IOException;
import java.io.InterruptedIOException;

public class Diagram extends JPanel {

    int x = 0, y = 0;
    int angleX = 1, angleY = 1;
    int speed = 2;
    public void run() {
        if (x + angleX < 0) {
            angleX = speed;
        } else if (x + angleX > getWidth() - 50) {
            angleX = -speed;
        } else if (y + angleY < 0) {
            angleY = speed;
        } else if (y + angleY > getHeight() - 50) {
            angleY = -speed;
        }
        x = x + angleX;
        y = y + angleY;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 50, 50);
        setForeground(Color.red);
    }


    public static void main(String[] args) throws InterruptedException{
        JFrame frame = new JFrame("Test");
        Diagram diagram = new Diagram();
        frame.add(diagram);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while (true) {
                diagram.run();
                diagram.repaint();
                Thread.sleep(10);


        }


    }
}
