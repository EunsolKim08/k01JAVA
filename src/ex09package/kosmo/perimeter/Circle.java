package ex09package.kosmo.perimeter;
/*
 ���� �ѷ��� ���ϱ� ���� Ŭ������ perimeter ��Ű���� �����Ͽ���.
 */
public class Circle {
	double rad;
	final double PI;
	//������
	public Circle(double rad) {
		this.rad = rad;
		PI=3.14159;
	}
	//�ѷ��� ���ϱ� ���� ����޼���
	public double getPerimeter() {
		return 2 * PI *rad;
	}
}
