package complejos.example.com.complejo;

/**
 * Created by luispo on 10/10/2017.
 */

public class Complejo {
    private double real, imaginario;

    public Complejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public String toString() {
        return real + " + " + imaginario + " i";
    }

    public void suma(Complejo v) {

        real = real + v.real;
        imaginario = imaginario + v.imaginario;
    }
}
