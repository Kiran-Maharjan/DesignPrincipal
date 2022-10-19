package dependencyInversion;

public class ShoppingMall {

    private  BankCard bankCard;
    private DebitCard debitCard;
    private CreditCard creditCard;

    public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }
    public ShoppingMall(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount,BankCard bankCard){
        bankCard.doTransaction();
    }

    public static void main(String[] args) {
       DebitCard debitCard=new DebitCard();
        ShoppingMall shoppingMall=new ShoppingMall(debitCard);
        shoppingMall.doPurchaseSomething(5000,debitCard);

        CreditCard creditCard=new CreditCard();
        ShoppingMall shoppingMall2=new ShoppingMall(creditCard);
        shoppingMall2.doPurchaseSomething(3000,creditCard);

        BankCard bankCard1=new DebitCard();
        ShoppingMall shoppingMall3=new ShoppingMall(bankCard1);
        shoppingMall3.doPurchaseSomething(1000,bankCard1);



    }
}
