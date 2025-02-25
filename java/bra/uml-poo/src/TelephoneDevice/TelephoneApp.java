package TelephoneDevice;

public class TelephoneApp implements TelephoneDevice{

    public void call(){
        typePhoneNumber();
        System.out.println("Calling...");
    }
    public void answer(){
        System.out.println("Answering incoming call...");
    }
    public void startVoiceMail(){
        System.out.println("Starting voice mail...");
    }
    private void typePhoneNumber(){
        System.out.println("Typing phone number...");
    }
}