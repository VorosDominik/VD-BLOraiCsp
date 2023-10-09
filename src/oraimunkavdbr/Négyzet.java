
package oraimunkavdbr;

public class Négyzet {
    
    private int kerulet;
    private int terulet;
   
    private int Oldal;   

    public void setOldal(int Oldal) {
        this.Oldal = Oldal;
        if (Oldal<0) {
           this.Oldal=1;
        }
    }

    public void setKerulet() {
        this.kerulet = kerulet;
    }

    public void setTerulet() {
        this.terulet = Oldal*Oldal;
    }

   

    public int getKerulet() {
        return kerulet;
    }

    public int getTerulet() {
        return terulet;
    }

  

    @Override
    public String toString() {
        return "N\u00e9gyzet{" + "kerulet=" + kerulet + ", terulet=" + terulet + ", xkoordinata="  ;
    }
    

}
