package ex08class;

import ex08class.Triangle;

class Triangle{
	double bottom;
	double height;
	
	public void init(int b, int h) {
		bottom = b;
		height = h;
	}
	public double getArea() {
		double area;
		
		area = bottom * height * (0.5);
		return area;
	}
	public double setBottom(double b){
		
		bottom= b;
		return bottom;
	}
	public double setHeight(double h){
		height = h;
		return height;
	}
}
public class QuTriangle
{

	public static void main(String[] args)
	{
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());


	}

}
