import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long ph;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter phone number: ");
        try{
            ph= sc.nextLong();
        }
        catch (InputMismatchException e)
        {
            System.out.println("InputMismatchException");
        }

    }
}