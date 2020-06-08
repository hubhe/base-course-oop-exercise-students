package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;
import Missions.MissionTypeException;


public abstract class AerialVehicle {
    protected String pilot_name;
    protected Mission current_mission;
    protected int flight_hours_from_last_repair;
    protected Boolean readyToFly;

    public AerialVehicle(String pilot_name, Mission mission, int flight_hours, Boolean readyToFly){
        this.pilot_name = pilot_name;
        this.current_mission = mission;
        this.flight_hours_from_last_repair = flight_hours;
        this.readyToFly = readyToFly;
    }

    public void flyTo(){
        Double lat = current_mission.getMissionCoordinates().getLatitude();
        Double lon = current_mission.getMissionCoordinates().getLongitude();

        System.out.println("Flying to: " + lat + ", " + lon);
    }

    public abstract void check();

    public void land(){
        System.out.println("Landing");
    }

    public void repair(){
        this.readyToFly = true;
        this.flight_hours_from_last_repair = 0;
    }

    public void setMission(Mission new_mission){
        this.current_mission = new_mission;
    }

    public void setHoursOfFlightSinceLastRepair(int hours){
        this.flight_hours_from_last_repair = hours;
    }

    public int getHoursOfFlightSinceLastRepair(){
        return this.flight_hours_from_last_repair;
    }
}
