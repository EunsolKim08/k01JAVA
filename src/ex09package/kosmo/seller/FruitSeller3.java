package ex09package.kosmo.seller;

public class FruitSeller3{ //다른 클래스에 import시키기 위해서는 public이 중요함!!
	//멤버변수
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;
	/*
	  상수는 값의 변경이 불가능하고, 단 한번만 초기화되기 때문에
	  일반 메서드에서는 초기화 할 수 없다.
	  하지만 생성자는 객체생성시 딱 한번만 호출되고, 개발자가 마음대로
	  호출할 수 없으므로 한번이상 초기화 되지 않음이 보장된다.
	  따라서 멤버상수는 생성자에서 초기화 할 수 있다.
	 */
	 
	public FruitSeller3(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	public int saleApple(int money) {
		int num = (money/ APPLE_PRICE);
		numOfApple -= num;
		myMoney +=money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("[판매자]남은 사과갯수: "+numOfApple);
		System.out.println("[판매자]수익 : "+myMoney);
	}
}	
