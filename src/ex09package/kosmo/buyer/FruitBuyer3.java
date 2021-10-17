package ex09package.kosmo.buyer;
import ex09package.kosmo.seller.FruitSeller3;

public class FruitBuyer3{//다른 클래스에 import시키기 위해서는 public이 중요함!!
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

