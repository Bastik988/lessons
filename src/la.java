import java.util.Scanner;
public class la {
    static int i = 0;
    static int c = 5;
    static int[] map = new int[c];
    public static void main(String[] args) {
        Scanner pim = new Scanner(System.in);
        System.out.println("Введите пять чисел");
        System.out.println("Когда захотите закончить ввод, то введите 0. Для того, чтобы начать введите 1");
        int number = pim.nextInt();
        while (number==1){
            System.out.println("Число под номером " + (i+1) + ":");
            int numbers = pim.nextInt();
            if (numbers==0){
                break;
            }
            map[i] = numbers;
            i++;
        }

        System.out.println("Какой элемент вы хотите вывести?");
        la.met(pim.nextInt());
    }

    public static void met(int index){
        try{
            if(index>=i) throw new Exception();
            System.out.println(map[index]);
        } catch (Exception e){
            System.out.println("Вы обратились к несуществующему элементу");
        }
    }
}