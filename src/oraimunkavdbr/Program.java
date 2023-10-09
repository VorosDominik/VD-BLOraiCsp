
package oraimunkavdbr;

public class Program {

    public static void main(String[] args) {
        Négyzet n1 = new Négyzet( 5, new Koordinata(3, 3));
        Négyzet n2 = new Négyzet(5 ,new Koordinata(3,2));
        System.out.println(n1.egyforma(n2));;
    }
    
}