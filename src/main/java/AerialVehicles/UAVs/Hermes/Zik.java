package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.BdaMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Zik extends AerialVehicle implements AerialBdaVehicle, AerialIntelligenceVehicle {
    static final int  MAX_HOURS_BEFORE_REPAIR = 100;

    String sensor_type;
    String camera_type;

    public Zik(String camera_type, String sensor_type, String pilot_name, Mission mission, int flight_hours, Boolean readyToFly) {
        super(pilot_name, mission, flight_hours, readyToFly);

        this.camera_type = camera_type;
        this.sensor_type = sensor_type;
    }

    @Override
    public void check() {
        if(super.flight_hours_from_last_repair > MAX_HOURS_BEFORE_REPAIR){
            super.repair();
        }
    }

    @Override
    public String preformBda() {

        return super.pilot_name + ": Zik taking pictures of " + super.current_mission.getMissionPlace() + " with: " + this.camera_type + " camera";
    }
    @Override
    public String collectIntelligence() {
        return super.pilot_name + ": Zik Collecting Data in " + super.current_mission.getMissionPlace() + " with sensor type: " + this.sensor_type;

    }
}
