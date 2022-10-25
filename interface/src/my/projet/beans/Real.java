package my.projet.beans;
import my.projet.inter.IDisplay;
import my.projet.inter.IOperation;

public class Real implements IOperation, IDisplay { // Use interface
    private double re;


    public Real(double re) {
        this.re = re;
    }

    // Update methods
    @Override
    public Object more(Object o){
        Real r = (Real) o;
        return new Real(this.re+r.re);
    }
    @Override
    public Object less(Object o){
        Real c = (Real) o;
        return new Real(this.re-c.re);
    }
    @Override
    public String attach(){
        return this.re+"";
    }
}
