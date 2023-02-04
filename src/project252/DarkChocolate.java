package project252;
public class DarkChocolate implements Extra {
    //attributes
    final private String extraType = "Dark Chocolate";
    final private double extraPrice = 2.5;
    @Override
    
    //getters 
    public String getextra() {
        return this.extraType;
    }
    @Override
    public double getprice() {
        return this.extraPrice;
    }
}
