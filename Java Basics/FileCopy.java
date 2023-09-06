import java.io.*;
public class FileCopy {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        /*File ins = new File("Input.txt");
        File outs = new File("Output.txt");
        FileReader fr = new FileReader(ins);
        FileWriter fw = new FileWriter(outs);*/
      
   FileInputStream fr = new FileInputStream("Input.txt");
        FileOutputStream fw = new FileOutputStream("Output.txt");
        int ch,count=0;
        while((ch=fr.read())!=-1){
            fw.write(ch);
            count++;
        }
        System.out.println("Number of Characters: "+count);
        fr.close();
        fw.close();
    }
}/* 
import java.io.*;
public class NoOfWords{
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader ins = new FileReader("Input.txt");
        BufferedReader fr = new BufferedReader(ins);
        String str;
        int count=0;
        while((str=fr.readLine())!=null){
            String words[] = str.split(" ");
            count+=words.length;
        }
        System.out.println("Number of Words: " + count);
    }
}*/