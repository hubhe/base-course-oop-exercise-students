package Missions;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class BdaMission extends Mission{
    String objective;

    public BdaMission(String objective, Coordinates mission_coordinates) {
        super(mission_coordinates);
        this.objective = objective;
    }

    public String preformBda(){
        return " taking pictures of suspect" + objective + " with: ";
    }

    @Override
    public String getMissionPlace() {
        return this.objective;
    }
}
