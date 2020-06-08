package Missions;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class AttackMission extends Mission{
    String target;

    public AttackMission(String target, Coordinates mission_coordinates) {
        super(mission_coordinates);
        this.target = target;
    }

    @Override
    public String getMissionPlace() {
        return this.target;
    }
}
