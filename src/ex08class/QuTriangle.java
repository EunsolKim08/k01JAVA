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
		t.init(10, 17); //�غ�10, ����17�� �ʱ�ȭ
		System.out.println("�ﰢ���� ���� : " + t.getArea());
		t.setBottom(50);//�غ� 50���� ����
		t.setHeight(14);//���� 14�� ����
		System.out.println("�ﰢ���� ���� : " + t.getArea());


	}

}
