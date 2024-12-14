import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class NewYear {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите вашу дату");
        String dateOne = sc.nextLine();
        LocalDate date = LocalDate.parse(dateOne, formatter);
        System.out.println("Введите ваше время");
        String time = sc.nextLine();
        LocalTime polNewYear = LocalTime.parse(time, formatterTime);
        int newYear = date.getYear()+1;
        String newYearTime = "23:59:59";
        String dateNewYear = "01-01-"+newYear;
        LocalDate dateTimeNewYear = LocalDate.parse(dateNewYear, formatter);
        LocalTime timeNewYear = LocalTime.parse(newYearTime, formatterTime);
        int days = (int) ChronoUnit.DAYS.between(date, dateTimeNewYear);
        int hours = (int) ChronoUnit.HOURS.between(polNewYear, timeNewYear);
        int min = (int) ChronoUnit.MINUTES.between(polNewYear, timeNewYear);
        int sec = (int) ChronoUnit.SECONDS.between(polNewYear, timeNewYear);
        System.out.println("До нового года осталось: "+ days +" дней и "+ hours +":"+ min +":"+ sec);

//        int newYearMonth = 1;
//        int newYearMonthDay = 1;
//        LocalTime timeNewYear = LocalTime.of(24, 0,0);
//        LocalDate dateNewYear = LocalDate.of(newYear, newYearMonth, newYearMonthDay);
    }
}
