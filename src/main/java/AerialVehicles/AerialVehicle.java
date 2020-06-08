package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;
import Missions.MissionTypeException;


public abstract class AerialVehicle {
    String pilot_name;
    Mission current_mission;
    int flight_hours_from_last_repair;
    Boolean is_plain_ready;

    public abstract void flyTo();

    public void check(){

    }

    public void land(){
        System.out.println("Landing");
    }
}
