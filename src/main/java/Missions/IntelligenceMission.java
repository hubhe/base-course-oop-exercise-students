package Missions;

import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class IntelligenceMission extends Mission{
    String region;

    public IntelligenceMission(String region, Coordinates mission_coordinates) {
        super(mission_coordinates);
        this.region = region;
    }

    public String collectIntelligence(){
        return " Collecting Data in " + region + " with sensor type: ";
    }

    @Override
    public String getMissionPlace() {
        return this.region;
    }
}
