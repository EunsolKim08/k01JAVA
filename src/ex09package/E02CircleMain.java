package ex09package;
//�ѷ��� ���ϱ� ���� CircleŬ���� ����Ʈ
import ex09package.kosmo.perimeter.Circle;
public class E02CircleMain {

	public static void main(String[] args) {
		//���̸� ���ϱ� ���� CircleŬ������ Ǯ��θ� ���� ��ü����
		ex09package.kosmo.area.Circle circle1= new ex09package.kosmo.area.Circle(6.5);
		System.out.println("�������� 6.5�� ���� ����: "+ circle1.getArea());
	
		Circle circle2 = new Circle(4.5);
		System.out.println("�������� 4.5�� ���� ����: "+ circle2.getPerimeter());
	}

}