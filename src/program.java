import java.util.Scanner;

public class program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //создание объекта сканера
        System.out.println("Введите слово для подсчёта");
        String word = sc.nextLine();//чтение слова с клавиатуры
        int m = word.length();
        int i = 0;
        char top;
        int glass = 0;
        int sogl = 0;
        for(;i<m;i++){
            top = word.charAt(i);
            if (top=='a'||top=='e' || top=='i' || top=='o' || top=='u' || top=='y'){
                glass++;
            }

            else{
                sogl++;
            }
        }

        System.out.println("В вашем слове: " + word + " гласных букв: " + glass);
        System.out.println("В вашем слове: " + word + " согласных букв: " + sogl);

    }
}