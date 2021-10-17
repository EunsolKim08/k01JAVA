package ex20io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;

public class E08StringWriter {

	public static void main(String[] args) {
	
	try {
		/*
		 문자열을 저장
		하기 위한 출력스트림을 rodrㅇ한다. 
		 문자열의 입력은 버퍼에따라 성능의 차이가 크기 대문에
		 버퍼 필터 스트림을 추가적으로 연결해서 사용한다.
		 */
	
	BufferedWriter out = 
			new BufferedWriter(new FileWriter("src/ex20io/string.txt"));
	
	out.write("나는 KOSMO에서 공부한다.");
	out.newLine();
	out.write("수료후 꼭 취업하겠다");
	
	out.newLine();
	out.close();
	System.out.println("입력완료");
	}
	catch(FileNotFoundException e) {
		System.out.println("파일없음");
	}
	catch(IOException e) {
		System.out.println("IO오류");
	}
	}
}
