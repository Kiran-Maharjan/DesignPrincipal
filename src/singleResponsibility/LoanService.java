package singleResponsibility;

public class LoanService {
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

}
