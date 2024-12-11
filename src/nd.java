import java.util.ArrayList;
import java.util.stream.Stream;

public class nd {
    public static void main(String[] args) {
        //with map
        System.out.println("1)With map");
        ArrayList<Integer> number = new ArrayList<>();
        number.add(-8);
        number.add(-5);
        number.add(0);
        number.add(1);
        number.add(2);
        number.stream().filter(s -> s < 0).map(m -> m * m).forEach(k -> System.out.println("    "+k));
        System.out.println("  ------");
        //without map
        System.out.println("2)Without map");
        ArrayList<Integer> num = new ArrayList<>();
        num.add(-8);
        num.add(-5);
        num.add(0);
        num.add(1);
        num.add(2);
        num.stream().filter(s -> s<0).forEach(n -> System.out.println("    "+n*n));
    }
}