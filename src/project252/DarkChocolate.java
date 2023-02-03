package project252;
public class DarkChocolate implements Extra {
    final private String extraType = "Dark Chocolate";
    final private double extraPrice = 2.5;
    @Override
    public String getextra() {
        return this.extraType;
    }
    @Override
    public double getprice() {
        return this.extraPrice;
    }
}
