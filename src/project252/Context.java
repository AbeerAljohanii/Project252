package project252;

public class Context {

    private PayStrategy paystrategy;

    //constructor
    public Context(PayStrategy paystrategy) {
        this.paystrategy = paystrategy;
    }

    //execute the oprations in the paystategy chosen 
    public String ExecuteStrategy(double amount) {
        return paystrategy.pay(amount);
    }
}
