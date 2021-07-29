import java.util.Scanner;// инициализация сканера

public class Scantext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner text = new Scanner(System.in);// Сканер текста
		 System.out.println("Введите текст");//вывод  сообщения
		 String text1 = text.nextLine();//считование сканиром text и командой nextLine в переменную text1
		 String text2 = text.nextLine();
		 System.out.println(text1 +" "+ text2); // 
		 System.out.println("Введите еще дин текст");
		String text3 = text.next();//считование сканиром text и командой next до пробела в переменную text1
		System.out.println(text3);
	}
}
