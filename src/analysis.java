import javax.imageio.stream.FileImageOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class analysis {
    static String[] wordsKey = new String[5];
    static String pim;
    public static void main(String[] args) {
        ArrayList<String> rar = new ArrayList<>();
        try {
            FileOutputStream fo = new FileOutputStream("Tatiana Polyakova.txt");
            String text = "Tatyana Polyakova was born on September 14, 1959 in Vladimir. \n" +
                    "She began publishing adventure novels in 1997. I was not comfortable \n" +
                    "with technology; I wrote down made-up stories in notebooks.";
            byte[] map = text.getBytes();
            fo.write(map);
            fo.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        readFile();
    }

    static void readFile(){
        wordsKey[0] = "Tatyana";
        wordsKey[1] = "Polyakova";
        wordsKey[2] = "adventure";
        wordsKey[3] = "was";
        wordsKey[4] = "9";
        pim = null;
        StringBuilder result = new StringBuilder();
        try{
            FileInputStream fi = new FileInputStream("Tatiana Polyakova.txt");
            StringBuilder pom = new StringBuilder();
            int reading = fi.read();
            while(reading!=-1){
                pom.append((char)reading);
                reading = fi.read();
            }
            System.out.println(pom);
            for(int k=0;k<wordsKey.length;k++){
                int index = pom.indexOf(wordsKey[k], 0);
                if(index!=-1){
                    result.append(wordsKey[k] + "\n");
                }
            }
            fi.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        try{
            FileOutputStream fo2 = new FileOutputStream("New Tatiana Polyakova.txt");
            String rar = result.toString();
            byte[] resBytes = rar.getBytes();
            fo2.write(resBytes);
            fo2.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
