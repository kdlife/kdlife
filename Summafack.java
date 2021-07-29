import java.util.Scanner;
public class Summafack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Введите чило");
int a = scan.nextInt();//считование переменной а
int sum=0;
for (int i=1; i<=a; i++) {
	sum=sum+i;}

  System.out.print(sum);
	}
}
