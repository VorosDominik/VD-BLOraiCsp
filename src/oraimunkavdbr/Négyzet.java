/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oraimunkavdbr;

/**
 *
 * @author bella.richard
 */
public class Négyzet {
    private int oldal=4;

   
    private int x=0;
    private int y=0;
     public void setOldal(int oldal) {
        this.oldal = oldal;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
     public int negyzetterulet(){
         int terulet=4*oldal;
     
        return terulet;
     
     
     };
    public void kiiras(){
        System.out.println("a négyzet területe: "+negyzetterulet());
        System.out.println("x,y koordinátája pedig: "+getX()+" "+getY());
    
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
     
}
