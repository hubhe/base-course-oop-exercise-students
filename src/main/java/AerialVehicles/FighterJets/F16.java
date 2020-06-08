package AerialVehicles.FighterJets;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Missions.AttackMission;
import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F16 extends AerialVehicle implements AerialAttackVehicle, AerialBdaVehicle {
    static final int  MAX_HOURS_BEFORE_REPAIR = 250;

    String camera_type;
    int number_of_missiles;
    String missiles_type;

    public F16(String camera_type, int number_of_missiles, String missiles_type, String pilot_name, Mission mission, int flight_hours, Boolean readyToFly) {
        super(pilot_name, mission, flight_hours, readyToFly);

        this.missiles_type = missiles_type;
        this.number_of_missiles = number_of_missiles;
        this.camera_type = camera_type;
    }

    @Override
    public void check() {
        if(super.flight_hours_from_last_repair > MAX_HOURS_BEFORE_REPAIR){
            super.repair();
        }
    }

    @Override
    public String attack() {
        return super.pilot_name + ": F16 Attacking " + super.current_mission.getMissionPlace() + " with: " + this.missiles_type;
    }

    @Override
    public String preformBda() {
        return super.pilot_name + ": F16 taking pictures of " + super.current_mission.getMissionPlace() + " with: " + this.camera_type + " camera";
    }
}
