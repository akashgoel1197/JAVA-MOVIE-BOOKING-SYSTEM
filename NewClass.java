/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
import java.awt.GridLayout;
import javax.swing.*;

public class NewClass {
    public static void main(String [] args)
    {
        JFrame n = new JFrame();
        n.setLayout(new GridLayout(2,1));
        Test t = new Test();
        n.add(t);
        n.setSize(500,500);
        n.setVisible(true);
    }
}
