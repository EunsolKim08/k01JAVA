package ex08class;

class ChildProperty{
	int childHave;
	
	ChildProperty another;
	
	public ChildProperty(int pro) {
		childHave = pro;
	}
	public void showProperty() {
		System.out.println(childHave);
	}
	public void obtainBead(ChildProperty a, int add){
	 another = a;
	 another.childHave -= add;
	 childHave += add;

	}
}
/*
 class ChildProperty{
 	//멤버변수
 	  in bead; // 어린이가 보유한 구슬의 갯수
 	 //생성자 : 객체생성시 구슬의 갯수를 전달받아 초기화
 	public ChildProperty(int bead){
 		this.bead= bead;
 	}
 	//멤버메서드
 	 void showProperty(){
 	 System.out.println("구슬의 갯수: %d" + bead);
 	 }
 	
 	 void obtainBead(ChildProperty child, int beadCnt){
 	 	this.bead += beadCnt;
 	 	child.bead -= beadCnt;
 	 	System.out.println("게임종료");
 	 }
 	
 }
 */
public class QuMarbles {

	public static void main(String[] args) {
		ChildProperty child1 = new ChildProperty(20);
		ChildProperty child2 = new ChildProperty(15);

		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty(); 

		/*1차게임 : 어린이1은 어린이2의 구슬 5개 획득*/
		child1.obtainBead(child2, 5);

		/*2차게임 : 어린이2가 어린이1의 구슬 9개 획득*/
		child2.obtainBead(child1, 9);

		System.out.println("\n게임 후 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty();


	}

}


