
abstract class Product{

    int price;
    Product(int price)
    {
        this.price=price;
    }
    abstract int getPrice();

    abstract void getDescription();
}

class ElectronicProduct extends Product{

    int tax=2;

    ElectronicProduct(int price)
    {
        super(price);
    }
    int getPrice()
    {
        return price*tax;
    }

    void getDescription(){
        System.out.println("Type: Electronic\nPrice: "+getPrice());
    }
}

class ClothingProduct extends Product{
    int tax=3;

    ClothingProduct(int price)
    {
        super(price);
    }

    int getPrice()
    {
        return price*tax;
    }

    void getDescription(){
        System.out.println("Type: Cloting\nPrice: "+getPrice());
    }
}

class BookProduct extends Product{
    int tax=4;

    BookProduct(int price)
    {
        super(price);
    }

    int getPrice()
    {
        return price*tax;
    }

    void getDescription(){
        System.out.println("Type: Book\nPrice: "+getPrice());
    }
}
public class Main {
    public static void main(String[] args) {

        Product p1= new ElectronicProduct(100);
        Product p2= new ClothingProduct(200);
        Product p3= new BookProduct(300);

        p1.getDescription();
        p2.getDescription();
        p3.getDescription();
        System.out.println("TotalCost: "+ (p1.getPrice()+p2.getPrice()+p3.getPrice()));
    }
}