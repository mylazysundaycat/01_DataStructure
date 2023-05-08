import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MainJavaDS08 {
    public static void main(String[] args) throws IOException {
        File file = new File("DS_08_202003978\\src\\input.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br  = new BufferedReader(fr);

        String line = "";
        List<String> alines = new ArrayList<>();

        while((line=br.readLine())!=null) {
            alines.add(line);
        }

        for(String e : alines) {
            String[] splited = e.split(" ");
            LimitedStack<String> ls = new LimitedStack<>(5);
            System.out.println("=====================================");
            for(int i=0; i<splited.length; i++) {
                ls.push(splited[i]);
                ls.printall();
                System.out.println();
            }
            System.out.println("=====================================");
        }

    }

}
