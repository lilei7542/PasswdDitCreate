import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

//文件去重
//哈希 求余 大文件

public class Prepare7 {

    public static File[] splitFile(String targetFile,int splitSize){
        File file = new File(targetFile);
        BufferedReader reader = null;
        PrintWriter[] pws = new PrintWriter[splitSize];
        File[] littleFiles = new File[splitSize];
        String parentPath = file.getParent();
        File tempFolder = new File(parentPath + File.separator + "test");
        if(!tempFolder.exists()){
            tempFolder.mkdir();
        }
        for(int i=0;i<splitSize;i++){
            littleFiles[i] = new File(tempFolder.getAbsolutePath() + File.separator + i + ".txt");
            if(littleFiles[i].exists()){
                littleFiles[i].delete();
            }
            try {
                pws[i] = new PrintWriter(littleFiles[i]);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            while ((tempString = reader.readLine()) != null) {
                tempString = tempString.trim();
                if(tempString != ""){
                    int index = Math.abs(tempString.hashCode() % splitSize);
                    pws[index].println(tempString);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            for(int i=0;i<splitSize;i++){
                if(pws[i] != null){
                    pws[i].close();
                }
            }
        }
        return littleFiles;
    }
    public static void distinct(File[] littleFiles,String distinctFilePath,int splitSize){
        File distinctedFile = new File(distinctFilePath);
        FileReader[] frs = new FileReader[splitSize];
        BufferedReader[] brs = new BufferedReader[splitSize];
        PrintWriter pw = null;
        try {
            if(distinctedFile.exists()){
                distinctedFile.delete();
            }
            distinctedFile.createNewFile();
            pw = new PrintWriter(distinctedFile);
            Set<String> unicSet = new HashSet<String>();
            for(int i=0;i<splitSize;i++){
                if(littleFiles[i].exists()){
                    frs[i] = new FileReader(littleFiles[i]);
                    brs[i] = new BufferedReader(frs[i]);
                    String line = null;
                    while((line = brs[i].readLine())!=null){
                        if(line != ""){
                            unicSet.add(line);
                        }
                    }
                    for(String s:unicSet){
                        pw.println(s);
                    }
                    unicSet.clear();
                    System.gc();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1){
            e1.printStackTrace();
        } finally {
            for(int i=0;i<splitSize;i++){
                try {
                    if(null != brs[i]){
                        brs[i].close();
                    }
                    if(null != frs[i]){
                        frs[i].close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //合并完成之后删除临时小文件
                if(littleFiles[i].exists()){
                    littleFiles[i].delete();
                }
            }
            if(null != pw){
                pw.close();
            }
        }
    }

    public static void main(String filepath) throws IOException {
        int splitSize = 100;
        File[] files = splitFile(filepath,splitSize);
        distinct(files,filepath+"temp",splitSize);

        File myfile=new File(filepath);
        if(myfile.exists()&&myfile.isFile()){
            myfile.delete();
        }

        File myfiletrue=new File(filepath+"temp");
        myfiletrue.renameTo(new File(filepath));
//        myfiletrue.renameTo(myfile);



    }
}

