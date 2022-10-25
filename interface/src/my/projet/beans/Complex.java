package my.projet.beans;
import my.projet.inter.IDisplay;
import my.projet.inter.IOperation;

public class Complex implements IOperation , IDisplay { // Use interface
    private double re;
    private double im;


    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    // Update methods
    @Override
    public Object more(Object o){
        Complex c = (Complex) o;
        return new Complex(this.re+c.re,this.im+c.im);
    }
    @Override
    public Object less(Object o){
        Complex c = (Complex) o;
        return new Complex(this.re-c.re,this.im-c.im);
    }
    @Override
    public String attach(){
        if (this.re==0) {
            return this.im + "i";
        }
        if (this.im==0) {
            return this.re+"";
        }if (this.im>0){
            return this.re+"+"+this.im+"i";
        }else {
            return this.re+""+this.im+"i";
        }
    }

}