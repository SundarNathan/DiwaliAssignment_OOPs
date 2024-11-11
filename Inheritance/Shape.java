
class Shape{
    int l,b;
    double area ()
    {
        return l * b;
    }
}

class circle extends Shape
{
    int r;
    circle(int r)
    {
        this.r=r;
    }

    double area()
    {
        return 3.14*r*r;
    }


}

class rectangle extends  Shape
{

    rectangle (int l, int b)
    {
        super.l=l;
        this.b=b;;
    }



}

public class Main {
    public static void main(String[] args) {
        Shape rec= new rectangle(5,3);
        Shape cir= new circle(5);
        System.out.println(rec.area()+" "+cir.area());
    }
}