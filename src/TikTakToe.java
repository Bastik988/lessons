import java.util.Scanner;
public class TikTakToe {
    public static void main(String[] args) {
        while (true){
            Game pam = new Game();
            System.out.println("Кто ходит первый? Если кресик, то введите 1. Если нолик, то введите 2");
            int rar = new Scanner(System.in).nextInt();
            char win = ' ';
            if(rar==2) {
                pam.player = 'O';
            }
            for(int i=0;i<9;i++){
                pam.Draw();
                pam.input(pam.player);
                if(pam.player=='X'){
                    pam.player = 'O';
                }
                else{
                    pam.player = 'X';
                }
                win = pam.winner();
                if(win!=' '){
                    pam.Draw();
                    System.out.println("Победил: " + win);
                    System.out.println("Хотите перезапустить игру? Если да, то введите 1. Если нет, то 2");
                    int number = new Scanner(System.in).nextInt();
                    if (number==2){
                        return;
                    }
                    break;
                }
            }
            if(win==' '){
                System.out.println("Ничья!");
            }
        }
    }
}

class Game{
    char player = 'X';
    int pole = 3;
    char[][] map = new char[pole][pole];
    public void Draw(){
        for(int i=1;i<=pole;i++){
            System.out.print(" | "+i);
        }

        System.out.println();

        for(int i=0;i<pole;i++){
            System.out.println("-------------");
            System.out.print(i+1);
            for(int j=0;j<pole;j++){
                System.out.print("| " + map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void input(char mop){
        while (true){
            System.out.println("Введите координату поля через пробел");
            String graphics = new Scanner(System.in).nextLine();
            int Y = graphics.charAt(0)-'0';
            int X = graphics.charAt(2)-'0';
            if(Y<1||Y>3||X<1||X>3){
                while(Y<1||Y>3||X<1||X>3){
                    System.out.println("Вы неправильно ввели координату, попробуйте ещё раз!");
                    String num = new Scanner(System.in).nextLine();
                    Y = num.charAt(0)-'0';
                    X = num.charAt(2)-'0';
                    if(Y>=1&&Y<=3&&X>=1&&X<=3){
                        if(map[X-1][Y-1]=='\0'){
                            map[X-1][Y-1] = mop;
                            break;
                        }
                        else{
                            System.out.println("Эта клетка уже заполнена, введите координаты ещё раз!");
                        }
                    }
                }
                break;
            }
            else{
                if(map[X-1][Y-1]=='\0'){
                    map[X-1][Y-1] = mop;
                    break;
                }
                else{
                    System.out.println("Эта клетка уже заполнена, введите координаты ещё раз!");
                }
            }
        }
    }

    public char winner(){
        for(int i=0;i<3;i++){
            if(map[i][0]==map[i][1]&&map[i][2]==map[i][0]&&map[i][0]!='\0'){
                return map[i][0];
            }
        }
        for(int i=0;i<3;i++){
            if(map[0][i]==map[1][i]&&map[2][i]==map[0][i]&&map[0][i]!='\0'){
                return map[0][i];
            }
        }
        if(map[0][0]==map[1][1]&&map[2][2]==map[0][0]&&map[0][0]!='\0') return map[1][1];
        if(map[0][2]==map[1][1]&&map[2][0]==map[0][2]&&map[0][2]!='\0') return map[1][1];
        return ' ';
    }
}
