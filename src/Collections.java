import java.util.*;
import java.util.LinkedList;

public class Collections {
    public static void main(String[] args) {
        //interface List
        //interface Set
        //interface Queue
        List <String> str = new ArrayList<>();
        List <String> str1 = new LinkedList<>();
        Collection<String> str2 = new ArrayList<>();
        Set<String> str3 = new HashSet<>();
        Set<String> str4 = new LinkedHashSet<>();
        Set<String> str5 = new TreeSet<>();
        Deque<String> string = new ArrayDeque<>();
        Queue<String> string1 = new LinkedList<>();
        string.add("1");
        string.add("2");
        string.add("3");
        System.out.println(string.poll());
        System.out.println(string.peek());
        //string.remove(); ����������� ����������, ���� ������ ����
        //string.element(); �������, ����� ������ ������� � ����������� ����������, ���� ������ ����
        System.out.println(string);
        string.addLast("4");
        string.addFirst("0");
        System.out.println(string);

        str3.add("������");
        str3.add("������");
        str3.add("�����");
        str3.add("�����");
        str3.add("������");
        str3.add("������");

        str4.add("������");
        str4.add("������");
        str4.add("�����");
        str4.add("�����");
        str4.add("������");
        str4.add("������");

        str5.add("������");
        str5.add("������");
        str5.add("�����");
        str5.add("�����");
        str5.add("������");
        str5.add("������");
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        deleteDublicate();
    }
    public static void deleteDublicate(){
        List<String> str = new ArrayList<>();
        str.add("�");
        str.add("�");
        str.add("b");
        str.add("b");
        Set<String> strNew = new LinkedHashSet<>(str);
        str = new ArrayList<>(strNew);
        System.out.println(str);
    }
}
