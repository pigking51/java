package ch19_20240404;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream1 {
    public static void main(String[] args) throws IOException {
        // 파일 데이터 입력
        // 1. 파일 대상 설정
        File inFile = new File(FileObject.CURRENT + "/file1.txt");
        if(!inFile.exists()){
            inFile.createNewFile();
        }
        // 2. 대상에 연결되는 String 생성
        InputStream is = new java.io.FileInputStream(inFile);
        // 3. 데이터 읽기
        int data;
        while((data = is.read()) != -1){
            System.out.println("읽은 데이터 : " + (char)data +" | "+
                    "남은 바이트 : " + is.available());
        }
        // 4. Stream 종료
        is.close();
        // close()를 입력 안하면 문제는 없으나(윈도우의 경우) 다른 운영체제에서는
        // 오류 날 가능성 있음(close()를 적는 버릇 가지기!)
    }
}
