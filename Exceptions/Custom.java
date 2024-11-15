
class NotAllowed extends Exception{

    public NotAllowed(String m)
    {
        super(m);
    }
}

class Election{
    String name;
    int age;

    Election(String name, int age)
    {
        try{
            if(age<18)
            {
                throw new NotAllowed("Less than 18");
            }

            this.name=name;
            this.age=age;
        }
        catch(NotAllowed n)
        {
            System.out.println(n);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Election g= new Election("Sundar", 17);
    }
}