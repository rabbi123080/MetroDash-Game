/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package undefined;

import cars.carImage;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author ..::Rabbi::..
 */
public class GameWindow {
    
static    JFrame window;
    int carx=0,cary=390;
   carsMove move=new carsMove();
   int count=0;
   int speed=100;
 boolean gameOver=false;
 
    public int getCarx() {
        return carx;
    }

    public int getCary() {
        return cary;
    }
    ActionListener countAction;
    boolean start=false;
    collison col;
    public JFrame getWindow() {
        return window;
    }
   
    Timer carTimer;
    Timer countTimer;
    
    public GameWindow() {

    window=new JFrame();

            window.setLayout(null);
            window.setSize(1024,720);
    window.show();
    window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
    draw dr=new draw();
dr.setBounds(0,0,1024,700);
    window.add(dr);
           window.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                formKeyPressed(evt);
            }
                

        });
   
scoreCount=new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
        scr++;
    }
};            
           countAction=new ActionListener() {


        @Override
        public void actionPerformed(ActionEvent e) {
     count++;
        }
    };
               
           carTimer=new Timer(speed, move.m);
//           carTimer.start();
           countTimer=new Timer(575, countAction);
           countTimer.start();
   col=new collison();
//   col.check();
tm=new Timer(1000, scoreCount);
//tm.start();
    }
Timer tm;
ActionListener scoreCount;


static int scr=0;    
    class draw extends JComponent
    {
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            ImageIcon road=new ImageIcon(carImage.class.getResource("road3.png"));
            road.paintIcon(this, g, 0, 100);
            
            g.setColor(new Color(255,255,100));
ImageIcon roadup1=new ImageIcon(carImage.class.getResource("road100.gif"));
ImageIcon roadup2=new ImageIcon(carImage.class.getResource("road100.gif"));

String score="Score: "+scr;

//score draw
g.setColor(Color.RED);
g.setFont(new Font("OLD Wnglish TExt MT",0,80));

g.drawString(score, 120,600);


if(start==true)
{
    roadup1.paintIcon(this, g, 0, 195);
    roadup2.paintIcon(this, g, 0, 395);
     
}
            
            g.setColor(Color.white);
            g.fillRect(0, 295, 1024, 10);
            ImageIcon c1=new ImageIcon(carImage.class.getResource("cars1.png"));
            c1.paintIcon(this, g, carx, cary);
      
            ImageIcon c2=new ImageIcon(carImage.class.getResource("cars.png"));
    c2.paintIcon(this, g, move.carx[0], move.cary[0]);
        ImageIcon c3=new ImageIcon(carImage.class.getResource("cars.png"));
    c3.paintIcon(this, g, move.carx[1], move.cary[1]);
    ImageIcon c4=new ImageIcon(carImage.class.getResource("cars.png"));
    c4.paintIcon(this, g, move.carx[2], move.cary[2]);
        ImageIcon c5=new ImageIcon(carImage.class.getResource("cars.png"));
    c5.paintIcon(this, g, move.carx[3], move.cary[3]);
    
    g.setColor(Color.BLACK);
    ImageIcon ready=new ImageIcon(carImage.class.getResource("readyAnim.gif"));
    ImageIcon back=new ImageIcon(carImage.class.getResource("scene.jpg"));
    back.paintIcon(this, g, 0, 0);
    g.setColor(Color.black);
    //g.fillRect(0,500,1024,500);
    
    g.setColor(Color.white);
    g.fillRect(0,495,1024,25);
    for(int i=0;i<=1024;i+=40)
    {
        g.setColor(Color.RED);
        g.fillRect(i,495,20,25);
    }
        if((carx+195>=move.carx[1] && carx<=move.carx[1]+200)&& ((cary>=move.cary[1] && cary<=move.cary[1]+66)||(cary+67>=move.cary[1]&& cary<=move.cary[1])))

//    if(carx>=600)
        {
            tm.stop();
            
            carTimer.stop();
            countTimer.stop();
            gameOver=true;
        }
        if((carx+195>=move.carx[2] && carx<=move.carx[2]+200)&& ((cary>=move.cary[2] && cary<=move.cary[2]+66)||(cary+67>=move.cary[2]&& cary<=move.cary[2])))

//    if(carx>=600)
        {
            tm.stop();
            
            carTimer.stop();
            countTimer.stop();
            gameOver=true;
        }
        if((carx+195>=move.carx[0] && carx<=move.carx[0]+200)&& ((cary>=move.cary[0] && cary<=move.cary[0]+66)||(cary+67>=move.cary[0]&& cary<=move.cary[0])))

//    if(carx>=600)
        {
            tm.stop();
            
            carTimer.stop();
            countTimer.stop();
            gameOver=true;
        }
        if((carx+195>=move.carx[3] && carx<=move.carx[3]+200)&& ((cary>=move.cary[3] && cary<=move.cary[3]+66)||(cary+67>=move.cary[3]&& cary<=move.cary[3])))

//    if(carx>=600)
        {
            tm.stop();
            
            carTimer.stop();
            countTimer.stop();
            gameOver=true;
        }
    g.setFont(new Font("OLD Wnglish TExt MT",0,120));
    if(gameOver==true)
        g.drawString("GAME OVER", 0, 350);
    
    if(count>=0 && count<6 && start==false)
    ready.paintIcon(this, g, 100, 100);

else
{
    
    start=true;
    carTimer.start();
    tm.start();
    countTimer.stop();
    count=0;
}

    repaint();
            
            
        }
    }
    
//         private void windowkeyPressed(KeyEvent e) {
//         }
    private void formKeyPressed(java.awt.event.KeyEvent evt)
    {    int key=evt.getKeyCode();
    if(gameOver==false){
    if(key==evt.VK_RIGHT)
         {
             carx+=20;
             if((carx+200)>=1024)
                 carx=824;
         }
         if(key==evt.VK_LEFT)
         {
        
             carx-=20;
             if((carx)<=0)
                 carx=0;
         }
         if(key==evt.VK_UP)
         {
             cary-=20;
             if((cary)<=100)
                 cary=100;
             
         }
         if(key==evt.VK_DOWN)
         {
             cary+=20;
             if((cary+67)>=500)
                 cary=433;
                      }

    }     
    }
   }
