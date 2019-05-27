import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;


public class Step1 {
    public static void main(String [] args) throws Exception{
        start1("lilei","1993","05","17");
//        start1("lilei");
//        start1("lilei","1993");
//        start1("lilei","1993","05");
    }

    //step 1
    public static void start1(String name ,String ... b ) throws Exception{

        String tmp1=name;

        File file = new File("/mtmp/a1.txt");
        file.createNewFile();

        PrintWriter out = new PrintWriter(new FileWriter("/mtmp/a1.txt"));

        out.println(name);

        for (int i=0;i<b.length;i++){
            name = name+b[i];
//            System.out.println(name);
            out.println(name);
        }

        for (int i=0;i<b.length;i++){
            tmp1 = b[i]+tmp1;
//            System.out.println(tmp1);
            out.println(tmp1);
        }
        out.close();
    }



}