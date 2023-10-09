
package oraimunkavdbr;

public final class Négyzet {
    
    private int terulet;

    private int a;
    private String allapot;
    private Koordinata NK= new Koordinata(0, 0);
    public Négyzet( int a, int x ,int y) {
        NK.setX(x);
        NK.setY(y);
        
        this.a = setA(a);
        
        this.terulet = setTerulet();
        this.allapot = setAllapot();
        
    }
    
    public int setA(int a) {
        
        if (a <=0 ){
            a = 1;
        }
        
        return a;
    }
    
    public int setTerulet() {
        
        int aterulet = a*a;
        return aterulet;
    }
    public int getA() {
        return a;

    }

    public String setAllapot() {
        String szoveg = " "
                + "Oldal= "+a+" "
                + "T="+terulet+" "
                + "x;y"+NK.getX()+";"+NK.getY();
        return szoveg;
    }
    

  


    @Override
    public String toString() {
        return "N\u00e9gyzet{" + "terulet=" + terulet + ", a=" + a + ", allapot=" + allapot + '}';
    }


}

