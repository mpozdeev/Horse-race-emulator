package home.maksim.race.api.impl;

import home.maksim.race.api.EmulationService;
import home.maksim.race.api.RaceService;
import home.maksim.race.data.Horse;
import lombok.Setter;
import lombok.ToString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

@Setter
@ToString
public class EmulationServiceImpl implements EmulationService {

    private RaceService raceService;
    private String betName;
//    private Set<String> names;
//    Thread t;

    public EmulationServiceImpl() {
    }

    @Override
    public void showInfo() {
        Horse[] horses = raceService.getHorses();
        System.out.println("Информация о заезде:");
        for (Horse horse : horses) {
            System.out.println("Имя лошади: " + horse.getNameHorse() + ", порода: " + horse.getBreed().getName() + ", наездник: " + horse.getRider().getName());
        }
    }

    @Override
    public boolean bet() {
        System.out.println("========================================");
        showInfo();
        boolean exit = false;
        Set<String> setNames = new HashSet<>();
        Horse[] horses = raceService.getHorses();
        for (Horse horse : horses) {
            setNames.add(horse.getNameHorse());
            setNames.add(horse.getRider().getName());
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean quite = true;
        while (quite) {
            System.out.println("----------------------------------------");
            System.out.println("Для выхода, вместо ставки, введите: exit");
            System.out.print("Сделайте ставку: ");
            String name = "";
            try {
                name = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (name.equals("exit")) {
                quite = false;
                System.out.println("До новых встреч )");
            } else if (setNames.contains(name)) {
                betName = name;
                exit = true;
                System.out.println("Ставка сделана!");
                quite = false;

            } else {
                System.out.println("Введено некорректное имя: " + name + ". Введите корректное имя ");
            }
        }
        return exit;
    }

    @Override
    public void startRace() {
//        showInfo();
        while (bet()) {
            List<Horse> listHorses = new ArrayList<>();
            Collections.addAll(listHorses, raceService.getHorses());
            for (int i = 0; i < 5; i++) {
                Collections.shuffle(listHorses);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int j = 1;
                for (Horse horse : listHorses) {
                    System.out.print("Отметка " + (i+1) + ": " + j + ": " + horse.getNameHorse() + ", ");
                    j++;
                }
                System.out.println();
            }

            if (betName.equals(listHorses.get(0).getNameHorse()) || betName.equals(listHorses.get(0).getRider().getName()))
                System.out.println("Ваша ставка " + betName + " выиграла");
            else {
                System.out.println("Ваша ставка " + betName + " проиграла");
            }
        }

    }
}
