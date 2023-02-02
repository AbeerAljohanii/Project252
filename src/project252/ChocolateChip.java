package project252;

public class ChocolateChip extends Cookies {

    public ChocolateChip() {
        super("Chocolate Chip  ",  3.99);
    }

    public ChocolateChip(Extra extra) {
        super("Chocolate Chip with " , 3.99 +extra.getprice()  , extra);
    }

    @Override
    String information() {
        if (this.extra == null) {
            return getType() + " "+ getPrice() ;
        } else {
             return getType() +" "+extra.getextra()+  " = "   + getPrice();

        }
    }
    
}
