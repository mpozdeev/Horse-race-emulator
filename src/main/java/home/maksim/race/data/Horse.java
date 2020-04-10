package home.maksim.race.data;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "nameHorse")
public class Horse {
    private String nameHorse;
    private Breed breed;
    private Rider rider;
    private int experience; // 0 - newbie .. 10 - professional
    private double speed; // speed = Breed.speed + Rider.experience + Horse.experience

    public Horse() {
    }

    public Horse(String nameHorse) {
        this.nameHorse = nameHorse;
    }

    public Horse(String nameHorse, Breed breed, Rider rider) {
        this.nameHorse = nameHorse;
        this.breed = breed;
        this.rider = rider;
        this.experience = 0;
        this.speed = breed.getSpeed() + rider.getExperience() + this.experience;
    }

    public Horse(String nameHorse, Breed breed, Rider rider, int experience) {
        this.nameHorse = nameHorse;
        this.breed = breed;
        this.rider = rider;
        this.experience = experience;
        this.speed = breed.getSpeed() + rider.getExperience() + this.experience;
    }
}
