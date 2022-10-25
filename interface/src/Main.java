import my.projet.beans.Complex;
import my.projet.beans.Real;
public class Main {
    public static void main(String[] args) {

        // test Complex
        Complex c1=new Complex(0,2);
        Complex c2=new Complex(15,25);
        Complex c3=(Complex)c1.more(c2);
        Complex c4=(Complex)c1.less(c2);
        System.out.println(c3.attach());
        System.out.println(c4.attach());

        System.out.println("-------------------------");
        // test Real
        Real r1=new Real(2);
        Real r2=new Real(-15);
        Real r3=(Real)r1.more(r2);
        Real r4=(Real)r1.less(r2);
        System.out.println(r3.attach());
        System.out.println(r4.attach());
    }
}