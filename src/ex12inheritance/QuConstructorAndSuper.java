package ex12inheritance;

class Car
{
       	int gasoline;
       	public Car(int gas) {
       		gasoline= gas;
       	}
}
class HybridCar extends Car
{
		//생성자는 클래스명과 동일하고 반환타입이 없다.
		//접근지정자는 큰 이유가 없다면 무조건 public으로 지정한다.
       	int electric;
       	public HybridCar(int gas, int elec) {
       		super(gas);
       		electric = elec;
       	}
}
class HybridWaterCar extends HybridCar
{
       	int water;
       	public HybridWaterCar(int gas, int elec, int wat) {
       		super(gas, elec);
       		water = wat;
       	System.out.println("하이브리드 생성자 호출: ");
       	}
       	public void showNowGauge()
       	{
                 	System.out.println("남은가솔린:"+gasoline);
                 	System.out.println("남은전기량:"+electric);
                 	System.out.println("남은워터량:"+water);
       	}
}
public class QuConstructorAndSuper {

	public static void main(String[] args)
	{
		HybridWaterCar hcar = new HybridWaterCar(10,20,30);
		hcar.showNowGauge();
	}
}