import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prepare1 {

    public static void main(String [] args) throws Exception{
//        p11();
//        p12("/mtmp/z7.txt","/mtmp/z8.txt");
        p13();
//        p14();

    }

    public static void p11() throws Exception{
        String line;
        BufferedReader in = new BufferedReader(new FileReader("/mtmp/z1.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("/mtmp/z2.txt"));
        while ((line=in.readLine())!=null){
            out.println(line.replace("[","").replace("]","").replace("/","").replace(" ",""));
        }
        out.close();
        in.close();
    }

    //去重
    public static void p12(String s,String d) throws Exception{
        String line;
        BufferedReader in = new BufferedReader(new FileReader(s));
        PrintWriter out = new PrintWriter(new FileWriter(d));
        List<String> list = new ArrayList();

        while ((line=in.readLine())!=null){
            if(!list.contains(line)){
                list.add(line);
            }
        }
        for(int i = 0;i<list.size();i++){
            out.println(list.get(i).toString());
        }
        out.close();
        in.close();
    }

    //get the final universal dict  z9.txt
    public static void p13() throws Exception{
        String line;
        BufferedReader in = new BufferedReader(new FileReader("/mtmp/z5.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("/mtmp/z12.txt"));

        while ((line=in.readLine())!=null){
            if((line.indexOf("admin"))!=-1){
//                out.println(line.replace("admin",""));
                out.println(line);
            }else if((line.indexOf("root"))!=-1){
//                out.println(line.replace("root",""));
                out.println(line);
            }else if((line.indexOf("superman"))!=-1) {
//                out.println(line.replace("superman",""));
                out.println(line);
            }else if((line.indexOf("test"))!=-1) {
//                out.println(line.replace("test",""));
                out.println(line);
            }else if((line.indexOf("user"))!=-1) {
//                out.println(line.replace("user",""));
                out.println(line);
            }else if((line.indexOf("linux"))!=-1) {
//                out.println(line.replace("linux",""));
                out.println(line);
            }else if((line.indexOf("oracle"))!=-1) {
//                out.println(line.replace("oracle",""));
                out.println(line);
            }/*else{
                out.println(line);
            }*/
        }

        out.close();
        in.close();
    }


    //mix 1
    public static void p14() throws Exception{
        String line;
        BufferedReader in = new BufferedReader(new FileReader("/mtmp/z9.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("/mtmp/z10.txt"));

        while ((line=in.readLine())!=null){
            out.println(line+"lilei");
            out.println("lilei"+line);
        }

        out.close();
        in.close();
    }




}
