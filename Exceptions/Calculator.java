
class IllegalOperationException extends Exception{
    IllegalOperationException(String m)
    {
        super(m);
    }
}

class CalculatorConundrum {

    int calculate(int a, int b, char c) {
        try {
            return switch (c) {
                case '+' -> a + b;
                case '*' -> a * b;
                case '/' -> {
                    if (b == 0)
                        throw new IllegalOperationException("Division by 0 not allowed");
                    yield a / b;
                }
                case '-' -> throw new IllegalOperationException("IllegalOperationException");
                default -> throw new IllegalArgumentException();
            };
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return -1;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}