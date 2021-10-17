package ex12inheritance;

class Point {
   	int xDot, yDot;
   	public Point(int x, int y) {
         		xDot=x;
         		yDot=y;
   	}
   	public void showPointInfo() {
         		System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
   	}
}
//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle{	
	//멤버변수
	int radian;//반지름
	Point center;
	/*
	 원을 표현하기 위해 반지름과 중심점이 필요하다.
	 중심점 Point 객체는 2개의 멤버변수를 가지고 있으므로
	 해당  Circle클래스의 객체를 생성하기 위해서는 3개의 값이 필요하다.
	 public Circle(int x, int y, int r){
	 	this.radian = radian;
	  	center = new Point(x,y);
	 }
	 */
	public Circle(int x, int y,int radian) {
		this.radian = radian;
		center = new Point(x,y);
	}
	public void showCircleInfo() {
		System.out.println("반지름: " + radian);
	}


}
//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring{
	//멤버변수
	Circle innerCircle;//안쪽의 원
	Circle outerCircle;//바깥쪽의 원
	
	 public Ring(int rx1, int ry1, int r1, int rx2, int ry2, int r2) {		
		innerCircle = new Circle(rx1,ry1,r1);
		outerCircle = new Circle(rx2,ry2,r2);
	}
	 /*
	  * 원래 내코드
	public Ring(int rx1, int ry1, int r1, int rx2, int ry2, int r2) {		
		this.r1 = r1;
		this.r2 = r2;
		
		innerCircle = new Circle(rx1,ry1,r1);	
		outerCircle = new Circle(rx2,ry2,r2);
	}
	*/
	//블라블라
	public void showRingInfo() {
		System.out.println("안쪽원의 정보: ");
		innerCircle.showCircleInfo();
		System.out.println("바깥쪽원의 정보: ");
		outerCircle.showCircleInfo();
	}
	 /*
	  * 원래 내코드
	 public void showRingInfo() {
		System.out.println("안쪽원의 정보: ");
		System.out.println("반지름: " + r1);
		innerCircle.showPoinInfo();
		System.out.println("바깥쪽원의 정보: ");
		System.out.println("반지름: " + r2);
		outerCircle.showPoinInfo();
	}
	*/
}
class QuRingMake {
	public static void main(String[] args) {
		Ring c = new Ring(1,1,3,2,2,9);
		c.showRingInfo();
	}
}
