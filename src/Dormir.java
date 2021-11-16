
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GX505DT
 */
public class Dormir extends Thread{
    NewJFrame puntero;
    Mascota mas;
    
    Timer Zzz = new Timer(50, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            mas.movimiento.stop();
            mas.repaint();
        }
    });
    
    public Dormir(){
        Zzz.start();
    }
    
}
