//文本处理
//10M以下的文件可以去重
import java.util.ArrayList;
import java.util.List;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Prepare3 {
    public static void main(String [] args) throws Exception{
    }

    public static void repeatRemove(String filename) throws Exception{

        FileReader fileReader = new FileReader(new File(filename));
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Map<String, String> map = new HashMap<String, String>();
        String readLine = null;

        int i = 0;

        try{
            while ((readLine = bufferedReader.readLine())!=null) {
                if (!map.containsValue(readLine)) {
                    map.put("key" + i, readLine);
                    i++;
                }
            }
            bufferedReader.close();
            fileReader.close();


            File file=new File(filename+"temp");
            if(!file.exists()){
                file.createNewFile();
            }

            PrintWriter out = new PrintWriter(filename+"temp");

            for (int j = 0; j < map.size(); j++) {
                out.println(map.get("key" + j));
            }

            out.close();



        }catch (IOException e){
            e.printStackTrace();
        }

    }



}
