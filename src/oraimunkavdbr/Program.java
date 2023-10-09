
package oraimunkavdbr;

public class Program {

    public static void main(String[] args) {
        Négyzet n1 = new Négyzet( 5, new Koordinata(3, 3));

        Négyzet n2 = new Négyzet(5, new Koordinata(53, 3));
        Négyzet n3 = new Négyzet(3, new Koordinata(13, 3));
        System.out.println(n1.toString());
        n1.osszehasonlitszoveg(n2);
        n2.osszehasonlitszoveg(n3);

    }
    
}