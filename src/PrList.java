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
            System.out.println("Вас приветствует наша программа!");
            System.out.println("Вот список наших опций:");
            System.out.println("1.  Добавление нового события");
            System.out.println("2. Просмотр полного списка событий.");
            System.out.println("3. Поиск событий");
            System.out.println("4. Удаление события");
            System.out.println("0. Окончание работы");
            System.out.println("Введите цифру нужного пункта^^");
            int number = sc.nextInt();
            if(number==1){
                if(list.isEmpty()) {
                    System.out.println("Введите название события");
                    String str = sc.nextLine();
                    LocalDateTime dateTime = LocalDateTime.now();
                    String string = dateTime.getDayOfMonth() + "-" + dateTime.getMonth() + "-" + dateTime.getYear()
                            + " " + dateTime.getHour() + ":" + dateTime.getMinute();
                    LocalDateTime result = LocalDateTime.parse(string, formatter);
                    PrList sub = new PrList(str, result);
                    list.add(sub);
                    System.out.println("Событие успешно добавлено!");
                }
                else{
                    System.out.println("Список пуст");
                }
            } if(number==2){
                System.out.println(list);
            } if(number==3){
                System.out.println("Введите дату и время события");
                String string = sc.nextLine();
                LocalDateTime forSeach = LocalDateTime.parse(string, formatter);
                seach(forSeach, list);
            } if(number==4){
                System.out.println("Введите название события");
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
                System.out.println("Событие успешно найдено!");
                System.out.println(list1.get(i));
                break;
            }
            else {
                System.out.println("Событие не найдено:(");
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
                System.out.println("Событие удалено!");
                System.out.println(list2);
                break;
            }
            else {
                System.out.println("Событие не найдено:(");
                break;
            }
        }
    }
}
