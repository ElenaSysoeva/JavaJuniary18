package Railway;

import java.time.LocalDateTime;
//Поездка
public class Trip {
    String Number;
    City From;
    City To;
    LocalDateTime Date;

    public Trip ( City from, City to, String number, LocalDateTime date){
        this.Number = number;
        this.From = from;
        this.To = to;
        this.Date = date;

    }
}
