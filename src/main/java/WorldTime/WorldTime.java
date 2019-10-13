package WorldTime;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class WorldTime {

    /**
     * Método responsável por mostrar as horas e minutos de um determinado pais
     * @param pais Nome do pais
     */
    public void getTimeByCountry(String pais) {
        DateTimeZone zone = DateTimeZone.forID(pais);
        DateTime time = new DateTime(zone);

        int hour = time.getHourOfDay();
        int minute = time.getMinuteOfHour();

        if (hour < 10 && minute < 10) {
            System.out.println("Em " + pais + " sao: 0" + hour + ":0" + minute);
        } else if (hour < 10) {
            System.out.println("Em " + pais + " sao: 0" + hour + ":" + minute);
        } else if (minute < 10) {
            System.out.println("Em " + pais + " sao: " + hour + ":0" + minute);
        } else {
            System.out.println("Em " + pais + " sao: " + hour + ":" + minute);
        }
    }

}
