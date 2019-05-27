import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Step3 {
    public static void main(String [] args) throws Exception{
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();

        String [] personInfo = {"zhangsan","baidu"};
//        String [] personInfo = {"zhangsan","baidu","1991","18712345678","0203"};
        String loocalpasswd = "/mtmp/localpasswd.txt";
        String savepath="/mtmp/now.txt";


        File t = new File(savepath);
        if(t.exists()){
            return;
        }

        list1 = permutate.allPermutate(personInfo,0,personInfo.length);
        list2 = permutate.getPart(personInfo.length);

        Prepare5.savelistTofile(list1,savepath);

        Prepare5.savelistTofile(list2,savepath);

        Prepare6.localpasswdAddpersoninfo(loocalpasswd,savepath);

        Prepare7.main(savepath);

    }

}
