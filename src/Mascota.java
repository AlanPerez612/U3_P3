
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
public class Mascota extends Canvas{
    Image Pou = new ImageIcon(getClass().getResource("/Pou.png")).getImage();
    int incrementPoux = 200;
    public boolean mimir = false;
    
    Timer movimiento = new Timer(100, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            incrementPoux += 3;
            if(incrementPoux>550) incrementPoux = -70;
            repaint();
        }
    });
    
    public Mascota(){
        movimiento.start();
    }
    
    public void paint (Graphics g){
        
        super.paint(g);
        this.setBackground(Color.white);
        
        //cuadro
        Graphics2D cuadro= (Graphics2D)g;
        cuadro.setColor(Color.blue);
        cuadro.fillRect(0, 200, 500, 100);
        
        g.drawImage(Pou, incrementPoux, 50, this);
    }
    
}
