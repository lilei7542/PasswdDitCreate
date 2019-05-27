import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Prepare5 {
    public static void main(String [] args) throws Exception{

    }

    public static void addfilemethod(String file, String conent) {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(file, true)));
            out.write(conent+"\r\n");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void savelistTofile (List<String>list,String listsavepath) throws Exception{

        for(int i=0;i<list.size();i++){
            String t1= list.get(i);
            addfilemethod(listsavepath,t1);
            addfilemethod(listsavepath,Prepare2.changeFirstUpString(t1));
            addfilemethod(listsavepath,Prepare2.changeFirstLowString(t1));
            addfilemethod(listsavepath,Prepare2.changeAllUpString(t1));
            addfilemethod(listsavepath,Prepare2.changeAllLowString(t1));

        }

    }

}
