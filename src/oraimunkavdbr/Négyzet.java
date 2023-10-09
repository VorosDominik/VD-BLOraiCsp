
package oraimunkavdbr;

public class Négyzet {
    
    private int kerulet;
    private int terulet;
    private int xkoordinata;
    private int ykoordinata;

    public void setKerulet(int kerulet) {
        this.kerulet = kerulet;
    }

    public void setTerulet(int terulet) {
        this.terulet = terulet;
    }

    public void setXkoordinata(int xkoordinata) {
        this.xkoordinata = xkoordinata;
    }

    public void setYkoordinata(int ykoordinata) {
        this.ykoordinata = ykoordinata;
    }

    public int getKerulet() {
        return kerulet;
    }

    public int getTerulet() {
        return terulet;
    }

    public int getXkoordinata() {
        return xkoordinata;
    }

    public int getYkoordinata() {
        return ykoordinata;
    }

    @Override
    public String toString() {
        return "N\u00e9gyzet{" + "kerulet=" + kerulet + ", terulet=" + terulet + ", xkoordinata=" + xkoordinata + ", ykoordinata=" + ykoordinata + '}';
    }
    
}
