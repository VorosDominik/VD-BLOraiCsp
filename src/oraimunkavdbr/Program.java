

package oraimunkavdbr;

public class Program {

    public static void main(String[] args) {
        Koordinata nk= new Koordinata();
        
        Négyzet n= new Négyzet();
        nk.setXkoordinata(5);
        nk.setYkoordinata(5);
         n.setOldal(1);
        n.setTerulet();
       
        System.out.println(n + "a kordinatak x: "+nk.getXkoordinata()+", y: "+nk.getYkoordinata()+ '}' );
    }
    
}
