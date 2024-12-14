import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class NewYear {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SS");
        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите вашу дату и врем€");
        String dateOne = sc.nextLine();
        LocalDateTime dateTime = LocalDateTime.parse(dateOne, formatter);
    }
}
