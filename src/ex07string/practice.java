package ex07string;

import java.util.Scanner;

public class practice
{
	 public static void main(String[] args)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("아이디를 입력하세요: ");
			String id = scanner.nextLine();
			boolean isOk = idValidate(id);
			if(isOk == true)
				System.out.println("사용가능한 아이디입니다: ");
			else
				System.out.println("사용할 수 없습니다.");
		}
		
		 
		 public static boolean idValidate(String inputId){
		 	//아이디 유효성 검증 확인용 변수;
		 	boolean idOk = true;
		 	
		 	//아이디의 길이 확인(8자~12자)
		 	if(inputId.length()>=8 && inputId.length()<=12){
		 		//영문, 숫자 조합인지 확인
		 		for(int i= 0; i<inputId.length();i++) {
		 			char idChr = inputId.charAt(i);
		 			if(!(idChr>= '0' && idChr<='9' || idChr >='a' && idChr <='z'|| idChr >= 'A' && idChr<='Z')){
		 			 //아이디가 영문 +숫자 조합이 아니라면 false로 처리한다.
		 			 idOk = false;
		 			  break;
					}
				}
		 	}
		 	else{
		 	//아이디의 길이가 잘못되었을 때
		 	  idOk = false;
		 	
		 	}
		
		 	return idOk;
		 }
}

