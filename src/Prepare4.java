//排列组合

import java.util.ArrayList;

public class Prepare4 {

    public static void main(String [] args){

        //list
/*        ArrayList arrayList =new ArrayList();
        arrayList.add("xyz");
        arrayList.add("123");
        arrayList.add("789");
        f01("lilei",arrayList);*/

        //String
        String [] sl = new String[] {"xyz","123","789","qwe"};
        String abc =sl[1];
        System.out.print(abc);
//        f02(sl);


    }

//    static int number=3;
//    static String [] t1 = new String [number];




    public static void f01(String s, ArrayList l){
        ArrayList result = new ArrayList();
        String tmp01=s;
        for(int i=0;i<l.size();i++){
            result.add(l.get(i));
            result.add(tmp01+l.get(i));
            s=s+l.get(i);
            result.add(s);
        }
        showlist(result);
    }

    public static void showlist(ArrayList a){
        for(int i=0;i< a.size();i++){
            System.out.println(a.get(i));
        }
    }

    public static void f02(String ... another){
        int n = another.length;
        String result;
        int i;
        int j;
        for( i=1,j=0 ; j<n-1; i++,j++ ){
            result = another[j]+another[i];
            System.out.println(result);
        }
    }

}
