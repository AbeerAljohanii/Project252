package project252;

public abstract class Cookies {
    private String type;
    private double price;
    protected Extra extra; 
    abstract void getInfo();
    public Cookies(String type, double price) {
        this.type = type;
        this.price = price;
    }
    public Cookies(String type, double price, Extra extra) {
        this.extra = extra;
        this.price = price + extra.getprice();
        this.type = type + "with " + extra.getextra();
    }
    public String getType() {
        return type;
    }
    public double getPrice() {
        return price;
    }

    public Extra getExtra() {
        return extra;
    }
    
}
