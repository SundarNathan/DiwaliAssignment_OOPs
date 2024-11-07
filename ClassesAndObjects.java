import java.util.ArrayList;
import java.util.List;

class Book{
    private String title, isbn, author;

    static int bookCount=0;
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
}

class Employee{
    private String name, id, salary, dept;

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
        System.out.println("Hello world!");
    }
}