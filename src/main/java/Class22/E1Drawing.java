package Class22;

import JAVAHomework.Canvas;

import javax.swing.*;
import java.awt.*;

public class E1Drawing {
    public static void main(String[] args) {
        JFrame frame= new JFrame();
        MyCanvas c = new MyCanvas();
        frame.setSize(200,200);
        //frame.add(c);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



    }
}
class MyCanvas extends Canvas {

    public void paint(Graphics g){
    g.setColor(Color.BLUE);
    g.fill3DRect(200,200,500,500,true);
    //g.setColor((Color.BLACK);
    g.fillRect(800,200,500,500);

}


    }

