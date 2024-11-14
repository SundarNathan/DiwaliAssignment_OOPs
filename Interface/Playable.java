

interface Playable{
    void play();
    void pause();
    void stop();
}

class MP3Player implements Playable{

    public void play(){
        System.out.println("Playing.");
    }

    public void pause(){
        System.out.println("Paused.");
    }

    public void stop(){
        System.out.println("Stopped.");
    }
}

class CDPlayer implements Playable{

    public void play(){
        System.out.println("Playing.");
    }

    public void pause(){
        System.out.println("Paused.");
    }

    public void stop(){
        System.out.println("Stopped.");
    }
}

class StreamingPlayer implements Playable{

    public void play(){
        System.out.println("Playing.");
    }

    public void pause(){
        System.out.println("Paused.");
    }

    public void stop(){
        System.out.println("Stopped.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}