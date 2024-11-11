
class Character{
    private String characterClass;
    private int level,hitPoints;

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}

class Destination{
    private String name;
    private int inhabitants;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
    }
}

enum TravelMethod{
    WALKING, HORSEBACK;
}

class GameMaster{
    void describe(Character character)
    {
        System.out.println("You're a level "+ character.getLevel()+" Wizard with "+character.getHitPoints()+" hit points.");
    }
    void describe(Destination destination)
    {
        System.out.println("You've arrived at "+destination.getName()+", which has "+destination.getInhabitants()+" inhabitants.");
    }
    void describe(TravelMethod tm)
    {
        if(tm==TravelMethod.HORSEBACK)
        {
            System.out.println("You're traveling to your destination on horseback.");
        }
        else
        {
            System.out.println("You're traveling to your destination by walking.");
        }
    }
    void describe(Character c, Destination d, TravelMethod tm)
    {
        describe(c);
        describe(tm);
        describe(d);
    }
    void describe(Character c, Destination d)
    {
        describe(c);
        describe(TravelMethod.WALKING);
        describe(d);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}