import java.util.*;
import java.util.Collections;

public class dictionary {
    public static void main(String[] args) {
        Map<Integer, String> dictionary = new LinkedHashMap<>();
        Map<Integer, String> dictionaryEnd = new LinkedHashMap<>();
        dictionary.put(1, "Apple");
        dictionary.put(2, "Carrot");
        dictionary.put(3, "Orange");
        dictionary.put(4, "Banana");
        System.out.println(dictionary);
        List<Integer> key = new ArrayList<>();
        List<String> dic = new ArrayList<>(dictionary.values());
        Collections.sort(dic);
        Map<Integer, String> dictionary3 = new LinkedHashMap<>();
        for(int i=0;i<dic.size();i++){
            for(Map.Entry<Integer, String> a: dictionary.entrySet()){
                if(dic.get(i).equals(a.getValue())){
                    dictionary3.put(a.getKey(), a.getValue());
                    break;
                }
            }
        }
        System.out.println(dictionary3);
        for(int i=1;i<dictionary.size()+1;i++) {
            char symbol = dictionary.get(i).charAt(0);
//            System.out.println(symbol);
            int sumInt = symbol-'A';
            key.add(sumInt);
        }
        Collections.sort(key);
//        System.out.println(key);

        for(int i=0;i<key.size();i++){
            int integer = key.get(i);
            for(int j=1;j<dictionary.size()+1;j++){
                int ch = integer+'A';
                if(ch==dictionary.get(j).charAt(0)){
                    dictionaryEnd.put(ch, dictionary.get(j));
                }
            }
        }
        System.out.println(dictionaryEnd);
        System.out.println(dic);
//        System.out.println(key);
//        for(int i=0;i<key.size();i++){
//            for(int j=key.size();j>0;j++){
//                if(key.get(i)>key.get(j)){
//                    keyOrder.add(i);
//                }
//                else if(key.get(i)==key.get(j)){
//                    keyOrder.add(i);
//                }
//            }
//        }
//
//        for(int i=1;i<dictionary.size()+1;i++) {
//            char symbol = dictionary.get(i).charAt(0);
//            int sumInt = (int) symbol;
//            for (int j=0;j<keyOrder.size();j++){
//                if(sumInt==keyOrder.get(j)){
//                    String result = dictionaryEnd.get(i);
//                    dictionaryEnd.put(i, result);
//                }
//            }
//        }
//        System.out.println(dictionaryEnd);
    }
}
