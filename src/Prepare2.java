//string 处理


import java.util.ArrayList;
import java.util.List;

public class Prepare2 {
    public static void main(String [] args){
//        changeFirstUpString("lilei");
//        changeFirstLowString("LILEI");
//        changeAllUpString("lieli");
//        String r = mixTailString("lilei","abc");
//        System.out.println(r);

//        test("jack","1990","03","28");
//        ArrayList abc =new ArrayList();
//        abc.add("xyz");
//        abc.add("123");
//        abc.add("789");


    }

    public static String changeFirstUpString(String s){
        char c1 = s.charAt(0);
        if(Character.isUpperCase(c1)){
            return s;
        }else {
            char c2 = Character.toUpperCase(c1);
            String s1 = s.substring(1);
            StringBuilder s2 = new StringBuilder();
            String s3 = s2.append(c2).append(s1).toString();
            return s3;
        }
    }
    public static String changeFirstLowString(String s){
        char c1 = s.charAt(0);
        if(Character.isLowerCase(c1)){
            return s;
        }else {
            char c2 = Character.toLowerCase(c1);
            String s1 = s.substring(1);
            return (new StringBuilder()).append(c2).append(s1).toString();
        }
    }

    public static String changeAllUpString(String s){
        return s.toUpperCase();
    }

    public static String changeAllLowString(String s){
        return s.toLowerCase();
    }

    public static String mixHeadString(String str,String localpasswd){
        return str+localpasswd;
    }

    public static String mixTailString(String str,String localpasswd){
        return localpasswd+str;
    }

/*    public static List personInformation(String name, String ... another){
        String tmp1 = name;
        List list = new List();
        for (int i=0;i<another.length;i++){
            name = name+another[i];
            list.add(name);
            tmp1 = tmp1+another[i];
            list.add(tmp1);
        }
        return list;
    }*/

/*    public static void test(String name, String ... another){
        int len = another.length;
    }*/








}
