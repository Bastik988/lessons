import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;
public class ProgrammsLogger {
    static String nameFile;
    static int a = 1;
    static Logger[] messages = new Logger[a];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name to create the file"); // Введите имя для создания файла
        nameFile = scan.nextLine();
//        Logger.writerMessages("Hi, how a you? ");
//        Logger.writerMessages("340 Hi, how a you? ");
//        Logger.writerMessages("Hi, how a you? ");
//        Logger.writerMessages("Hi, how a you? ");
//        Logger.readMessages();
//        Logger.readMessagesId(2);
//        Logger.deleteMessagesId(2);
//        Logger.readMessages();
        String messagesText = null;
        while (true) {
            System.out.println("What will you do next?"); //Что будете делать дальше?
            System.out.println("1. Add a message"); //1. Добавить сообщение
            System.out.println("2. Delete message"); //2. Удалить сообщение
            System.out.println("3. View file contents"); //3. Просмотреть содержимое файла
            System.out.println("4. Finish working with the file"); //4. Завершить работу с файлом
            System.out.println("Enter the number of the selected item"); //Введите цифру выбранного пункта
            int numberMenu = scan.nextInt();
            if (numberMenu == 1) {
                while (true) {
                    Scanner scn = new Scanner(System.in);
                    System.out.println("Write what message you want to add"); // Напишите, какое
                    // сообщение хотите добавить
                    messagesText = scn.nextLine();
                    Logger.writerMessages(messagesText);
                    System.out.println("Message added successfully!"); //Сообщение успешно добавлено!
                    System.out.println("Here is the number of this message: "); // Вот номер этого сообщения:
                    System.out.println("Do you want to continue adding posts?"); //Вы хотите продолжить добавлять сообщения?
                    System.out.println("If yes, then enter 1"); // Если да, то введите 1
                    System.out.println("If not, enter 2"); //Если нет, то введите 2
                    int num = scn.nextInt();
                    if (num != 1) {
                        break;
                    }
                }
            }
            else if (numberMenu == 2) {
                if(messagesText!=null){
                    while (true){
                        Scanner scn = new Scanner(System.in);
                        Logger.readMessages();
                        System.out.println("Enter the number of the message you want to delete"); //Введите
                        // номер сообщения, которого хотите удалить
                        int deleteNum = scn.nextInt();
                        Logger.readMessagesId(deleteNum);
                        Logger.deleteMessagesId(deleteNum);
                        System.out.println("Message successfully deleted!"); //Сообщение успешно удалено!
                        Logger.readMessages();
                        System.out.println("Do you want to continue deleting messages?");
                        //Хотите продолжить удалять сообщения?
                        System.out.println("If yes, then enter 1"); // Если да, то введите 1
                        System.out.println("If not, enter 2"); //Если нет, то введите 2
                        int num = scn.nextInt();
                        if (num != 1) {
                            break;
                        }
                    }
                }
                else {
                    System.out.println("There is nothing in the file yet! First add messages inside it");
                    //В файле ничего нет. Сначала добавьте сообщения в файл
                }
                }
                else if (numberMenu == 3) {
                if(messagesText!=null) {
                    Logger.readMessages();
                }
                else{
                    System.out.println("The file is empty! First add messages to the file");
                    //Файл пустой! Сначала добавьте сообщения в файл
                }
            }
                else if (numberMenu == 4) {
                    break;
                }
            }
        }
    }

class Logger{
    static ArrayList<String> newList = new ArrayList<>();
    static int id;
    static int c = 1;
    Logger(int id){
        this.id = id;
    }
    public static void writerMessages(String messagesText){
            try {
                FileWriter fw = new FileWriter(ProgrammsLogger.nameFile, true);
                fw.write(String.valueOf(c)+messagesText+"\n");
                c++;
                fw.close();
            } catch (IOException e){
                e.printStackTrace();
            }
    }
    public static void readMessages(){
        try {
            FileReader fr = new FileReader(ProgrammsLogger.nameFile);
            BufferedReader br = new BufferedReader(fr);
            String tmp = br.readLine();
            while(tmp!=null){
                //newList.add(tmp);
                System.out.println(tmp);
                tmp = br.readLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void readMessagesId(int id) {
        try {
            FileReader fr = new FileReader(ProgrammsLogger.nameFile);
            BufferedReader br = new BufferedReader(fr);
            String tmp = br.readLine();
            while (tmp != null) {
                newList.add(tmp);
                tmp = br.readLine();
            }
            for(int i=0;i<newList.size();i++){
                if(i==id-1){
                    System.out.println(newList.get(i));
                }
            }
            newList.clear();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void deleteMessagesId(int id) {
        try {
            FileReader fr = new FileReader(ProgrammsLogger.nameFile);
            BufferedReader br = new BufferedReader(fr);
            String tmp = br.readLine();
            while (tmp != null) {
                newList.add(tmp);
                tmp = br.readLine();
            }
            for(int i=0;i<newList.size();i++){
                if(i==id-1){
                    newList.remove(i);
                }
            }
            FileWriter fw = new FileWriter(ProgrammsLogger.nameFile);
            for(String i: newList){
                fw.write(i+"\n");
            }
            newList.clear();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}