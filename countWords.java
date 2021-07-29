import java.util.Scanner;
public class countWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Введите несколько слов через пробел");
String test=getString();
int count=0;
if(test.length()!=0) {
	count++; for (int i =0; i<test.length(); i++) {
		if (test.charAt(i)==' ') {
			count++;
		}
		
		
	}
	System.out.println("В строке слов: " + count);
}
	}

	private static String getString() {
		Scanner scan=new Scanner(System.in);
		String text=scan.nextLine();
		return text;
	}

}
