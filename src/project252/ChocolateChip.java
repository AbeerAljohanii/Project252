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
             return String.format("%-55s %10.2f\n", getType(), getPrice());
        } else {
            return String.format("%-20s %10.2f\n", getType()+" "+extra.getextra(), getPrice());

        }
    }
    
}
