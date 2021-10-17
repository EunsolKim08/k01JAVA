package ex10accessmodifier;

/*
 세번째 버전에서는 초기화 메서드를 생성자로 변경해본다.
 */

class FruitSeller3{
	//멤버변수
	public int numOfApple;
	public int myMoney;
	public final int APPLE_PRICE;
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

class FruitBuyer3{
		public int myMoney;
		public int numOfApple;
		
		//초기화 메소드 선언
		public FruitBuyer3(int _myMoney, int _numOfApple){ 
			myMoney = _myMoney;
			numOfApple = _numOfApple;
		}
		public void buyApple(FruitSeller3 seller, int money) {
			numOfApple += seller.saleApple(money);
			myMoney -= money;
		}
		
		public void showBuyResult() {
			System.out.println("[구매자]현재잔액: "+myMoney);
			System.out.println("[구매자]사과갯수 : "+numOfApple);
		}
	}


public class E02FruitSalesMain5
{	
	public static void main(String[] args)
	{
		FruitSeller3 seller1 = new FruitSeller3(0,100,1000);
		
		FruitSeller3 seller2 = new FruitSeller3(0,80,500);
		
		FruitBuyer3 buyer = new FruitBuyer3(10000,0);

		

		/////////////////////////////////////////////
		/*
		 아래의 코드는 문법적으로는 오류가 없으나 지불금액과 구매한 사과의
		 관계가 전혀맞지않는 논리적 오류가 발생되었다.
		 즉, 코드(메서드)로 구현한 규칙이 완전히 무너지게 되낟.
		 객체 지향 프로그래밍에서는 이러한 정보오류를 막기위해 멤버변수에 대한
		 "정보은닉"을 하도록 규정하고 있다.
		 */
		seller1.myMoney += 1000; //판매자1에게 1000원을 지불하고
		seller1.numOfApple -= 50; // 사과 50개를 구매한다.
		buyer.numOfApple += 50;//구매자는 사과 50개가 증가하였다.
		
		seller2.myMoney +=1000; //판매자2에게 1000원을 지불하고
		seller2.numOfApple -= 70; //사과 70개를 구매했다.
		buyer.numOfApple += 70; //따라서 구매자는 사과 70개가 증가했다.
		System.out.println("구매행위가 일어난 후의 상태2");//하지만 구매자의 금액을 차감되지 않는다.(이미 잔고가 0원이라)
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
	}

}
