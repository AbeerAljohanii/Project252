package project252;

public class WhiteChocolate implements Extra {

    final private String extraType = "White Chocolate";
    final private double extraPrice = 2;

    @Override
    public String getextra() {
        return this.extraType;
    }
    @Override
    public double getprice() {
        return this.extraPrice;
    }
}
