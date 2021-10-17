package ex05method;

import java.util.Scanner;

public class QuTemperature {

	/*
	 섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 
	 리턴하는 함수와 
	 화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.
	 
	 공식]
	 화씨 = 1.8 * 섭씨 + 32
	 섭씨 = (화씨 - 32) / 1.8

	 */
	static double Faherenheit(double c) {//faherenheitToCelcius(double f)
		double i = (1.8* c ) + 32;
		
		return i;
	}
	static double Celsius(double f) { // celsiusToFahrenheit(double c)
		double j = (f-32)/1.8;
		
		return j; // return (f-32)/1.8;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("화씨를 입력하시요: ");
		double far = scanner.nextDouble();
		System.out.print("섭씨를 입력하시요: ");
		double cel = scanner.nextDouble();
		System.out.println("화씨는 : " + Faherenheit(cel)); // "화씨 far도는 => 섭씨 ="
		System.out.println("섭씨는 : " + Celsius(far)); //"섭씨 cel도는 => 화씨 ="
	}

}
