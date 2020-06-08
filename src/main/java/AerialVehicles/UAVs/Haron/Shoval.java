package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Shoval extends AerialVehicle implements AerialBdaVehicle, AerialIntelligenceVehicle, AerialAttackVehicle {
    static final int  MAX_HOURS_BEFORE_REPAIR = 150;

    String sensor_type;
    String camera_type;
    int number_of_missiles;
    String missiles_type;

    public Shoval(String camera_type, int number_of_missiles, String missiles_type, String sensor_type,String pilot_name, Mission mission, int flight_hours, Boolean readyToFly) {
        super(pilot_name, mission, flight_hours, readyToFly);

        this.missiles_type = missiles_type;
        this.number_of_missiles = number_of_missiles;
        this.sensor_type = sensor_type;
        this.camera_type = camera_type;
    }

    @Override
    public void check() {
        if(super.flight_hours_from_last_repair > MAX_HOURS_BEFORE_REPAIR){
            super.repair();
        }
    }

    @Override
    public String preformBda() {

        return super.pilot_name + ": Shoval taking pictures of " + super.current_mission.getMissionPlace() + " with: " + this.camera_type + " camera";
    }

    @Override
    public String attack() {
        return super.pilot_name + ": Shoval Attacking " + super.current_mission.getMissionPlace() + " with: " + this.missiles_type;
    }

    @Override
    public String collectIntelligence() {
        return super.pilot_name + ": Shoval Collecting Data in " + super.current_mission.getMissionPlace() + " with sensor type: " + this.sensor_type;

    }
}

