package ex08class;

import ex08class.CalculatorEx;

class CalculatorEx{
	int numofAdd;
	int numofMin;
	int numofMul; 
	int numofDiv;
	
	public void init() {
		numofAdd = 0 ;
		numofMin = 0;
		numofMul = 0;
		numofDiv = 0;
		
	}
	public double add(double num1, double num2) {
		double sum = num1 + num2;
		numofAdd++;
		return sum;
		
	}
	public double min(double num1, double num2) {
		double minus = num1 - num2;
		numofMin++;
		return minus;
		
	}
	public double mul(double num1, double num2) {
		double multiple= (num1)*(num2);
		numofMul++;
		return multiple;
	}
	public double div(double num1, double num2) {
		double division;
		
		if(num1>=num2) {
			division = num1/num2;
		}
		else {
			division = num2/num1;
		}
		numofDiv++;
		return division;
	}
	public void showOpCount() {
		System.out.println("µ¡¼ÀÈ½¼ö : " + numofAdd);
		System.out.println("»¬¼ÀÈ½¼ö : "+ numofMin);
		System.out.println("°ö¼ÀÈ½¼ö : "+ numofMul);
		System.out.println("³ª´°¼ÀÈ½¼ö : " + numofDiv);
	}
}
public class QuSimpleCalculator
{

	public static void main(String[] args)
	{
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
	}

}
