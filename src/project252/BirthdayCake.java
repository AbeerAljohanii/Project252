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
             return String.format("%-53s %10.2f\n", getType(), getPrice());
        } else {
            return String.format("%-15s %10.2f\n", getType()+" "+extra.getextra(), getPrice());

        }
    }
   
}
