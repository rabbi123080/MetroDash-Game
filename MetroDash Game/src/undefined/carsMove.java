/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package undefined;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;


/**
 *
 * @author ..::Rabbi::..
 */
public class carsMove{
   int roadMovex=0;
   Random rand=new Random();
    int carx[]=new int[4];
    int cary[]=new int[4];
    ActionListener m;
    public carsMove() {
    carx[0]=800;
    cary[0]=300;
    carx[1]=carx[0]+600;
    cary[1]=200;
    carx[2]=carx[1]+600;
    cary[2]=100;
        carx[3]=carx[0]+600;
    cary[3]=400;
    m=new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
     carx[0]-=20;
     roadMovex-=20;
     if(carx[0]+200<=0)
         carx[0]=1024;
      carx[1]-=20;
     if(carx[1]+200<=0)
         carx[1]=rand.nextInt(1000+carx[0])+1024;
     carx[2]-=20;
    
     if(carx[2]+200<=0)
         carx[2]=rand.nextInt(1000+carx[1])+1024;     
      carx[3]-=20;
    
     if(carx[3]+200<=0)
         carx[3]=rand.nextInt(1000+carx[2])+1024;     
     
        
        }
    };
    }
    
    
    
}
