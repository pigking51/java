package ch19_20240404;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileObject {


    public static final String CURRENT =
            "C:\\Users\\DW\\Documents\\GitHub\\java\\StudyJava\\temp"; // 본인 경로

    public static void main(String[] args) {
        String currentPath = System.getProperty("user.dir");
        System.out.println(currentPath);

        File tempDir = new File("C:\\Users\\DW\\Documents\\GitHub\\java\\StudyJava\\temp");
        // → 역슬래시 2개 있는거는 일반 슬래시 한개로 써도 상관없음
        if(tempDir.exists()){
            System.out.println("폴더가 이미 존재합니다.");
        }else{
            System.out.println("폴더를 생성합니다.");
            tempDir.mkdir();
            // → make directory
        }

        // 파일 생성
        File newFile = new File(CURRENT+ "/newFile.txt");
        if(!newFile.exists()){
            try{
            newFile.createNewFile();
            // → 예외처리 해줘야되는 오류 뜸                
            }catch (IOException e){
                System.out.println("IOException 예외");
            }
        }else{
            System.out.println("이미 파일이 존재합니다.");
        }

        // File 객체가 가리키는 대상(폴더 또는 파일)의 절대경로 확인
        System.out.println("절대경로 위치 : " + newFile.getAbsoluteFile());
//        System.out.println("newFile = " + newFile);
    }
}
