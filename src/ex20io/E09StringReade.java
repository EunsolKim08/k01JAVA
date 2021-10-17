package ex20io;

import java.io.BufferedReader;
import java.io.FileReader;

public class E09StringReade {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader
					(new FileReader("src/ex20io/string.txt"));
		
		String str;
		while(true) {
			str=in.readLine();
			if(str == null) {
				break;
				/*
				 입력시 newlin을 통해 개행정보고 입력되되지만,
				 닝들 문자열에너는 개방정보고 포함되지 앟는다.
				 */
			}
			System.out.println(str);
		}
			in.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
