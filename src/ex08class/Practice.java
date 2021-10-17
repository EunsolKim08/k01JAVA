package ex08class;
/*
판매자가 사과를 판매하는 행위를 표현한 메서드
1. 구매자로부터 금액을 전달받는다.(매개변수)
2. 금액/사과의 단과 = 판매될 사과의 갯수를 구한다.(5000/1000 = 5개)
3. 보유한 사과의 갯수에서 판매할 갯수를 차감한다.(100-5 = 95개)
4. 판매수익이 증가한다.(5000원 증가)
5. 구매자에게 사과 5개를 반환한다(return num)
*/

class FruiteSeller{
	
	//멤버변수
	int appleNum ;
	int profit ;
	int applePrice ;
	
	public void initiate(int num, int money, int price) {
		appleNum = num;
		profit = money;
		applePrice = price;
	}
	
	public int salesApple(int money) {
		int num = (money/applePrice);
		
		appleNum -= num;
		profit += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("[판매자]남은 사과갯수: "+ appleNum);
		System.out.println("[판매자]수익 : "+ profit);
	}
}
class FruiteBuyer{
	int myMoney = 10000;
	int numOfApple = 0;
	
	public void buyApple(FruiteSeller seller,int money) {
		int numOfApple = seller.salesApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액: "+myMoney);
		System.out.println("[구매자]사과갯수 : "+numOfApple);
	}
}
public class Practice
{

	public static void main(String[] args)
	{
		FruiteSeller seller = new FruiteSeller();
		FruiteBuyer buyer = new FruiteBuyer();
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller.showSaleResult();
		buyer.showBuyResult();
		
		buyer.buyApple(seller, 5000);
		System.out.println("구매행위가 일어난 후의 상태");
		seller.showSaleResult();
		buyer.showBuyResult();
		

	}

}
