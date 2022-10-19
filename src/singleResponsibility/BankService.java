package singleResponsibility;

public class BankService {

    public long deposit(long accountNo, long amount){
        //deposit amount
        return 0;
    }
    public long withdraw(long accountNo, long amount){
        //withdraw amount
        return 0;
    }

    public void passbook(){
        //update transaction information in passbook
    }

    public long getLoanInterest(String loanType){
        if(loanType.equalsIgnoreCase("home")){
            //do some job
        }  if(loanType.equalsIgnoreCase("personal")){
            //do some job
        }  if(loanType.equalsIgnoreCase("car")){
            //do some job
        }
        return 0;
    }

    public void sendOTP(String medium){
        if(medium.equalsIgnoreCase("email")){
         // do some job
        } if(medium.equalsIgnoreCase("mobile")){
         // do some job
        }
    }
}
