package singleResponsibility;

public class NotificationService {
    public void sendOTP(String medium){
        if(medium.equalsIgnoreCase("email")){
            // write email related logic
            //use JavaMailSenderAPI
        } if(medium.equalsIgnoreCase("mobile")){
            // write logic using twillio API
        }
    }
    public void sendTransactionReport(String medium){
        if(medium.equalsIgnoreCase("email")){
            // write email related logic
            //use JavaMailSenderAPI
        } if(medium.equalsIgnoreCase("mobile")){
            // write logic using twillio API
        }
    }

}
