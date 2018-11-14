package week9;

import java.io.*;

public class Utils {
        public static void readContentFromFile(String path){
            String line, word;
            try{
                InputStreamReader input = new InputStreamReader(new FileInputStream(path),"UTF8");
                BufferedReader reader = new BufferedReader(input);
                while ((line = reader.readLine())!=null){
                    //word = line.substring(0,line.indexOf("."));
                    word = line.trim();
                    System.out.println(word);
                }
            }
            catch (FileNotFoundException e){
                System.out.println("không thấy file");
            }
            catch (IOException e){
                System.out.println("lỗi");
            }
        }
        public static void writeContentToFile(String word, File path){
            //File file = new File(path);
            //path.delete();
            try(
                    BufferedWriter writer = new BufferedWriter(new FileWriter(path, false));
                    PrintWriter out = new PrintWriter(writer);)
            {
                out.println(word);
            }catch(Exception E){
                System.out.println("false");
            }
        }
        public static void Writer(String word, String path){
            try(
                    BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
                    PrintWriter out = new PrintWriter(writer);)
            {
                out.println(word);
            }catch(IOException e){
                System.out.println("false");
            }
        }
        public static File findFilebyName(String folderPath, String fileName){
            String s = folderPath + fileName;
            File file = new File(s);
            if(!file.exists()) {
                System.out.println("Khong tim duoc file!");
                //return file;
            }
            else System.out.println("Da mo duoc file!");
            return file;

        }
        public static void main(String[] args){
            String File = "src\\test.txt";
            readContentFromFile(File);
            String File2 = "src\\test3.txt";
            String string = "Thêm";
            Writer(string,File2);
            String word = "xóa rồi thêm";
            File file = new File("src\\test2.txt");
            writeContentToFile(word,file);
            System.out.println(findFilebyName("srcff\\","test5.txt"));
        /*Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        Writer(string,File);*/
        }
    }


