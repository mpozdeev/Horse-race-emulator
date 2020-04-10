package home.maksim.race.data;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "name")
public class Rider {
    private String name;
    private int experience; // 0 - newbie .. 10 - professional

    public Rider(String name) {
        this.name = name;
        this.experience = 0;
    }

    public Rider(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }
}
