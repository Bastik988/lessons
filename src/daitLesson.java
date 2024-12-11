import java.sql.SQLOutput;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
public class daitLesson {
    public static void main(String[] args) {
        LocalDate num = LocalDate.now();
//        System.out.println(num);
//        int yer = num.getYear();
//        int month = num.getMonthValue();
//        int day = num.getDayOfMonth();
//        int day1 = num.getDayOfYear();
//        //int day2 = num.getDayOfWeek();
//        System.out.println(yer);
//        System.out.println(month);
//        System.out.println(day);
//        System.out.println(day1);
//        DayOfWeek dayOfWeek = num.getDayOfWeek();
//        System.out.println(dayOfWeek);
//        LocalDate map = LocalDate.of(yer, month, day);
//        System.out.println(map.plusYears(2023));
//        System.out.println(map.minusDays(3));
//        daitLesson.date();
        daitLesson.time();
        int rar = (int) ChronoUnit.DAYS.between(LocalDate.of(2020, 8, 1), LocalDate.of(2010, 1, 30));
        System.out.println(rar);
        System.out.println(num.plus(10, ChronoUnit.WEEKS));
        dateTime();
    }

    public static void date(){
        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите первую дату");
        String string = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(string, formatter);
        System.out.println("¬ведите вторую дату");
        String string1 = sc.nextLine();
        LocalDate localDate1 = LocalDate.parse(string1, formatter);
        int result = (localDate.getYear()*365+(int)localDate.getYear()/4+localDate.getDayOfYear())-
                (localDate1.getYear()*365+(int)localDate1.getYear()/4+localDate1.getDayOfYear());
        //int year = localDate.getDayOfYear()-localDate1.getDayOfYear();
        System.out.println(Math.abs(result));
    }

    public static void time(){
        LocalTime time = LocalTime.now();
        LocalTime time1 = LocalTime.of(1, 10, 20, 100000000);
        System.out.println(time);
        System.out.println(time1);
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        LocalTime time2 = LocalTime.now();
        Duration duration = Duration.between(time, time2);
        System.out.println(duration.toMillis());
        String gep = "15:20:04.100";
        LocalTime date = LocalTime.parse(gep);
    }

    public static void dateTime(){
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println(dateTime.minus(2, ChronoUnit.HOURS));
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime1 = LocalDateTime.of(date, time);
        LocalDateTime dateTime2 = LocalDateTime.of(2024, 12, 11, 19, 34);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SS");
        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите первую дату");
        String string = sc.nextLine();
        LocalDateTime localDate = LocalDateTime.parse(string, formatter);
        System.out.println(localDate);
    }
}
