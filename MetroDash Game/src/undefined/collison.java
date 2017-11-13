/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package undefined;

/**
 *
 * @author Rabbi 
 */
public class collison {
    GameWindow gm;
    carsMove m;
    int cx,cy;
int carx,cary;
    public boolean isGameOver() {
        return gameOver;
    }
    boolean gameOver;
    public void check(int carx,int cary,int cx,int cy)
    {
    this.carx=carx;
    this.cary=cary;
    this.cx=cx;
    this.cy=cy;
        if((carx+200>=cx && carx<=cx+200)&& (cary>=cy+66 && cary<=cy))
            gameOver=true;
        else gameOver=false;
    }

    public collison() {
       gameOver=false;
    }
    
}
