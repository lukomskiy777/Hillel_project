package hillel.lukomskiy.homework.tracking;

public class Main {
    public static void main(String[] args) {
        new TrackAcnt("Andry", 16, 11, 1992, "andry@email.com", "+63463", "Lukomskiy", 80, 80, 30000).printAccountInfo();
        new TrackAcnt("Helena", 14, 11, 2001, "helena@email.com", "+25325234", "Lukomskaja", 50, 60, 10000).printAccountInfo();

        TrackAcnt Anton = new TrackAcnt("Anton", 10, 10, 1992, "anton@email.com", "+1861681", "Laskavui", 90, 94, 10000);
        Anton.printAccountInfo();
        Anton.setSurname("Uspeh");
        Anton.setWeight(65);
        Anton.setPress(110);
        Anton.setSteps(15000);
        Anton.printAccountInfo();
    }
}

