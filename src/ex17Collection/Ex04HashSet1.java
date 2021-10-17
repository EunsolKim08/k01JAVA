package ex17Collection;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

import common.Teacher;
/*
 HashSet컬렉션
 	:Set계열의 인터페이스를 구현한 컬렉션으로
 	-객체가 순서없이 저장된다.
 	-객체의중복저장을 기본적으로 허용하지 않는다.
 	단, 기본클래스가 아닌 새롭게 정의한 클래스라면 
 	hashCode(), equals()를 적절히 오버라이딩하여 정의해야 한다.
 	- List가 배열 성격이라면 Set은 집합의 성격을 가진다.
 */

public class Ex04HashSet1 {

	public static void main(String[] args) {
		
		
		/*
		 1]set 컬렉션 생성
		 : Object를 기반으로 한 Set커렉션 생성
		 */
		HashSet<Object> set = new HashSet<Object>();
		
		//2]다양한 객체 생성
		String strObject1 = "JAVA";
		String strObject2 = new String("KOSMO61기");
		
		Date dateObject = new Date();
		int number = 100; //정수타입은 컬렉션에 저장시 Integer객체로 Boxing된다.
		Teacher teacher = new Teacher("김봉두", 55, "체육");
		/*
		 3]객체저장
		  :add()메서드를 통해 저장되고, 문제가 없다면 true가
		  반환된다.
		 */
		System.out.println(set.add(strObject1)); //true 반환
		set.add(strObject2);
		set.add(dateObject);
		set.add(number);
		set.add(teacher);
		
		/*
		 4] 저장된 객체 수 얻기
		 */
		System.out.println("[중복저장전 객체수]: " + set.size());  //5개
		/*
		 5-1] 기본 클래스형 객체 중복저장
		 	: 기본 클래스인 경우 별도의 오버라이딩이 없어도
		 	중복이 제거된다. 따라서 아래의 경우 false가 반환된다.
		 */
		System.out.println(set.add(strObject2) ? "저장성공" : "저장실패");
		System.out.println("[중복(String)저장 후 객체 수] :" //5개
				+ set.size());
		/*
		 6]저장된객체출력
		 */
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Object object = itr.next();
			
			if(object instanceof String) {
				System.out.println("String타입: " + object);
			}else if(object instanceof Date) {
				
			}
			/*
			 7]개발자가 직접 정의한 객체의 중복저장
			 	: 사용자정의 클래스인 경우 hasCode, equals메서드를
			 	오버라이딩 하지 않으면 중복저장이 허용된다. 아래의 경우
			 	저장에 성공하여 true가 반환된다.
			 */
			/*
			 8]이터레이터를 통한 객체 출력
			 	: 순서없이 저장되면서 출력의 순서도 정할 수 없다.
			 */
		}
	}

}
