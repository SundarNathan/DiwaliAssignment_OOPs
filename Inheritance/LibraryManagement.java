import java.util.ArrayList;
import java.util.List;

class LibraryManagementSystem{
    private String userType, userName, password;

    LibraryManagementSystem(String userType, String userName, String password)
    {
        this.userType=userType;
        this.userName=userName;
        this.password=password;
    }
    void login()
    {

    }

    void register()
    {

    }

    void logOut()
    {

    }
}

class User extends LibraryManagementSystem{
    String name;
    int id;

    User(String name, int id, String userName, String password, String userType) {
        super(userType, userName, password);
        this.name = name;
        this.id = id;
    }
    void verify()
    {

    }

    void checkAccount(){

    }

    void getBookInfo(){

    }

}

class Student extends User {

    public Student(String name, int id, String userName, String passwrord) {
        super(name, id, userName, passwrord, "Student");
    }
}

class Staff extends User {

    public Staff(String name, int dept, String userName, String password) {
        super(name, dept, userName, password, "staff");
    }
}

class Account{
    int noBorrowedBooks, noReservedBooks, noReturnedBooks, noLostBooks, fineAmount;

    void calculateFine()
    {

    }
}

class Book{
    String title, author, isbn, publication;

    void showDueDt()
    {

    }

    void reservationStatus()
    {

    }
    void feedback()
    {

    }

    void bookRequest()
    {

    }

    void renwInfo()
    {

    }
}

class Librarian extends LibraryManagementSystem{
    String searchString, password;

    public Librarian(String name, String userName, String password) {
        super(name, userName, password);
    }
    void verifyLibrarian()
    {

    }

    void search()
    {

    }

}

class LibraryDatabase extends Librarian{

    List<Book> lob=new ArrayList<>();

    LibraryDatabase(String name, String userName, String password) {
        super(name, userName, password);
    }
    void add()
    {

    }

    void delete(){

    }

    void update(){

    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}