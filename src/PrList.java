import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrList {
    String name;
    LocalDateTime dateTime;
    PrList(String name, LocalDateTime dateTime){
        this.dateTime = dateTime;
        this.name = name;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        List<PrList> list = new ArrayList<>();
        while(true) {
            System.out.println("��� ������������ ���� ���������!");
            System.out.println("��� ������ ����� �����:");
            System.out.println("1.  ���������� ������ �������");
            System.out.println("2. �������� ������� ������ �������.");
            System.out.println("3. ����� �������");
            System.out.println("4. �������� �������");
            System.out.println("0. ��������� ������");
            System.out.println("������� ����� ������� ������^^");
            int number = sc.nextInt();
            if(number==1){
                if(list.isEmpty()) {
                    System.out.println("������� �������� �������");
                    String str = sc.nextLine();
                    LocalDateTime dateTime = LocalDateTime.now();
                    String string = dateTime.getDayOfMonth() + "-" + dateTime.getMonth() + "-" + dateTime.getYear()
                            + " " + dateTime.getHour() + ":" + dateTime.getMinute();
                    LocalDateTime result = LocalDateTime.parse(string, formatter);
                    PrList sub = new PrList(str, result);
                    list.add(sub);
                    System.out.println("������� ������� ���������!");
                }
                else{
                    System.out.println("������ ����");
                }
            } if(number==2){
                System.out.println(list);
            } if(number==3){
                System.out.println("������� ���� � ����� �������");
                String string = sc.nextLine();
                LocalDateTime forSeach = LocalDateTime.parse(string, formatter);
                seach(forSeach, list);
            } if(number==4){
                System.out.println("������� �������� �������");
                String forDelete = sc.nextLine();
                deleteSub(forDelete, list);
            } if(number==0){
                break;
            }
        }
    }

    public static void seach(LocalDateTime dateTime1, List list1){
        for(int i=0;i<list1.size();i++){
            //list1.get(i).dateTime==dateTime1
            if(list1.get(i).equals(dateTime1)){
                System.out.println("������� ������� �������!");
                System.out.println(list1.get(i));
                break;
            }
            else {
                System.out.println("������� �� �������:(");
                break;
            }
        }
    }
    public static void deleteSub(String name1, List list1){
        List<PrList> list2 = new ArrayList<>();
        for(int i=0;i<list1.size();i++){
            //list1.get(i).name==name1
            if(list1.get(i).equals(name1)){
                for(int k=0;k<list1.size();k++){
                    if(k!=i){
//                        list2.add(list1.get(k));
                    }
                    else if(k==i){
                        k++;
                    }
                }
                System.out.println("������� �������!");
                System.out.println(list2);
                break;
            }
            else {
                System.out.println("������� �� �������:(");
                break;
            }
        }
    }
}
