import java.util.Scanner;
public class DlinnaOkr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.1415;
		System.out.println("Введите радиус");
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		double P = 2*PI*r;
		System.out.println("Длинна окружности равана" + P);
		
		

	}

}
