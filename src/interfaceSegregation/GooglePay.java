package interfaceSegregation;

public class GooglePay implements  UPIPayments,CashBackManger{

    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCreditBalance() {
    //this feature is available in Gpay
    }
}
