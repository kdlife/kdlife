import java.util.Scanner;
public class Zadswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Введите слово тройлебус или сдаюсь");
boolean exit;
exit=false;
for (int i=1; i<=3; i++) {
	if (exit == true)
		break;
		String word1=scan.nextLine();
switch (word1) {
case ("тройлебус"): System.out.println("все верно"); exit=true; break;
case ("сдаюсь"): System.out.println("отеет тройебус");exit=true;break;
default: System.out.println("подумай");break;
}

}}}
