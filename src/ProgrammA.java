import java.time.LocalTime;

public class ProgrammA {
    static boolean pul = false;
    static boolean pul1 = false;
    static boolean pul2 = false;
    public static void main(String[] args) {
        LocalTime timeStartA = LocalTime.of(9, 0, 0);
        LocalTime timeEndA = LocalTime.of(18, 0, 0);
        while(true) {
            LocalTime timeA = LocalTime.now();
            if (timeA.getHour() == timeStartA.getHour()&&!pul) {
                System.out.println("Начало рабочего дня!");
                pul = true;
                pul1 = false;
                pul2 = false;
            } else if (timeA.getHour() >= timeEndA.getHour()&&!pul1) {
                System.out.println("Конец рабочего дня!");
                pul1 = true;
                pul = false;
                pul2 = false;
            } else if (timeA.getHour() > timeStartA.getHour()&&!pul2) {
                System.out.println("Рабочий день ещё не закончился!");
                pul2 = true;
                pul = false;
                pul1 = false;
            }
        }
    }
}
