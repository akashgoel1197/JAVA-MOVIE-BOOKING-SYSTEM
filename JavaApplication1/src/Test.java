/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */

import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Test extends javax.swing.JPanel {

    /**
     * Creates new form Test
     */
    public Test() {
        seatList.add(101);
        initComponents();
        System.out.println("hola");
        draw();
    }

    public Test(String movieName) {
        this.movieName = movieName;
        seatList.add(101);
        initComponents();
        draw();
//        add(leftPanel);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 986, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

     public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking().setVisible(true);
            }
        });
    }
     
     private void draw()
    {
        int width = 50;
        int height = 50;
        // Stating no. of rows and columns in Each  Block
        int leftBlockSeatsCol = 6;
        int leftBlockSeatsRow = 6;
        int centreBlockSeatsRow =5;
        int centreBlockSeatsCol = 8;
        int rightBlockSeatsRow =6;
        int rightBlockSeatsCol = 6;
        //Setting Position of Block
        int leftBlockPosX = 50;
        int leftBlockPosY = 400;
        int centreBlockPosX = (leftBlockPosX + (leftBlockSeatsCol*width)) +150;
        int centreBlockPosY = 400;
        int rightBlockPosX = (centreBlockPosX +(centreBlockSeatsCol*width)) +150;	
        int rightBlockPosY = 400;
//        jLabel1.setLocation(leftBlockPosX + (width*leftBlockSeatsCol/2) -20 , leftBlockPosY );
        HelpDraw(leftBlockSeatsCol,leftBlockSeatsRow,leftBlockPosX,leftBlockPosY,101);
        HelpDraw(centreBlockSeatsCol,centreBlockSeatsRow,centreBlockPosX,centreBlockPosY,201);
        HelpDraw(rightBlockSeatsCol,rightBlockSeatsRow,rightBlockPosX,rightBlockPosY,301);
    }
    private void HelpDraw(int Col, int Row ,int X , int Y,int adder)
    {
//        leftPanel = new JPanel();
        JButton button ;
        for(int i=0;i<Col;i++)
        {
            for (int x=0; x<Row; x++)
            {
                String rectName = new Integer(i+adder+(x*Col)).toString();
//                g.drawString(rectName,X+(i*width)+5, Y + (x*height) + 20 );
//                g.drawRect(X+(i*width),Y+(x*height), width, height);
                  System.out.println(rectName);
                  button = new JButton(rectName);
                  button.setBounds(X+(i*40),Y+(x*40), 50, 50);
//                  add(button);
                  
//                  button.setVisible(true);
                Color c = new Color(175,175,175);
                if(seatList.contains((i+(Col*x))+adder) != true)
                {
                    button.setBackground(c);
                }
                else
                {
                     button.setBackground(Color.red);
                }
                add(button);
                
            }
        }
       
    }
    
    
    
    private ArrayList<Integer> seatList = new ArrayList<Integer>();
    private String movieName="";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
