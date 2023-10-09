
package oraimunkavdbr;

public class Négyzet {
    
    private int a;
    private Koordinata koordinata;
    private String allapot;
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
    private boolean osszehasonlit(Négyzet b) {
        if (this.a == b.getA()) {
            return true;
        } else if (this.a < b.getA()) {
            return false;
        } else {
            return false;
        }
    }
    public void osszehasonlitszoveg(Négyzet b) {
        boolean eredmeny = osszehasonlit(b);
        if (eredmeny) {
            System.out.println("A négyzetek egyformák.");
        } else {
            System.out.println("A négyzetek nem egyformák.");
        }
    }
    public String toString() {
        return "N\u00e9gyzet{" + "terulet=" + a*a + ", a=" + a + ", x koordinata=" + koordinata.getX() + ", y koordinata=" + koordinata.getY() + '}';
    }
}

