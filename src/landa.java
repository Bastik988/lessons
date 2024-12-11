import java.util.ArrayList;
import java.util.stream.Stream;

public class landa {
    static int size = 0;
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String wordKey = "java";
        list.add("java.util");
        list.add("Hello world!");
        list.add("import java");
        list.add("java Language");
        list.add("Applecation");
        Stream<String> listStream = list.stream();
        long count = listStream.filter(s -> {
            ArrayList<Integer> integer = new ArrayList<>();
            for(int t = 0;t<s.length()-3;t++){
                integer.add(0);
            }
            for(int k=0;k<s.length()-3;k++) {
                for (int i = 0; i < wordKey.length(); i++) {
                    if (wordKey.charAt(i) == s.charAt(k+i)) {
                        integer.set(k, integer.get(k)+1);
                    }
                }
            }
            long num = integer.stream().filter(l -> l==4).count();
            if(num!=0){
                return true;
            }
            return false;
        }).count();
        System.out.println(count);
    }
}
