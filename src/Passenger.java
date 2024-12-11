import java.util.Scanner;
import java.util.Random;
public class Passenger {
    String name;
    String surname;
    int id;

    Passenger(String name, String surname, int id){
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    public static void main(String[] args) {
        AirlineService nps = new AirlineService();
//        AirlineService nap = new AirlineService();
////        nap.add("Петя", "Петров");
////        nap.add("Петя", "Петров");
////        nap.add("Петя", "Петров");
        String hello = "Здравствуйте! Вас приветствует наша компания авиасейл! Что вас интересует?";
        String var = "Варианты ответа: 1. Купить билет; 2. Поиск своего билета; " +
                "3. Вывод информации о пассажирах";
        String pri = "Введите номер, нужного вам запроса";
        while (true) {
            System.out.println(hello);
            System.out.println(var);
            System.out.println(pri);
            System.out.println("Нажмите для выхода 0");
            Scanner number = new Scanner(System.in);
            int numbers = -1;
            try {
                numbers = number.nextInt();
            } catch (Exception e){
                System.out.println("Не правильный ввод");
            }
            if (numbers == 1) {
                System.out.println("Вы выбрали купить билет!");
                Scanner pim = new Scanner(System.in);
                System.out.println("Как вас зовут?");
                String name = pim.nextLine();
                Scanner pom = new Scanner(System.in);
                System.out.println("Введите вашу фамилию");
                String surname = pom.nextLine();
                nps.add(name, surname);
                System.out.println("Билет успешно создан");
            }

            else if (numbers == 2) {
                System.out.println("Введите Ваш id билета");
                int rum = number.nextInt();
                try {
                    nps.poisk(rum);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            else if (numbers == 3) {
                System.out.println("Введите Ваш id билета");
                int rum = number.nextInt();
                try {
                    nps.info(rum);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            else if(numbers==0){
                return;
            }
        }
    }
        }


class AirlineService{
    Passenger[] map = new Passenger[2];
    int c = 1;

    public void add(String name, String surname){
        Random rand = new Random();
        //int run = rand.nextInt((c-1)*500, c*500);
        int run = (int)(Math.random()*((c*500-(c-1)*500)+1)+(c-1)*500);
        if(map.length==c-1){
            Passenger[] mop = new Passenger[map.length*2];
            for (int i=0;i<map.length;i++){
                mop[i] = map[i];
            }
            map = mop;
        }
        System.out.println("Ваш id: " + run);
        map[c-1] = new Passenger(name, surname, run);
        c++;
//        Scanner sr = new Scanner(System.in);
//        System.out.println("Вы хотите купить билет? Если да, то введите 1; Если нет, то введите 2");
//        int num = sr.nextInt();
//        if (num==1){
//            Scanner rar = new Scanner(System.in);
//            System.out.println("Введите количество билетов, которое вам необходимо");
//            int mum = rar.nextInt();
//            int i;
//            for(i=0;i<mum;i++)
//                Scanner pum = new Scanner(System.in);
//                System.out.println("Введите Ваше имя для регистрации билета под номером " + i);
//                String wordName = pum.nextLine();
//                System.out.println("Введите Вашу фамилию для регистрации билета под номером " + i);
//                String wordSurname = pum.nextLine();
//                map[i] = run;
//                sac++;
//                c++;
//            System.out.println("Ваш id - " + c);
//        }
//
//        else{
//            System.out.println("На нет и суда нет:(");
//        }
//
//        return sac;
//        return c;
    }

    public void poisk(int id) throws Exception {
        boolean a = true;
        for(int i=0;i<c-1;i++){
            if(id==map[i].id){
                a = false;
                System.out.println("Вот ваш билет " + map[i]);
                //return;
            }
        }
        if(a){
            throw new Exception("Такого id нет в системе");
        }
    }

    public void info(int id) throws Exception {
        boolean a = true;
        for(int i=0;i<c-1;i++){
            if(id==map[i].id){
                a = false;
                System.out.println("Вот ваши данные " + map[i]);
                //return;
            }
        }
        if(a){
            throw new Exception("Такого id нет в системе");
        }
    }
}
