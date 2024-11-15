
class InsufficientBalanceException extends Exception{

    InsufficientBalanceException(String m)
    {
        super(m);
    }


}

class Bank{
    int bal;

    void withDraw(int amt){

        try {
            if (amt > bal)
                throw new InsufficientBalanceException("Insufficient Balance");
        }catch (Exception e)
        {
            System.out.println("Insufficient Balance");
        }

    }

    void deposit(int amt){
        bal+=amt;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}