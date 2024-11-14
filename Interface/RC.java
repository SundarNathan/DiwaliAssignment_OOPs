import java.util.Collections;
import java.util.List;

interface RemoteControlCar{
    void drive();
    int getDistanceTravelled();

}

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{

    int dist=0, victories;
    public void drive(){
        dist+=10;
    }

    public int getDistanceTravelled(){
        return dist;
    }

    public int compareTo(ProductionRemoteControlCar other) {
        return this.victories - other.victories;
    }
}

class ExperimentalRemoteControlCar implements RemoteControlCar{

    int dist=0;
    public void drive(){
        dist+=20;
    }

    public int getDistanceTravelled(){
        return dist;
    }
}

class TestTrack{

    void race(RemoteControlCar rc)
    {
        rc.drive();
    }

    List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> pcList)
    {
        Collections.sort(pcList);

        return pcList;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}