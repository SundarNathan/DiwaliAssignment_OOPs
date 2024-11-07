import java.util.*;

class Book{
    private String title, isbn, author;

    static int bookCount=0;

    Book(String title, String isbn, String author)
    {
        this.author=author;
        this.isbn=isbn;
        this.title=title;
    }
    public String getTitle(){
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    void addBooks(Book[] books)
    {
        for(int i=0;i<books.length;i++)
        {
            Scanner sc= new Scanner(System.in);
            String author= sc.nextLine();
            String title= sc.nextLine();
            String isbn= sc.nextLine();
            books[i]= new Book(title, isbn, author);
        }
        displayAllBooks(books);
    }
    void displayBook(Book book)
    {
        System.out.println("Author: "+book.author+" Title: "+book.title+" Isbn: "+book.isbn);
    }
    void displayAllBooks(Book[] books)
    {
        for(Book b:books)
            displayBook(b);
    }
}

class Employee{
    private String name, id, salary, dept;

    Employee(String name, String id, String salary, String dept)
    {
        this.name= name;
        this.id= id;
        this.salary= salary;
        this.dept= dept;
    }
    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    static int employeeCount=0;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getSalary() {
        return salary;
    }

    void addEmployee(Employee[] employees)
    {
        for(int i=0;i<employees.length;i++)
        {
            Scanner sc= new Scanner(System.in);
            String name= sc.nextLine();
            String id= sc.nextLine();
            String salary= sc.nextLine();
            String dept= sc.nextLine();
            employees[i]= new Employee(name, id, salary, dept);
        }
        displayAllEmployees(employees);
    }
    void displayEmployee(Employee e)
    {
        System.out.println("Name: "+e.name+" Salary: "+e.salary+" ID: "+e.id+" Department: "+e.dept);
    }
    void displayAllEmployees(Employee[] employees)
    {
        for(Employee e:employees)
            displayEmployee(e);
    }
}

class Flight{
    private String flightNo, from, to;

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}

class Movie{
    private String title, genre,director;
    static int numberOfScreens=0;

    public Movie(String title, String genre, String director) {
        this.title = title;
        this.genre = genre;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    void addMovie(Movie[] movie)
    {
        for(int i=0;i<movie.length;i++)
        {
            Scanner sc= new Scanner(System.in);
            String title=sc.nextLine(), genre=sc.nextLine(),director=sc.nextLine();
            movie[i]= new Movie(title, genre, director);
        }
        displayAllMovie(movie);
    }

    void displayAllMovie(Movie[] movie)
    {
        for(Movie m: movie)
        {
            displayMovie(m);
        }
    }

    void displayMovie(Movie m)
    {
        System.out.println("Titele: "+m.title+" Genre: "+m.genre+" Director: "+m.director);
    }
}

class Theatre{
    final List<Employee> Employees = new ArrayList<>();
    final List<Movie> Movies = new ArrayList<>();

    public List<Employee> getEmployees() {
        return Employees;
    }

    public void addEmployees(Employee e) {
        Employees.add(e);
    }

    public List<Movie> getMovies() {
        return Movies;
    }

    public void addMovies(Movie m) {
        Movies.add(m);
    }


}

public class Main {
    public static void main(String[] args) {

    }
}