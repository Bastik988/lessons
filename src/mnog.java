import java.util.*;
import java.util.LinkedList;

public class mnog {
    public static void main(String[] args) {
        List<Integer> A = new LinkedList<>();
        A.add(1);
        A.add(1);
        A.add(3);
        A.add(7);
        A.add(5);
        List<Integer> B = new LinkedList<>();
        B.add(1);
        B.add(8);
        B.add(3);
        B.add(9);
        B.add(5);
        List<Integer> C = new LinkedList<>();
        for(int i=0;i<A.size();i++){
            C.add(A.get(i));
        }
        for(int i=0;i<B.size();i++){
            C.add(B.get(i));
        }
        Set<Integer> str = new LinkedHashSet<>(C);
        List<Integer> mnogStr = new ArrayList<>(str);
        System.out.println(mnogStr);
        System.out.println(C);
        for (int i=0;i<C.size();i++){
            for(int j=0;j<mnogStr.size();j++){
                if(C.get(i).equals(mnogStr.get(j))){
                    C.remove(i);
                    mnogStr.get(j);
                }
            }
        }
        System.out.println(C);

        Set<Integer> d = new LinkedHashSet<>();
        for(int i=0;i<A.size();i++){
            for(int j=0;j<B.size();j++){
                if(A.get(i).equals(B.get(j))){
                    d.add(A.get(i));
                }
            }
        }
        System.out.println(d);
    }
}
