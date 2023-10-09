
package oraimunkavdbr;

public class Négyzet {
    
    private int terulet;
    private int a;
    private String allapot = "";
    public void setA(int a) {
        
        if (a <=0 ){
            a = 1;
        }
        this.a = a;
    }
    
    public void setTerulet(int terulet) {
        
        this.terulet = a*a;
    }
    public int getA() {
        return a;
    }

    public int getTerulet() {
        return terulet;
    }

    @Override
    public String toString() {
        return "N\u00e9gyzet{" + "terulet=" + terulet + ", a=" + a + ", allapot=" + allapot + '}';
    }


}

