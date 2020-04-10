package home.maksim.race.api;

import home.maksim.race.data.Horse;
import home.maksim.race.data.Race;

public interface RaceService {
    Race getRace();
    Horse[] getHorses();
}
