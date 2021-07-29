import java.util.Scanner;
public class kv {

	public static double getNum() {
		System.out.println("введите  число");
		Scanner scan=new Scanner(System.in);
		if (scan.hasNextDouble()) {
		return scan.nextDouble();}
		else System.out.println("вы ввели не число"); return 	getNum();
		}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" введисте уватраное уравнение в виде ax2+bx+c=0");
		System.out.println("введите  число a");
     double a = getNum();
     System.out.println("введите  число b");
     double b = getNum();
     System.out.println("введите  число c");
     double c = getNum();
     double d = (b*b)-(4*a*c);
     if (d<0) {System.out.println("Дискрименарт меньше 0 , решениея нет");}
     if (d==0) {System.out.println("Дискрименарт 0 , решениея " + (-b/(2*a)));}
     if (d>0) {System.out.println("дискриминаи больше 0 "+ "X1=" + ((-b+Math.sqrt(d))/(2*a) + "  X2="+((-b-Math.sqrt(d))/(2*a)) ));}
	}

}
