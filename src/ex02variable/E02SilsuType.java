package ex02variable;

public class E02SilsuType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 실수자료형
		 - 정수형보다는 실수형이 더 큰 자료형이다.(0과 1사이의 많은 실수)
		 -따라서 long과 float를 연산하면 결과는 float가 된다.
		 */
		 long long1 = 100;
		 float float1 = 200;
		 float result1 = long1 + float1;
		 System.out.println("long1 + float1 = " + result1);

		 long result2 = long1 + (long)float1;
		 System.out.println("형변환후 연산 = " + result2);
		 
		 long result3 = (long)(long1 + float1); 
		 /*기본적으로 (long + float)는 float인데 
		  그 float 결과는 강제로 long으로 변환하는 것이다.
		  
		 /*
		  float와 long의 연산결과를 long으로 받고싶다면
		  방법1 : float를 long으로 형변환후 연산하거나
		  방법2: 계산결과 전체를 long형으로 강제(명시적)형변환한다.
		  */
		 
		 System.out.println("계산 후 형변환 = " + result3);
		 
		 
		 /*
		  - 실수형에서 기본형은 double이다.
		  - 소수점이 있는 데이터 컼파일로는 무조건 double로 인식한다.
		  - 단, 소수점이 없는 데이터는 float에 대입할 수 있다.
		  - 소수점이 있는 데이터를 float에 대입하려면 접미사 f or F를 붙여줘야한다.
		  - 향변환도 가능하지만 Java에서는 권장하지 않는다.
		 
		  */
		  
		 float f3 = 100;
		 
		 /* float f4 = 3.14;
		  
		  */
		
		 float f4 = 3.14f;
		 
		 float f5 = 3.14F;
		 System.out.println("f5 = " + f5);
		 
		 float f6 = f3 + f4;
		 System.out.println("f6 = " + f6);
		
		 double d1 = 3.14;
		 double d2 = f6 + d1;
		 System.out.println("d2 = " + d2);
		 
	}

}
