package project252;

public class PinkVelvet extends Cookies {
    public PinkVelvet() {
        super("PinkVelvet", 6.99);
    }
    public PinkVelvet(Extra extra) {
        super("Pink Velvet with ", 6.99 + extra.getprice(), extra);
    }
     
  @Override
    String information() {
        if (this.extra == null) {
             return String.format("%-57s %10.2f\n", getType(), getPrice());
        } else {
            return String.format("%-20s %10.2f\n", getType()+" "+extra.getextra(), getPrice());

        }
    }
}
