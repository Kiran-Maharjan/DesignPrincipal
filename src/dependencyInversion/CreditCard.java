package dependencyInversion;

public class CreditCard implements BankCard{
    public void doTransaction(){
        System.out.println("payment using credit card");
    }
}
