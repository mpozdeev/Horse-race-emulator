package home.maksim.race.api;

public interface EmulationService {
    /*
    - выводим инфо о гонке
    - в конце приглашение сделать ставку:
    - пишем слово для поиска
    - далее проверяется если ли данное слово срди лошадей и наездников
    - если слово не существует выводится сообщение "Ставка" об этом и далее предлагается повторить ставку или выйти
    */

    void showInfo();
    boolean bet();
    void startRace();
//    void viewChampion();
}
