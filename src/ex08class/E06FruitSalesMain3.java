package ex08class;

/*
 세번째 버전에서는 초기화 메서드를 생성자로 변경해본다.
 */

class FruitSeller3{
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

class FruitBuyer3{
		int myMoney;
		int numOfApple;
		
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


public class E06FruitSalesMain3
{	
	public static void main(String[] args)
	{
		FruitSeller3 seller1 = new FruitSeller3(0,100,1000);
		
		FruitSeller3 seller2 = new FruitSeller3(0,80,500);
		
		FruitBuyer3 buyer = new FruitBuyer3(10000,0);

		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		//판매자1, 판매자2 에게 각각 5000원을 지불하고 구매
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();

	}

}
