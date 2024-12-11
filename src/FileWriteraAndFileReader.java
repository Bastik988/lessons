import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class FileWriteraAndFileReader {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("Fw Test", true);
            fw.write("Fw test!\nand Fr test!");
            fw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        try{
            FileReader fr = new FileReader("Fw Test");
            BufferedReader br = new BufferedReader(fr);
            String map = br.readLine();
            while(map!=null){
                System.out.println(map);
                map = br.readLine();
            }
            br.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
