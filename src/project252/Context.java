
package project252;
public class Context {
    private PayStrategy paystrategy;
    public Context(PayStrategy paystrategy) {
        this.paystrategy = paystrategy;
    }
    public String ExecuteStrategy(double amount){
        return paystrategy.pay(amount);
}
}
