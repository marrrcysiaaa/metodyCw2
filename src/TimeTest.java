public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time();
        int hour = 14;
        System.out.println("14 godzina to: " + time.hourToMinut(hour) + " minut");
        System.out.println(time.hourToMinut(hour) + " minut to: " +
                time.minToSec(time.hourToMinut(hour)) + " sekund");
        System.out.println(time.minToSec(time.hourToMinut(14)) + " minut to: " +
                time.secToMilisec(time.minToSec(time.hourToMinut(hour))) + " milisekund");

        System.out.println(hour + " godzin to " +
                time.secToMilisec(time.minToSec(time.hourToMinut(hour))) + " milisekund");
    }
}
