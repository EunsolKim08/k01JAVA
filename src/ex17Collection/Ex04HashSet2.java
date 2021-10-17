package ex17Collection;
import java.util.HashSet;
import java.util.Objects;

import common.Student;

public class Ex04HashSet2 {

	
	public static void main(String[] args) {
	
		/*
		 아래의 경우 객체st3과 st3Copy는 동일한 객체이므로 중복제거를 위해서는
		 Student클래스에 hashCode(), equals()메서드를 오버라이딩 하여
		 객체간의 hash값 비교, 멤버변수간의 비교를 진행해야  한다.
		 */
		HashSet<Student> hashSet = new HashSet<Student>();
		
		Student st1 = new Student("정우성", 10, "2017");
		Student st2 = new Student("원빈", 20, "2018");
		Student st3 = new Student("장동건", 20, "2016");
	
		hashSet.add(st1);
		hashSet.add(st2);
		hashSet.add(st3);
		
		System.out.println("hashSet의 크기: "+ hashSet.size());
	
		//학번을 기준으로해서 오버라이딩 후 저장되지 않는다.
		//오버라이딩의 기준은 만드는 개발자에 따라 수립할 수 있다.
		Student st3Copy = new Student("장동건", 30, "2016");
		hashSet.add( st3Copy);
		/*
		 현재는 Student클래스에 stNumber(학번)만을 비교하고 있으므로
		 학번이 동일하면 같은 객체를 인식한다. Student =>boolean equals에서 학번비교함
		 */
		System.out.println("st3Copy 저장여부: "+ hashSet.add(st3Copy));
		System.out.println("hashSet의 크기: " + hashSet.size());
	
	
	}

}
