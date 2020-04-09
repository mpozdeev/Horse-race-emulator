package home.maksim.race;

import home.maksim.race.api.EmulationService;
import home.maksim.race.api.RaceService;
import home.maksim.race.api.impl.RaceServicesImpl;
import home.maksim.race.data.Race;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunRaceEmulation {
//    Thread t;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        EmulationService emulationService = (EmulationService)context.getBean("emulationService");
//        RaceService raceService = (RaceServicesImpl) context.getBean("raceServicesImpl");
        emulationService.startRace();
//        System.out.println("---------------");
//        Race race = raceService.getRace();
//        System.out.println(race.toString());

//        Horse[] horses = horseService.getRaceHorses();
//               for (Horse horse: horses){
//            System.out.println(horse);
//        }


/*        RunRaceEmulation re = new RunRaceEmulation();
        re.processing();*/
    }

    /*public void processing() {
        t = new Thread() {
            public void run() {
                System.out.print("Processing.....");
                for (int i = 0; i <= 100; i++) {
                    System.out.print(i + "%");
                    try {
                        t.sleep(250);
                    } catch (Exception e) {
                    }
                    if (i < 10) {
                        System.out.print("\b\b");
                    } else {
                        System.out.print("\b\b\b");
                    }

                }
            }
        };
        t.start();
    }*/

}
