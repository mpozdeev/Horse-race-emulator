package home.maksim.race.data;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Race {
    private double distance;
    private Horse[] horses;

    public Race() {
    }

    public Race(double distance, Horse[] horses) {
        this.distance = distance;
        this.horses = horses;
    }
}
