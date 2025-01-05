import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hashed {
    public static void main(String[] args) {
        Account<Hashed> aa = new Account<>(new Hashed(), 35);
        System.out.println(aa.getId());
        //1
        Map<String, String> map = new HashMap<>();
        map.put("Яблоко", "Apple");
        map.put("Кошка", "Cat");
        map.put("Собака", "Dog");
        map.put("Журналы", "Magazins");
        for(String a: map.keySet()){
            System.out.println(a+"-"+map.get(a));
        }

        //2.0
        List<String> m = new ArrayList<>();
//        String text = "Они уважают человеческую личность";
        m.add("Они");
        m.add("уважают");
        m.add("лгут");
        m.add("человеческую");
        m.add(" ");
        Set<String> set = new HashSet<>(m);
        Map<String, Integer> maps = new HashMap<>();
        for(String a: set){
            int count = 0;
            for(String b: m){
                if(a.equals(b)){
                    count++;
                }
            }
            maps.put(a, count);
        }
        System.out.println(maps);

        //2.2
        Map<String, Integer> map1 = m.stream().collect(Collectors.toMap(s -> s, s -> 1, Integer::sum));
        System.out.println(map1);
        System.out.println(maps);
//        for(int i=0; i<m.length;i++){
//            maps.put(n, m[i]);
//            n++;
//        }
//        int n1 = 0;
//        for(int i=0;i<text.length();i++){
//            while(text.charAt(i)!=" "){
//                if(maps.get(n1).charAt(i)==(text.charAt(i))){
//                }
//            }
//        }
        //3
        Map<String, String> map3 = new HashMap<>();
        map3.put("Яблоко", "Apple");
        map3.put("Кошка","Cat");
        map3.put("Собака","Dog");
        map3.put("Журналы","Magazins");
        Stream<Map.Entry<String, String>> stream = map3.entrySet().stream();
        stream.forEach(s -> System.out.println(s.getKey()+"-"+s.getValue()));
    }
}

class Account<T>{

    private T id;
    private int sum;

    Account(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}