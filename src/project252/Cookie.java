package project252;

public abstract class Cookie {
    //attributes 
    private String type;
    private double price;
    protected Extra extra;
    
    //two constructors depend on if the cutomer asks for extra or not 
    public Cookie(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public Cookie(String type, double price, Extra extra) {
        this.extra = extra;
        this.price = price;
        this.type = type;
    }

    //getters 
    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public Extra getExtra() {
        return extra;
    }
    
    //abstact method determin in the subclasses to dispaly the information about cookie
   abstract String information();

}
