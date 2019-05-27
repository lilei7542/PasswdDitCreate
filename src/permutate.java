import java.util.ArrayList;
import java.util.List;

public class permutate {
    public static void main(String [] args){
        String [] str ={"A1","B2","C3","D4","E5"};
//        String [] str ={"A","B"};
        allPermutate(str,0,str.length);
//        System.out.println(count);
        getPart(str.length);

    }

    public  static int count=0;
    public  static List<String> arrayList = new ArrayList<String>();
    public  static List<String> temp = new ArrayList<String>();
    public  static List<String> part = new ArrayList<String>();

    public static void swap(String [] str,int i,int j){
        String temp;
        temp=str[i];
        str[i]=str[j];
        str[j]=temp;
    }

    public static List allPermutate(String [] str, int k, int length){
//        char[] chars = new char[length];
        if(k==length-1){
            for(int i=0;i<length;i++){
//               chars[i] = str[i].charAt(0);
//                System.out.print(str[i]);
//                System.out.print(str[i]+" ");
                arrayList.add(str[i]);
            }
//            String a1 = String.valueOf(chars);
//            arrayList.add(a1);
            count++;
        }else{
            for(int i=k;i<length;i++){
                swap(str,k,i);
                allPermutate(str,k+1,length);
                swap(str,k,i);
            }
        }

        for(int h1=0;h1<count;h1++){
            String t1="";
            for(int h2=0;h2<length;h2++){
                t1=arrayList.get(length*h1+h2)+t1;
            }
            temp.add(t1);
        }

        return temp;
    }

    public static List getPart(int length){
        for(int h2=0;h2<count;h2++){
            for(int h3=0;h3<length;h3++){
                String t2="";
                for(int h4=0;h4<length-1;h4++){
                    t2=arrayList.get(length*h2+h4)+t2;
                    part.add(t2);
                }
            }

        }
//        System.out.println(part);

        // list去重
        for  (int i=0;i<part.size()-1;i ++)  {
            for  (int j= part.size()-1;j> i;j--)  {
                if  (part.get(j).equals(part.get(i)))  {
                    part.remove(j);
                }
            }
        }

        return part;

    }


}


