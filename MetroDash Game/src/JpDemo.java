/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author Ezio Auditore
 */
public class JpDemo extends JApplet{
    public void init()
    {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {

                @Override
                public void run() {
                    makeGui();
                }

            });
        } catch (InterruptedException ex) {
            Logger.getLogger(JpDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(JpDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

            private void makeGui() {
            ImageIcon ii=new ImageIcon(JpDemo.class.getResource("car.png"));
            JLabel lbl=new JLabel("Cars",ii,JLabel.CENTER);
            add(lbl);
            }
}
