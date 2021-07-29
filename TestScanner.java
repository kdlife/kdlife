import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("Введите чистло от 1 до 10");
Scanner scan = new Scanner(System.in); // переманная scan к классу сканер
int number = scan.nextInt();// переменная  number и считование scan.nextInt
System.out.println("Вы ввели число " + number);// вывод на экран
	//второй сканер
 System.out.print("введите 3 числа");// тупо вывод надписи
 Scanner second = new Scanner(System.in);// сканер second
		 int number1 = second.nextInt();//обьявление переменной и считование первого числа
		 int number2 = second.nextInt();//обьявление переменной и считование второго числа
		 int number3 = second.nextInt();
		 System.out.println("Summa");
		 System.out.println(number1 + number2 + number3);} // сумма и вывод на экран

}
