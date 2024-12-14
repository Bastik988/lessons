import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class NewYear {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите вашу дату");
        String dateOne = sc.nextLine();
        LocalDate date = LocalDate.parse(dateOne, formatter);
        int newYear = date.getYear()+1;
        String dateNewYear = "01-01-"+newYear;
        LocalDate dateTimeNewYear = LocalDate.parse(dateNewYear, formatter);
        int result = (int) ChronoUnit.DAYS.between(date, dateTimeNewYear);
        System.out.println(result);

//        int newYearMonth = 1;
//        int newYearMonthDay = 1;
//        LocalTime timeNewYear = LocalTime.of(24, 0,0);
//        LocalDate dateNewYear = LocalDate.of(newYear, newYearMonth, newYearMonthDay);
    }
}
