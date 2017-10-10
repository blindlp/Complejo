package complejos.example.com.complejo;

/**
 * Created by luispo on 10/10/2017.
 */

public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here

        Complejo z, w;
        z = new Complejo(-1.5, 3.0);
        w = new Complejo(-1.2, 2.4);

        z.suma(w);
        System.out.println("Complejo: "+ z.toString());
    }
}
