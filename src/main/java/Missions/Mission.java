package Missions;

import Entities.Coordinates;

public abstract class Mission{
    Coordinates mission_coordinates;

    public abstract void begin();
    public abstract void cancel();
    public abstract void finish();
}
