import java.util.PriorityQueue;

abstract class Fighter{

    abstract boolean isVulnerable();

    abstract int getDamagePoints(Fighter fighter);
}

class Warrior extends Fighter{

    @Override
    public String toString()
    {
         return "Fighter is a Warrior";
    }

    boolean isVulnerable(){
        return false;
    }

    @Override
    int getDamagePoints(Fighter f)
    {
        if(f.isVulnerable())
        {
            return 10;
        }
        else return 6;
    }

}

class Wizard extends Fighter{

    boolean spellPrepared;
    @Override
    public String toString()
    {
        return "Fighter is a Wizard";
    }

    void prepareSpell()
    {
        spellPrepared=true;
    }

    boolean isVulnerable(){
        return !spellPrepared;
    }

    int getDamagePoints(Fighter f)
    {
        if(spellPrepared)
        {
            return 12;
        }
        else return 3;
    }
}

public class Main {
    public static void main(String[] args) {

        Warrior warrior= new Warrior();
        System.out.println(warrior.toString());
        System.out.println(warrior.isVulnerable());

        Wizard wizard= new Wizard();
        System.out.println(warrior.getDamagePoints(wizard));

        System.out.println(wizard.toString());

        wizard.prepareSpell();
        System.out.println(wizard.isVulnerable());
        System.out.println(wizard.getDamagePoints(warrior));

    }
}