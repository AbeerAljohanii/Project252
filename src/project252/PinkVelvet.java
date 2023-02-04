package project252;

public class PinkVelvet extends Cookie {
    //two constructors depend on if the cutomer asks for extra or not 
    public PinkVelvet() {
        super("PinkVelvet", 6.99);
    }
    public PinkVelvet(Extra extra) {
        super("Pink Velvet with ", 6.99 + extra.getprice(), extra);
    }
     
  @Override
    String information() {
        if (this.extra == null) {
             return String.format("%-52s %10.2f\n", getType(), getPrice()); // print info without extra
        } else {
            return String.format("%-15s %14.2f\n", getType() + " " + extra.getextra(), getPrice()); // print info with extra

        }
    }
}
