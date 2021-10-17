package ex18thThread;
/*
 쓰레드로 구현되는
 */
class NotThread{
	
	String title;
	public NotThread(String title) {
		this.title = title;
	}
	void notThreadMehtod() {
		for(int i = 1; i<10 ; i++) {
			System.out.println(String.format("[%s] i = %d", title,i));
		}
	}
}
/*
 독립쓰레드(Non Daemon thread)
 	: 메인쓰레드와 working쓰레드(개발자가 정의한 쓰레드)를 일컫는 것으로
 	메인쓰레드가 종료되어 계속실행되며, dead상태가 되어야 실행이
 	종료되는 쓰레드를 말한다. 해당쓰레드는 main()메서드가 종료된 이후에도
 	계속 실행되는 것을 볼 수 있다.
 */
class YesThread extends Thread{
	/*
	 쓰레드 생성시 이름을 지정하지 않으면 JVM이 자동으로 이름을 부여한다
	 */
	public YesThread() {}
	/*
	 Thread 클래스의 생성자를 호출할 때 전달하는 매개변수를 통해
	 해당쓰레드의 이름을 지정할 수 있다. 지정된 이름은 getName()을 통해
	 반환할 수 있다.
	 */
	public YesThread(String threadName) {
		super(threadName); //super를 통해 이름 지정
	}
	
	void threadMethod() throws InterruptedException{
		for(int i = 1; i<=10 ; i++) {
			//반복시의 횟수와 쓰레드의 이름을 출력한다.
			System.out.println(String.format("[%s] i = %d", getName(),i));
			//2초마다 블럭상태로 들어간다.
			sleep(2000);
		}
	}
	@Override
	public void run() {
		try{
			threadMethod();
		}
		catch(InterruptedException e) {}
	}
}
class DaemonThread extends Thread{
	/*
	 종속쓰레드(Daemon Thread)
	 	: 모든 독립쓰레드가 종료되면 자동으로 종료되는 쓰레드를 말한다.
	 	메인 메서드도 하나의 독립쓰레드 이므로, 다른 독립쓰레드가 남아있다면
	 	종료될때까지는 프로그램은 종료된것이 아니다.
	 	주로 프로그램의 보조역할로 배경음악, 로그자동저장 등의 업무를
	 	처리한다. 프로그램이 종료될 때 자동으로 종료되므로 주로 무한루프로
	 	구성한다. setDaemon(true) 메서드로 설정한다.
	 */
	@Override
	public void run() {
		while(true) {
			System.out.printf(String.format("[쓰레드명:  %s]Jazz가 흘러요~"), getName());
			
			try {
				sleep(3000);
				System.out.println("3초마다 자동저장!!!");
			}catch(InterruptedException e) {
				System.out.println("자동 저장시 오류발생");
			}
		}
	}
}

public class Ex03DaemonThread {

	public static void main(String[] args) {
		/*
		 쓰레드로 구현하지 않는 일반적인 클래스의 작업
		 */
		NotThread nt1 = new NotThread("첫번째 클래스");
		nt1.notThreadMehtod();
		
		NotThread nt2 = new NotThread("두번째 클래스");
		nt2.notThreadMehtod();
		//1번객체가 작업을 끝내야지만 2번 객체가 실행된다. 즉 순차실행된다.
		/*
		 독립쓰레드(Non Daemon Thread) 실행
		 */
		//첫번째 독립쓰레드 생성
		YesThread yt1 = new YesThread("1st 쓰레드"); //이름 부여방법 1
	//	yt1.setName("첫번째 쓰레드"); // 이름 부여방법2
		yt1.start();
		
		//두번째 독립쓰레드 생성
		YesThread yt2 = new YesThread(); //이름이 지정되지 않아 자동으로 부여됨.
		yt2.setPriority(Thread.MAX_PRIORITY); //우선순위는 10으로 지정됨
		yt2.start();
		
		/*
		 데몬쓰레드(Damemon Thread)실행
		 */
		DaemonThread dt = new DaemonThread(); //내가 원할때까지 돌아갈 수 있도록 함.
		dt.setName("난 데몬쓰레드");
		//dt.setDaemon(true); //독립쓰레드를 종속쓰레드로 만들어준다.
		dt.start();
		
		//Thread클래스의 정적메서드를 통해 여러가지 정보확인
		System.out.println("현재 활성화된 상태의 쓰레드 수" + Thread.activeCount());
		System.out.println("현재 실행중인 쓰레드명: " + Thread.currentThread().getName());
		System.out.println("메인함수의 우선순위: " +Thread.currentThread().getPriority());
		System.out.println("메인함수 (Main Thread) 종료");

	}

}
