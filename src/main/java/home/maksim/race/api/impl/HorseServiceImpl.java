package home.maksim.race.api.impl;

import home.maksim.race.api.HorseService;
import home.maksim.race.data.Breed;
import home.maksim.race.data.Horse;
import home.maksim.race.data.Rider;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
@ToString
public class HorseServiceImpl implements HorseService {

    private Breed[] breeds;
    private Rider[] riders;
    private Horse[] horses;

    public HorseServiceImpl() {
    }

    public HorseServiceImpl(Breed[] breeds, Rider[] riders, Horse[] horses) {
        this.breeds = breeds;
        this.riders = riders;
        this.horses = horses;
    }

    public static Horse[] pickHorsesRandom(Horse[] arrayHorses, Breed[] arrayBreeds, Rider[] arrayRiders) {
        List<Horse> listHorses = new ArrayList<>();
        List<Breed> listBreeds = new ArrayList<>();
        List<Rider> listRiders = new ArrayList<>();

        Collections.addAll(listHorses, arrayHorses);
        Collections.addAll(listBreeds, arrayBreeds);
        Collections.addAll(listRiders, arrayRiders);

        Collections.shuffle(listHorses);
        Collections.shuffle(listBreeds);
        Collections.shuffle(listRiders);

        Horse[] arrayRaceHorses = new Horse[arrayHorses.length];
        for (int i = 0; i < arrayHorses.length; i++) {
            Horse horse = listHorses.get(i);
            Breed breed = listBreeds.get(i);
            Rider rider = listRiders.get(i);
            horse.setBreed(breed);
            horse.setRider(rider);
            horse.setSpeed(breed.getSpeed() + rider.getExperience() + horse.getExperience());
            arrayRaceHorses[i] = horse;
        }
        return arrayRaceHorses;
    }
}
