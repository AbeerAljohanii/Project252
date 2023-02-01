package project252;

public class PinkVelvet extends Cookies {
    public PinkVelvet() {
        super("PinkVelvet", 6.99);
    }
    public PinkVelvet(Extra extra) {
        super("Pink Velvet with "+ extra.getextra(), 6.99 + extra.getprice(), extra);
    }
    @Override
    void getInfo() {
        String s = getType() + " : " + getPrice() + extra.extra();
    }
}
