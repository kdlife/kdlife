import java.util.Scanner;

public class testcalc {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1= getNumber();// считоваем первыую переменную	
		double num2=getNumber();//считываем втору.
		char oper=getOper();// считываем что нуэно сделать
		double result=calc(num1, num2, oper);// выплоняем 
		System.out.println("результат операции " + result);//вывод
	}
		
	
	
	public static double getNumber() {// метод для считоыания с консоли номера
			Scanner scan=new Scanner(System.in);
			System.out.println("введите первое число");
			if (scan.hasNextDouble()) {// проверяем введенное число на соотвсетстие типу данных
				return scan.nextDouble();//считываем и возвразаем переменну в нуи1
			}
			else { // иначе  зановго считыве
				System.out.println("Вы ввели не число");
				return getNumber();// возврат в начало метода
					
			}
			}
			public static char getOper() {// метод считываем что делать
				Scanner scan=new Scanner(System.in);
				System.out.println("ВВедите необходимую опепрацию 1 * 2  / 3 - 4 +");
				int oper=0;
				if (scan.hasNextInt()) {// проеряем тип
					oper = scan.nextInt();// считтывем
					
					}
				else return getOper();//возвразаем
				
				switch (oper) {// перехватываетм считонае значение
				case 1 :
					return '*';
					case 2:
				   return '/';
					case 3:
						return '-';
					case 4:
						return '+';
						default : System.out.println("вы ввели не число 1-4");
						return getOper();
						
					
				}	
			
				
			}
			public static double add (double num1, double num2) { // делаем  методы для каждой возможной операции
				return num1+num2;
			}
				public static double mul (double num1, double num2) {
					return num1*num2;
				
			
			}
				public static double sub (double num1, double num2) {
					return num1-num2;
					
				
			
			}
				public static double div (double num1, double num2) {
				if (num2!=0.0) {return num1/num2;}
				else {System.out.println("NAN");	
				return Double.NaN;
				}
			
			}
				public static double calc(double num1,double num2, char oper){// метот вычисления
					
					switch (oper) {// перехват выборап операции
					case '*' : return mul (num1, num2);
					case '+' : return add (num1, num2);
					case '/' : return div (num1, num2);
					case '-' : return sub (num1, num2);
					default:return Double.NaN;
					}
					
				}
}
	


