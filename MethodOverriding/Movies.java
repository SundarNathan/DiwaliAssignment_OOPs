
class Movie{
    void getGenre(){
        System.out.println("Genre not decided");
    }
}

class ThrillerMovie extends Movie{
    void getGenre(){
        System.out.println("Thriller");
    }
}

class RomComMovie extends Movie{
    void getGenre(){
        System.out.println("RomCom");
    }
}

public class Main {
    public static void main(String[] args) {
        Movie m1= new ThrillerMovie();
        Movie m2= new RomComMovie();

        m1.getGenre();
        m2.getGenre();
    }
}