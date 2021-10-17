package ex18thThread;
class Sum{
	
	int num;

	public Sum() {
		num = 0;
	}
	public void addNum(int n) {
		num += n;
	}
	public int getNum() {
		return num;
	}
}
/*
 Thread 클래스를 생성하는 두번째 방법
 	: Java는 다중상속이 지원되지 않으므로, 다른 클래스를
 	상속받아야 한다면 Runnable 인터페이스를 구현해서 쓰레드클래스를
 	정의 해야한다.
 */
class AdderThread extends Sum implements Runnable{
	int start, end;

	public AdderThread(int start, int end) {
		this.start = start;
		this.end = end;
	}
	/*
	멤버변수 Start에서 end까지 반복하면서 부모클래스의 addNum()을 호출하여 누적합을
	구한다. start가 1이고 end가 10이라면 1~10까지의 합을 구하게 된다.
	 */
	@Override
	public void run() {
		for(int i =start; i<= end; i++) {
			//쓰레드의 동작확인을 위한 로그
			System.out. println("i = " + i);
			addNum(i);
		}
	}
}
public class Ex04Runnable {

	public static void main(String[] args) {
		
		/*
		 Runnable 인터페이스를 구현한 클래스의 인스턴스를 대상으로
		 쓰레드를 생성한다. 해당방법도 결국은 Thread 클래스를 통해서
		 쓰레드를 생성하게된다.
		 */
		AdderThread at1 = new AdderThread(1, 500);
		AdderThread at2 = new AdderThread(501, 1000);
		
		Thread thread1 = new Thread(at1);
		Thread thread2 = new Thread(at2);
		
		//2개의 쓰레드 생성
		thread1.start();
		thread2.start();
		
		try {
			/*
			join()이라는 메서드는 동시접근을 막아주는 메서드이다.
			생성된 쓰레드가 작업을 완료하기를 기다렸다가
			다음 쓰레드를 실행하게된다.
			 */
			thread1.join();
			thread2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1~1000까지의 합: "+ (at1.getNum()+ at2.getNum()));
		//
	}

}
