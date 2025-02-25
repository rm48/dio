package MusicPlayer;

public class MusicApp implements MusicPlayer{

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
