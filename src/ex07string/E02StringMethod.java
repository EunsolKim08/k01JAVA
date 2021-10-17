package ex07string;

public class E02StringMethod
{

	public static void main(String[] args)
	{
		System.out.println("String클래스의 주요 메소드");
		
		String str1 = "Welcome to java"; 
		String str2 = "자바야 놀자"; 
		
		/*
		 1]length() //문자열의 길이를 반환한다.
		 			 자바길이에 공백도포함
		 */
		System.out.println("str1의 길이: " + str1.length());
		System.out.println("str2의 길이: " + str2.length());
		
		/*
		 2]chartAt(인덱스) // 문자열에서 특정 index에 해당하는 문자
		 하나를 반환한다. index는 배열과 같이 0부터 시작한다.
		 */
		System.out.println("str1의 두번째 문자: "
				+str1.charAt(1));
		System.out.println("str2의 두번째 문자: "
				+str2.charAt(1));
		
		/*
		 시나리오] 주민등록번호를 이용하여 성별을 판별하는
		 프로그램을 작성하시오.
		 190000 - 3 =>남자
		 190000- 4 =>여자
		 */
		String juminNum = "190419-524598";
		if(juminNum.charAt(7) == '1' || juminNum.charAt(7) == '3'){
			System.out.println("남자입니다");
		}
		else if(juminNum.charAt(7)== '2' || juminNum.charAt(7) == '4') {
			System.out.println("여자입니다");
		}
		else if(juminNum.charAt(7)== '5') {
			System.out.println("외국인입니다");
		}
		else {
			System.out.println("주민번호가 잘못되엇습니다.");
		}
		/*
		 3] compareTo()
		 : 두 문자열의 첫번째 문자부터 순차적으로 비교하면서
		 앞 문자열의 아스키코드가 크면 양수를 반환하고
		 뒷 문자열의 아스키코드가 크면 음수를 반환한다.
		 두 문자열이 같을 때 0을 반환한다.
		 */
		String str3 = "A";
		String str4 = "B";
		System.out.println(str3.compareTo(str4)); // -1
		System.out.println(str4.compareTo(str3)); // 1
		System.out.println("ABC".compareTo("ABC")==0 ? 
				"문자열이같다" : "문자열이다르다");
		/*
		 4] concat() 
		 : 두개의 문자열을 연결할때 사용한다. +와 동일한 역할을 한다.
		 */
		System.out.println("JAVA ".concat("WORLD ").concat("Go"));
		System.out.println("JVAVA"+" WORLD " +"GO");
		
		/*
		 5]contains()
		 : 문자열에 특정 문자열이 포함되어 있는지를 판단하여
		 포함되어 있을때 true를 반환한다.
		 */
		System.out.println(str1.contains("To"));
		System.out.println(str1.contains("to"));
		/*
		 시나리오] 해당 문자열이 이메일 형식인지 검사하는
		 프로그램을 작성하시오.
		 hong@iksomo.co.kr =>이메일 형식임
		 not@naver =>이메일 형식이 아님
		 */
		String email1 = "hong@iksomo.co.kr";
		if(email1.contains("@")&& email1.contains(".")) {
			System.out.println("이메일형식임");
		}else {
			System.out.println("이메일 형식이 아님");
		}
		/*
		 6]endwith()
		 : 특정 문자열로 끝나면 true를 반환한다.
		 7]startswith()
		 : 특정 문자열로 시작되면 true를 반환한다.
		 */
		System.out.println("www.daum.net".endsWith("net"));
		System.out.println("www.naver.com".startsWith("http"));
	
		/*
		 *8]format()
		  : 출력형식을 지정하여 문자열로 반환하고 싶을 때 사용한다.
		  printf()와 사용법은 동일하고, 주로 웹애프리케이션(JSP)를
		  제작할때 주로 사용된다.
		 */
		System.out.printf("국어: %d, 영어: %d, 수학:%d\n",81,92,100);
		
		String formatStr=
				String.format("국어: %d, 영어: %d, 수학:%d\n",81,92,100);
		System.out.println(formatStr);
		/*
		 9]indexOf()
		 : ""(더블쿼테이션)로 문자열에서 특정 문자열의 시작 인덱스를 반환한다.
		 	만약 찾는 문자열이 없다면, -1을 반환한다. 
		 	문자열이기때문에 한개 또는 여러개의 문자열 찾기 사용 가능.
		 	
		 	찾지못한 경우 -1로 반환된다.
		 */
		System.out.println("### indexOf() ###");
		System.out.println(str1.indexOf("ava")); //12
		System.out.println(str1.indexOf("J")); //-1
		System.out.println(email1.indexOf("@")!= -1 ?
				"이메일형식맞음" : "이메일형식아님");
		
		System.out.println("### indexOf()로 성별 확인하기 ###");
		juminNum = "123403-2012345";
		//주민번호에서 -(하이픈)의 위치를 찾아 1을 더한다.
		int index = juminNum.indexOf("-") + 1; // 하이픈 뒤의 숫자를 찾기위해서
		//위에서 찾은 인덱스를 통해 문자를 가져온다.
		if(juminNum.charAt(index)== '3') {
			System.out.println("남자");
		}
		else{
			System.out.println("여자");
		}
		/*
		 10]lastIndexOf()
		 : 사용법은 indexOf()와 동일하나 문자열의 뒤에서부터 찾는것이 다르다. 
		 예시로는 확장자형식 뒤에서부터서 몇번째인지 아닌지 찾아서 출력함
		 */
		System.out.println("### lastIndexOf()로 성별 확인하기 ###");
		System.out.println(str1.lastIndexOf("ava"));
		System.out.println(str1.lastIndexOf("J"));
		System.out.println("indexOf: " + str1.indexOf("a")); //12(앞에 있는 a의 인덱스)
		System.out.println("lastindexOf: " + str1.lastIndexOf("a"));//14(뒤에 있는 a의 인덱스)
		/*
		 11]replace
		 : 특정 문자열을 찾아서 지정된 문자열로 변경한다.
		 만약 찾는 문자열이 없다면 변경만 되지 않을 뿐 에러가 발생하지는
		 않는다. 
		 아이디나 비밀번호 마스킹함.
		 */
		System.out.println("### replace ###");
		System.out.println("J를 G로변경하기");
		System.out.println(str1.replace("J", "G"));
		System.out.println("java를 KOSMO로 변경하기");
		System.out.println(str1.replace("java", "KOSMO"));
		/*
		 12] split()
		 : 문자열을 구분자를 통해 분리해서 String 타입의 배열로 반환한다.
		 해당 구분자가 없는 경우에는 크기가 1인 배열로 반환한다.
		 */
		System.out.println("### split() ###");
		String phoneNumber = "010-1234-5678";
		String[] phoneArr = phoneNumber.split("-");
		for(int i = 0; i<phoneArr.length;i++) {
			System.out.printf("phoneArr[%d]= %s\n",i,phoneArr[i]);
		}
		phoneArr = phoneNumber.split("%");
		for(int i = 0; i<phoneArr.length;i++) {
			System.out.printf("phoneArr[%d]= %s\n",i,phoneArr[i]);
		}
		/*
		 13]substring() : 시작인덱스와 끝인덱스 사이의 문자열을 잘라서 
		 반환해준다.
		 사용1: substring(인덱스) => 이 경우 인덱스부터 끝까지를 잘라낸다. 
		 사용2: substring(인덱스, 끝 인덱스) => 인덱스에 해당하는 부분만
		 잘라서 반환한다.
		 */
		System.out.println("### substring() ###");
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3,7));
		/*
		 시나리오] 다음 파이명에서 확장자를 잘라서 작성하시오.
		 파일명:my.file.images.jpg
		 */
		String filname = "my.file.images.jpg";
		int beginIndex= filname.lastIndexOf(".")+1;
		System.out.println("파일확장자는: " + filname.substring(beginIndex));
	
		/*
		 14] codePointAt(인덱스) : 문자열의 특정 인덱스 문자를 찾은 후
		 아스키코드(유니코드)를 반환한다.ㄴ
		 */
		System.out.println("st1 첫번째 문자의 아스키코드: "+ str1.codePointAt(0));
		System.out.println("st2 첫번째 문자의 아스키코드: "+ str2.codePointAt(0));
	}
}
