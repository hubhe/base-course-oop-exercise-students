package Missions;

import Entities.Coordinates;

public abstract class Mission{
    Coordinates mission_coordinates;

    public Mission(Coordinates mission_coordinates){
        this.mission_coordinates = mission_coordinates;
    }

    public void begin(){
        System.out.println("Beginning Mission!");
    }

    public void cancel(){
        System.out.println("Abort  Mission!");
    }

    public void finish(){
        System.out.println("Finish Mission!");
    }

    public Coordinates getMissionCoordinates(){
        return mission_coordinates;
    }

    public abstract String getMissionPlace();
}
