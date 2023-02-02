package project252;

public class BirthdayCake extends Cookies {

    public BirthdayCake() {
        super("Birthday Cake", 4.99);
    }

    public BirthdayCake(Extra extra) {
        super("Birthday Cake with ", 4.99+extra.getprice() , extra);
    }
@Override
    String information() {
        if (this.extra == null) {
            return getType() + " "+ getPrice() ;
        } else {
             return getType() +" "+extra.getextra()+  " = "  + getPrice();

        }
    }
   
}
