import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Prepare6 {
    public static void main(String [] args) throws Exception{
        localpasswdAddpersoninfo("/mtmp/a1.txt","/mtmp/a2.txt");

    }

    public static int getfilelinenumber(String filepath) throws Exception{
        FileReader filepathin = new FileReader(filepath);
        LineNumberReader lineNumberReader = new LineNumberReader(filepathin);
        lineNumberReader.skip(Long.MAX_VALUE);
        int n=lineNumberReader.getLineNumber();
        lineNumberReader.close();
        return n;
    }



    public static void localpasswdAddpersoninfo(String localpathfile,String savepathfile) throws Exception{

        int b =getfilelinenumber(localpathfile);
        int c =getfilelinenumber(savepathfile);



        BufferedReader in1 = new BufferedReader(new FileReader(localpathfile));
        BufferedReader in2 = new BufferedReader(new FileReader(savepathfile));

        String line1;
        String line2;
        int a=0;


        List<String> list=new ArrayList<String>();
        while ((line2=in2.readLine())!=null){
            list.add(line2);
        }


        for(int i=0;i<b;i++){
            line1=in1.readLine();
            for(int j=0;j<c-1;j++){
                Prepare5.addfilemethod(savepathfile,line1+list.get(j));
                Prepare5.addfilemethod(savepathfile,list.get(j)+line1);
            }
        }


//        while ((line1=in1.readLine())!=null){
//            while (((line2=in2.readLine())!=null)&&(a<b)){
//                Prepare5.addfilemethod(savepathfile,line1+line2);
//                a++;
//            }
//
//        }


        in2.close();
        in1.close();



    }

}
