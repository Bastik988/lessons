import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class methodsStreamAP {
    static int result = 0;
    public static void main(String[] args) {
        ArrayList<Integer> integ = new ArrayList<>();
        integ.add(5);
        integ.add(2);
        integ.add(10);
        integ.add(7);
        integ.add(1);

        System.out.println(integ.stream().limit(3).count());
        //ArrayList<Integer> integ2 = integ.stream().skip(2).collect(Collectors.toList);
        System.out.println(integ.stream().skip(2).collect(Collectors.toList()));
        System.out.println(integ.stream().anyMatch(s -> s==5));
        System.out.println(integ.stream().allMatch(s -> s!=0));
        System.out.println(integ.stream().noneMatch(s -> s!=0));
        System.out.println(integ.stream().filter(s -> s>5).findFirst());
        Optional map = integ.stream().filter(s -> s>11).findFirst();
        if(map.isPresent()) System.out.println(map.get());

        ArrayList<String> midle = new ArrayList<>();
        midle.add("H");
        midle.add("He");
        midle.stream().forEach(s -> result += s.length());
        System.out.println((double)result/midle.size());
        List<Integer> two = integ.stream().map(s -> s*s).collect(Collectors.toList());
        System.out.println(two);
    }
}
