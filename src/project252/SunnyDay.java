package project252;

public class SunnyDay extends Cookies {
    public SunnyDay() {
        super("Sunny Day", 4.99);
    }
    public SunnyDay(Extra extra) {
        super("Sunny Day with "+ extra.getextra(), 4.99 + extra.getprice(), extra);
    }
    @Override
    void getInfo() {
        String s = getType() + " : " + getPrice() + extra.extra();
    }
}
