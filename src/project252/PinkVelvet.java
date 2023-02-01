package project252;

public class PinkVelvet extends Cookies {
    public PinkVelvet() {
        super("PinkVelvet", 6.99);
    }
    public PinkVelvet(Extra extra) {
        super("Pink Velvet with "+ extra.getextra(), 6.99 + extra.getprice(), extra);
    }
//  @Override
//    String information() {
//        if (this.extra == null) {
//            return getType() + " " + getPrice();
//        } else {
//            return getType() + " " + extra.getextra() + " = " + getPrice();
//
//        }
//    }
}
