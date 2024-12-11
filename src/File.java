import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class File {
    public static void main(String[] args) {
        uniun();
        try {
            FileOutputStream fo = new FileOutputStream("NameFile1.txt");
            String map = "String\n";
            byte[] pom = map.getBytes();
            fo.write(pom);
            fo.write(pom);
            fo.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        try {
            FileInputStream fi = new FileInputStream("NameFile.txt");
            StringBuilder map = new StringBuilder();
            int rar;
            rar = fi.read();
            while(rar!=-1){
                map.append((char)rar);
                rar = fi.read();
            }
            System.out.println(map);
            fi.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
//indexOf(); - метод для поиска из StringBuilder
    static void uniun(){
        StringBuilder map = new StringBuilder();
        try {
            FileInputStream fi = new FileInputStream("NameFile.txt");
            int rar;
            rar = fi.read();
            while(rar!=-1){
                map.append((char)rar);
                rar = fi.read();
            }
            System.out.println(map);
            fi.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        try {
            FileInputStream fi = new FileInputStream("NameFile1.txt");
            int rar;
            rar = fi.read();
            while(rar!=-1){
                map.append((char)rar);
                rar = fi.read();
            }
            System.out.println(map);
            fi.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        try{
            FileOutputStream fo = new FileOutputStream("File.txt");
            byte[] rip = map.toString().getBytes();
            fo.write(rip);
            fo.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
