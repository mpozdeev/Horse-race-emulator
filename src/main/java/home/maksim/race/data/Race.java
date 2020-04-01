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
}
