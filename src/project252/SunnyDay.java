package project252;

public class SunnyDay extends Cookie {
    //two constructors depend on if the cutomer asks for extra or not 
    public SunnyDay() {
        super("Sunny Day", 4.99);
    }
    public SunnyDay(Extra extra) {
        super("Sunny Day with ", 4.99 + extra.getprice(), extra);
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
