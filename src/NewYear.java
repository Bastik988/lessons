import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class NewYear {
    public static void main(String[] args) {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите вашу дату");
//        String dateOne = sc.nextLine();
//        LocalDate date = LocalDate.parse(dateOne, formatter);
//        System.out.println("Введите ваше время");
//        String time = sc.nextLine();
//        LocalTime polNewYear = LocalTime.parse(time, formatterTime);
//        int newYear = date.getYear()+1;
//        String newYearTime = "23:59:59";
//        String dateNewYear = "01-01-"+newYear;
//        LocalDate dateTimeNewYear = LocalDate.parse(dateNewYear, formatter);
//        LocalTime timeNewYear = LocalTime.parse(newYearTime, formatterTime);
//        Duration duration = Duration.between(timeNewYear, polNewYear);
//        System.out.println(duration);
//        int days = (int) ChronoUnit.DAYS.between(date, dateTimeNewYear);
//        int hours = (int) ChronoUnit.HOURS.between(polNewYear, timeNewYear);
//        int min = (int) ChronoUnit.MINUTES.between(polNewYear, timeNewYear);
//        int sec = (int) ChronoUnit.SECONDS.between(polNewYear, timeNewYear);
//        System.out.println("До нового года осталось: "+ days +" дней и " + duration);
        LocalDateTime pol = LocalDateTime.parse("16-12-2024 18:30:30", formatter2);
        LocalDateTime newY = LocalDateTime.of(pol.getYear()+1, 1, 1, 0, 0, 0);
        Duration duration = Duration.between(pol, newY);
        System.out.println(duration.toDays() +" "+ duration.toHours()%24+" "+duration.toMinutes()%60+" "+duration.getSeconds()%60);

//        int newYearMonth = 1;
//        int newYearMonthDay = 1;
//        LocalTime timeNewYear = LocalTime.of(24, 0,0);
//        LocalDate dateNewYear = LocalDate.of(newYear, newYearMonth, newYearMonthDay);
//
//        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        System.out.println("Введите дату и время");
//        String str = sc.nextLine();
//        LocalDateTime dateTime2 = LocalDateTime.parse(str, formatter2);
//        int newYear2 = dateTime2.getYear()+1;
//        String dateTimeNew = "01-01-"+newYear2;
//        String dateNew = dateTime2.getDayOfMonth()+"-"+dateTime2.getMonth()+"-"+ dateTime2.getYear();
//        String timeNew = "00:00:00";
//        LocalDate date1 = LocalDate.parse(dateTimeNew, formatter);
//        LocalDate date2 = LocalDate.parse(dateNew, formatter);
//        String timeNew2 = dateTime2.getHour()+":"+dateTime2.getMinute()+":"+dateTime2.getSecond();
//        LocalTime time1 = LocalTime.parse(timeNew, formatterTime);
//        LocalTime time2 = LocalTime.parse(timeNew2, formatterTime);
////        String date = dateTime2.getDayOfMonth()+"-"+dateTime2.getMonth()+"-"+dateTime2.getYear();
////        LocalDate dateTimeNewYear2 = LocalDate.parse(dateTimeNew, formatter);
////        Duration duration2 = Duration.between(dateTime, dateTimeNewYear2);
//        int days = (int) ChronoUnit.DAYS.between(date1, date2);
//        Duration duration2 = Duration.between(time1, time2);
//        System.out.println(days+ " "+ duration2);
        //16-12-2024 18:30:30
    }
}
