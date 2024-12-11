import java.util.Scanner;

public class build2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //создание объекта сканера
        System.out.println("Введите вашу строку с размером не более в 100 слов!!!");
        String words = sc.nextLine();//чтение слова с клавиатуры
        String[] map = words.split(" ");
        String[] pom = new String[map.length];
        int m = 0;
        for (int i = (map.length - 1); i >= 0; i--) {
            pom[m] = map[i];
            m++;
        }
        for (String each : pom) System.out.println(each);

        StringBuilder pam = new StringBuilder();

        for (int i = 0; i < pom.length; i++) {
            pam.append(pom[i]);
            if (i != (pom.length - 1)) {
                pam.append(" ");
            }
        }
        System.out.println(pam);

        String[] finish = build2.split(words);
        for (String each: finish) System.out.println(each); // вывод с помощью цикла for each
    }

    public static String[] split(String var) {
        String[] la = new String[100]; //создание массива для хранения слов в строке
        StringBuilder buff = new StringBuilder(); //создание объекта StringBuilder для передачи слов в массив
        int sch = 0; // счётчик
        var+= " "; // ?
        for (int i = 0; i < var.length(); i++) { // создание цикла, где i - индекс каждого символа в строке
            if (var.charAt(i) == ' ') { // осуществление проверки каждого индекса в случае,
                // когда символ равен пробелу
                // var.charAt(i) - обращение через индекс к символу
                la[sch] = String.valueOf(buff); // передача в массив первое слово строки
                // String.valueOf(buff) - преобразование объекта StringBuilder - buff в строковый объект,
                // для того, чтобы положить СТРОКОВОЕ значение в СТРОКОВЫЙ массив
                buff = new StringBuilder(); // обратное преобазование строкового объекта в объект StringBuilder
                sch++; // увелечение счётчика
            } else if (var.charAt(i) != ' ') { // осуществление проверки каждого индекса в случае,
                // когда символ не равен пробелу
                buff.append(var.charAt(i)); // добавление в КОНЕЦ строки символа, НЕ равного пробелу
            }
        }

        String[] finish = new String[sch]; // создание нового массива с раззмером строки

        for(int i=0;i<sch;i++){ // создание цикла для передачи данных с предыдущего массива
            finish[i] = la[i]; // осуществление передачи
        }
//        System.out.println(la[0]);
//        System.out.println(la[1]);
        return finish;
    }
}
