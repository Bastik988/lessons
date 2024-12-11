import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class gessNumber {
    public static void main(String[] args) {
        ArrayList<String> pam = new ArrayList<>();
        pam.add("Яблоко");
        pam.add("Магазин");
        pam.add("Колледж");
        Random run = new Random();
        int counter = 0;
        while (true) {
            String slow = pam.get(run.nextInt(0, pam.size()));
            StringBuilder map = new StringBuilder();
            map.append("*".repeat(slow.length()));
            map.setCharAt(0, slow.charAt(0));
            Scanner scan = new Scanner(System.in);
            boolean isChange = false;
            for (int i = 0; i < 5; i++) {
                System.out.println(map);
                System.out.println("Вводите буквы");
                String firstSym = scan.nextLine();

                // 1 способ
//                char firstSymbol = firstSym.toLowerCase().charAt(0);
//                for(int k=0;k<slow.length();k++){
//                    if(firstSymbol==slow.charAt(k)){
//                        map.setCharAt(k, slow.charAt(k));
//                        isChange = true;
//                    }
//                }
//                if(!isChange){
//                    System.out.println("Буквы не найдены!");
//                }

                // 2 способ
                char firstSymbol = firstSym.toUpperCase().charAt(0);
                for (int l = 0; l < slow.length(); l++) {
                    if (firstSymbol == slow.toUpperCase().charAt(l)) {
                        map.setCharAt(l, slow.charAt(l));
                        isChange = true;
                    }
                }
//                    firstSymbol = firstSym.toLowerCase().charAt(0);
//                        for (int l=0;l<slow.length();l++){
//                            if(firstSymbol==slow.charAt(l)){
//                                map.setCharAt(l, slow.charAt(l));
//                                isChange = true;
//
                if (!isChange) System.out.println("Буквы не найдены!");
            }
            System.out.println("Введите окончательное слово");
            // дополнительное задание (от самой же себя)
            String Equals = scan.nextLine();
            String finish = Equals.toUpperCase();
            String Equals2 = slow.toUpperCase();
            if (finish.equals(Equals2)) {
                System.out.println("Вы победили!");
            } else {
                System.out.println("Вы проиграли:(");
            }
        }
    }
}