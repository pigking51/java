package ch19_20240404;

import java.io.*;

public class BufferedIOStream {
    public static void main(String[] args) throws IOException {
        File orgFile = new File(FileObject.CURRENT + "/mycat_origin.jpg");
        File copyFile = new File(FileObject.CURRENT + "/mycat_copy.jpg");

        InputStream is = new FileInputStream(orgFile);
        OutputStream os = new FileOutputStream(copyFile);
        // 기존의 방법은 1바이트씩 쓰고 읽기 때문에 속도가 느림
        // 1 바이트마다 read/write하지 않고 버퍼에 모았다가 한번에 하면 속도를 높일 수 있음
        // BufferedInputStream과 BufferedOutputStream을 같이 사용함
        BufferedInputStream bis = new BufferedInputStream(is);
        OutputStream bos = new BufferedOutputStream(os);

        int data;
        // BufferedString은 사용하려면 is, os 대신에 bis, bos를 사용
        while((data = bis.read()) != -1){
            bos.write(data);
        }
        bis.close();
        bos.flush();
        bos.close();
    }
}
