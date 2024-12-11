import java.util.ArrayList;
import java.util.stream.Stream;

public class landaF {
    public static void main(String[] args) {
        myIterface map = (int b, int a)->b+a;
        System.out.println(map.method(5, 10));
        System.out.println(map.method(8, 72));
        myIterface pam = (c, d)->{
            int result = c+d;
            return result;
        };
        System.out.println(pam.method(8, 7));
        ArrayList<String> giv = new ArrayList<>();
        giv.add("Hello");
        giv.add("Gzvjflkxgjbn lf");
        giv.add("GFJKKVnf");
        giv.add("fcjgolifjgl");
        giv.add("Why");

        Stream<String> move = giv.stream();
        move = move.filter(s -> s.length()>6);
        move.forEach(s -> System.out.println(s));
        giv.stream().filter(s -> s.length()>6).forEach(s -> System.out.println(s));
        long count = giv.stream().filter(a -> a.toLowerCase().charAt(0)=='h'||a.toLowerCase()
                .charAt(0)=='w').count();
        System.out.println(count);
        giv.stream().filter(a -> a.toLowerCase().charAt(0)=='h'||a.toLowerCase().charAt(0)=='w')
                .map(m -> m.repeat(2))
                .forEach(n -> System.out.println(n));
    }
}

interface myIterface{
    abstract int method(int i, int k);
}
