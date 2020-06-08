package AerialVehicles.FighterJets;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F15 extends AerialVehicle implements AerialAttackVehicle, AerialIntelligenceVehicle {
    static final int  MAX_HOURS_BEFORE_REPAIR = 250;

    String sensor_type;
    int number_of_missiles;
    String missiles_type;

    public F15(String sensor_type, int number_of_missiles, String missiles_type, String pilot_name, Mission mission, int flight_hours, Boolean readyToFly){
        super(pilot_name, mission, flight_hours, readyToFly);

        this.missiles_type = missiles_type;
        this.number_of_missiles = number_of_missiles;
        this.sensor_type = sensor_type;
    }

    @Override
    public void check() {
        if(super.flight_hours_from_last_repair > MAX_HOURS_BEFORE_REPAIR){
            super.repair();
        }
    }

    @Override
    public String attack() {
            return super.pilot_name + ": F15 Attacking " + super.current_mission.getMissionPlace() + " with: " + this.missiles_type;
    }

    @Override
    public String collectIntelligence() {
        return super.pilot_name + ": F15 Collecting Data in " + super.current_mission.getMissionPlace() + " with sensor type: " + this.sensor_type;
    }

}
