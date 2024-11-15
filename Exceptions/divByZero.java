

public class Main {
    public static void main(String[] args) {

        try{
            int a=1/0;
        }
        catch (ArithmeticException a)
        {
            System.out.println("Exception: "+ a.getMessage());
        }
    }
}