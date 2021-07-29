import java.util.Scanner;
public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Введите число 1234");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		switch (a) {
			case 1: System.out.println("вы ввели 1"); break;
			case 2: System.out.println("вы ввели 2"); break;
			case 3: System.out.println("вы ввели 3"); break;
			case 4: System.out.println("вы ввели 4"); break;
			default: System.out.println("вы ввели ne to"); break;
		}

	}

}
