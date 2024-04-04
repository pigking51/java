package ch19_20240404;

import java.io.*;
import java.nio.charset.Charset;

public class FileInputOutput {
    public static void main(String[] args) throws IOException {
        File file = new File(FileObject.CURRENT + "/fileio.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        // 쓰기
        OutputStream os = new FileOutputStream(file);
//        byte[] arrayByte = "Hello world. Let's spring Framework.".getBytes();
        byte[] arrayByte = "안녕하세요.".getBytes(Charset.forName("UTF-8"));
        os.write(arrayByte);
        os.flush();
        os.close();

        // 읽기
        InputStream is = new FileInputStream(file);
//        int data;
        int data = 0;
        // int data = 0; 으로 썼으면 while 조건문에 data만 적으면 됨(= is.read()지워도 된다는말)
        byte[] buffer = new byte[1000];
        String str = "";
//        while((data = is.read(buffer)) != -1){
//            String str = new String(buffer);
//            System.out.println(str);
//        }

//        while(data != -1){
//            data = is.read(buffer);
//            if(data >= 0){
//            str = str + new String(buffer, 0, data,
//                    Charset.forName("UTF-8"));
//            }
//        }

        while((data = is.read(buffer)) != -1){
            str = str + new String(buffer, 0, data,
                    Charset.forName("UTF-8"));
        }

        // Charset.forName("UTF-16")이거는 글자입력 후 getbytes에 하나, 여기에 하나 둘다 써줘야됨
        // → 하나만 쓰면 글자깨짐,
        System.out.println(str);
        is.close();
    }
}
