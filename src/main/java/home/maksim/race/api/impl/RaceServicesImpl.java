package home.maksim.race.api.impl;

import home.maksim.race.api.RaceService;
import home.maksim.race.data.Horse;
import home.maksim.race.data.Race;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class RaceServicesImpl implements RaceService {
    private double distance;
    private Horse[] horses;

    public RaceServicesImpl() {
    }

    public RaceServicesImpl(Horse[] horses) {
        this.horses = horses;
    }

    public RaceServicesImpl(double distance, Horse[] horses) {
        this.distance = distance;
        this.horses = horses;
    }

    @Override
    public Race getRace() {
        int countRaceHorses = rndCountRaceHorses(2, horses.length);
        Race race = new Race();
        race.setDistance(distance);
        race.setHorses(pickNHorsesRandom(horses, countRaceHorses));
        return race;
    }



    public Horse[] pickNHorsesRandom(Horse[] arrayHorses, int countRaceHorses) {
        List<Horse> listHorses = new ArrayList<>();
        Collections.addAll(listHorses, arrayHorses);
        Collections.shuffle(listHorses);
        Horse[] arrayRaceHorses = new Horse[countRaceHorses];
        for (int i = 0; i < countRaceHorses; i++)
            arrayRaceHorses[i] = listHorses.get(i);
        return arrayRaceHorses;
    }

    public int rndCountRaceHorses(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

}
