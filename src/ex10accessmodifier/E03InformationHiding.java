package ex10accessmodifier;


class FruitSeller6{
	//외부클래스에서 접급할 수 없도록 private으로 선언한다.
	private int numOfApple;
	private int myMoney;
	private final int APPLE_PRICE;

	 
	public FruitSeller6(int money, int appleNum, int price) {
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

class FruitBuyer6{
	   //외부클래스에서 접급할 수 없도록 private으로 선언한다.
		private int myMoney;
		private int numOfApple;
		
		//초기화 메소드 선언
		public FruitBuyer6(int _myMoney, int _numOfApple){ 
			myMoney = _myMoney;
			numOfApple = _numOfApple;
		}
		public void buyApple(FruitSeller6 seller, int money) {
			numOfApple += seller.saleApple(money);
			myMoney -= money;
		}
		
		public void showBuyResult() {
			System.out.println("[구매자]현재잔액: "+myMoney);
			System.out.println("[구매자]사과갯수 : "+numOfApple);
		}
	}


public class E03InformationHiding
{	
	public static void main(String[] args)
	{
		FruitSeller6 seller1 = new FruitSeller6(0,100,1000);
		
		FruitSeller6 seller2 = new FruitSeller6(0,80,500);
		
		FruitBuyer6 buyer = new FruitBuyer6(10000,0);

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

		/////////////////////////////////////////////
		/*
		 멤버변수를 private으로 선언하면 클래스 외부에서는 접근이 불가능하므로
		 아래 코드는 모두 에러가 발생하게된다.
		 즉, 멤버변수의 정보은닉을 통해 비정상적인 접근을 차단하고
		 멤버 메서드를 통해서만 구매가 이뤄질 수 있도록 구현해야 한다.
		 */
		/*
		seller1.myMoney += 1000; //판매자1에게 1000원을 지불하고
		seller1.numOfApple -= 50; // 사과 50개를 구매한다.
		buyer.numOfApple += 50;//구매자는 사과 50개가 증가하였다.
		
		seller2.myMoney +=1000; //판매자2에게 1000원을 지불하고
		seller2.numOfApple -= 70; //사과 70개를 구매했다.
		buyer.numOfApple += 70; //따라서 구매자는 사과 70개가 증가했다.
		*/
		System.out.println("구매행위가 일어난 후의 상태2");//하지만 구매자의 금액을 차감되지 않는다.(이미 잔고가 0원이라)
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
	}

}
