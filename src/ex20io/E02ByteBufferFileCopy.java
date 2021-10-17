package ex20io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/*
 1byte 씩 읽어서 저장하는 것보다 1kb(1024byte)씩 읽는 버퍼(buffer)를
 이용하므로 복사속도가 훨씬 빨라진다.
 스트림 혹은 네트워크를 통해 파일을 전송할때 버퍼를 사용하는 이유는
 바로 이런 속도차 때문이다.
 */
public class E02ByteBufferFileCopy {

	public static void main(String[] args) {
		
		int copyByte = 0;
	
		try {
			//원본파일을 읽어오기 위한 입력스트림 생성
			InputStream in = new FileInputStream("src/ex20io/apache-tomcat-9.0.54.zip");
			//복사본을 만들기 위한 출력스트림 생성
			OutputStream out = new FileOutputStream	("src/ex20io/apache-tomcat-9.0.54_copy2.zip");		
			//원본에서 1byte를 읽어 저장하기 위한 변수
			int copyByte2 = 0;
			int readLen;
			
			//1kbyte씩 읽어서 저장하기 위한 버퍼 생성(byte형) 배열
			byte buffer[] = new byte[1024];
			
		
			while(true) {
				//1kbyte씩 파일을 읽어서 저장
				readLen = in.read(buffer);
				if(readLen == - 1) {
					break;
				}
				/*
				 읽어온 내용을 파일에 입력한다. 버퍼에 저장된 데이터를
				 인덱스 0의 위치에서 readlen의 크기만큼 전송한다.
				 */
				out.write(buffer, 0 , readLen);
				copyByte2 += readLen;
			}
			
			if( in != null) in.close();
			if( out != null) out.close();
			System.out.println("복사된 파일 크기: "
					+ ""+(copyByte2) + "byte");
			System.out.println("복사된 파일 크기: "
					+ ""+(copyByte2/1024) +  "KByte");
			System.out.println("복사된 파일 크기: "
					+ ""+(copyByte2/(1024*1024)) +  "MByte");
		}
		catch(FileNotFoundException e) {
			System.out.println("파일이 없습니다");
		}
		catch(IOException e) {
			System.out.println("IO작업중 예외가 발생되었습니다.");
		}
		catch(Exception e){
			System.out.println("알 수없는 예외가 발생되었습니다.");
		}
	}
}
