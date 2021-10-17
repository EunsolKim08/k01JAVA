package ex12inheritance;

/*
 구성관계로 표현하기에 적합한  Has-A 관계
 : X has a Y => X가 Y를 소유(포함)하다.
 - 경찰이 권총을 소유하다.
 
 Has-A와 같이 소유의 관계를상속으로 표현하면 클래스간의 강한
 연결고리가 형성되어 권총이 없는 경찰을 표현하기 어렵다.
 따라서 이 경우엔 구성관계로 표현하는것이 적합한다.
 구성관계란 클래스의 멤버로 또 다른 객체를 사용하는 것을 말한다.
 */
//권총을 표현
class Gun{
	int bullet; //탄환수
	public Gun(int bNum) {
		bullet = bNum;
	}
	public void shutGUn() {
		System.out.println("빵야~~"); //총을 쏜 후~
		bullet--; //탄환 감소..
	}
}
//경찰을 표현
class Police{
	
	int handCuffs;
	Gun gun; //권총을 표현하기 위한 객체형 멤버변수
	
	public Police(int bNum, int hCuff) {
		handCuffs = hCuff;
		/*
		 권총의 보유여부 초기화
		 	: 만약 총알이 없는 상태라면 보유한 권총이 없는 것으로
		 	표현하기 우해 멤버변수를 null로 초기화 한다.
		 	참조변수가 null 값이란 것은 참조할 객체가 없는 것을
		 	의미한다. 즉 Heap(힙영역)에 생성된 객체가 없는 것을 말한다.
		 */
		if(bNum <=0) {
			gun = null;
		}
		else {
			gun = new Gun(bNum);
		}
	}
	//수갑을 채우는 행위를 표현
	public void putHandcuff() {
		System.out.println("수갑채움~! 넌 콩밥~!");
		handCuffs--; //수갑의 갯수 차감
	}
	//권총을 발사하는 행위를 표현
	public void shut() {
		if(gun==null) {
			//경찰이 권총을 보유하지 않았다면 발사할 수 없다.
			System.out.println("보유한 권총없음. 헛빵~!");
		}
		else {
			//보유하고 있으므로 Gun클래스의 멤버메서드를 호출하여 실행한다.
			gun.shutGUn();
		}
	}
}
public class E05HasAComposite {

	public static void main(String[] args) {
		//권총을 보유한 경찰을 표현
		System.out.println("==경찰1==");
		Police police1 = new Police(5,3);
		police1.shut();
		police1.putHandcuff();
		
		//권총을 보유하지 못한 경찰을 표현
		System.out.println("==경찰2==");
		Police police2 = new Police(0,3);
		police2.shut();
		police2.putHandcuff();
	}

}
