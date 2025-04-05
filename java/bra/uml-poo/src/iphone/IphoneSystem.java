package iphone;

import InternetBrowser.InternetBrowser;
import MusicPlayer.MusicPlayer;
import TelephoneDevice.TelephoneDevice;

public class IphoneSystem implements TelephoneDevice, InternetBrowser, MusicPlayer {

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
    
    public void showPage() {
        System.out.println("Showing page...");
    }

    public void addNewTab() {
        System.out.println("Adding new tab...");
    }

    public void refreshPage() {
        System.out.println("Refreshing page...");
    }
    
    public void play() {
        System.out.println("Playing music...");
    }

    public void pause() {
        System.out.println("Pausing music...");
    }

    public void selectMusic() {
        System.out.println("Selecting music...");
    }
    
}
