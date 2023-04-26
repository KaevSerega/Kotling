import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeForm {
    // формат даты 1
    private static final DateTimeFormatter dateFormatter
            = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    // формат даты 2
   // private static final DateTimeFormatter dateFormatterNew
   //         = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm:ss a");

    public static void main(String[] args) {

        String date = "2019-05-23 00:00";

// строка в LocalDateTime
        LocalDateTime ldateTime = LocalDateTime.parse(date, dateFormatter);

        System.out.println(dateFormatter.format(ldateTime));

// изменить формат даты
       // System.out.println(dateFormatterNew.format(ldateTime));


    }

}