import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Step2 {
    public static void main (String[] args) throws Exception{

//        String savepath="/mtmp/now.txt";
//        String savepath="/mtmp/RIGHTnow.txt";

//        Prepare7.main(savepath);



    }
    public static void Begin() throws Exception{
        String name="jack";
        String year="1990";
        String month="03";
        String date="29";

        String line;
        BufferedReader in = new BufferedReader(new FileReader("/mtmp/zzzzzz.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("/mtmp/zzz_result.txt"));

        while ((line=in.readLine())!=null){
            out.println(line);

        }


    }
}
