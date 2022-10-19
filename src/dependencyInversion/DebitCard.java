package dependencyInversion;

public class DebitCard implements BankCard{

    public void doTransaction(){
        System.out.println("payment using debit card");
    }
}
