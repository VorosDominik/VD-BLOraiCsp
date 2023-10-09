
package oraimunkavdbr;

public class Négyzet {
    
    private int a;
    private Koordinata koordinata;

    public Négyzet( int a, Koordinata koordinata) {
        this.a = a;
        this.koordinata = koordinata;
    }
    
    
    public void setA(int a) {
        
        if (a <=0 ){
            a = 1;
        }
        this.a = a;
    }
 
    public int getA() {
        return a;
    }
 


    public Koordinata getKoordinata() {
        return koordinata;
    }

    public void setKoordinata(Koordinata koordinata) {
        this.koordinata = koordinata;
    }

    public String toString() {
        return "N\u00e9gyzet{" + "terulet=" + a*a + ", a=" + a + ", x koordinata=" + koordinata.getX() + ", y koordinata=" + koordinata.getY() + '}';
    }
    public boolean egyforma(Négyzet B){
        if (a==B.getA()) {
            return true;
        }
      
           return false;
    }
}