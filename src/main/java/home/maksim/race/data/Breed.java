package home.maksim.race.data;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Breed {
    private String name;
    private double speed;

    public Breed(String name) {
        this.name = name;
        this.speed = 40.0; //by default
    }

    public Breed(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }
}
