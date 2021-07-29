class MyClass
	{ int x;
	MyClass(int i){// конструктор для мукласса, 
		x=i;
	}
		
	}
class test2This
{ int z=122;

	}

public class testclass {
	
	
	
	public static void main(String[] args) {{
		// TODO Auto-generated method stub
		MyClass t1 = new MyClass(20);
		MyClass t2 = new MyClass(50);
		System.out.println(t1.x + " " + t2.x);
int a =100;
int b = 536;
int c = testFunction(a, b);
System.out.println(c);
System.out.println("обьявленны переменные  a  and  b " + a +" и " + b);
testMethod(155);
testSwap(a,b);//  выполняем  тестовый метот с переменыеми а и б
System.out.println("обьявленны переменные  a  and  b после выполенения метода testSwap " + a +" и " + b);
double a1=55.0;
double b1=45.6;
double c1 = testFunction(a1, b1);
System.out.println(" с тем же названием для доубле"+c1);
	}}
public static int testFunction (int n1,int n2) { // делаем новую свою функицию
	int x;// создаем переменную которая вернется
	if (n1>n2) 
		x=n2;
	else x=n1;
	return x; // возвращаем переменную int
}
	static void testMethod(int test) {
	 int	b=600; //  за приделами метода  первую б не видит
		if (test>b) {System.out.println("test>b");}
		else  {System.out.println("test<b");}
	}

 public static void testSwap(int a, int b) // не возвращает значение так как void
 { int c=b;
 b=a;
 a=c;
 System.out.println("Выводим значение  а и б в результате выполнения метода" + a +" "+ b);
	 
 }
public static double testFunction(double n1, double n2) {
	double test;
	if (n1>n2) 
		test=n2;
	else test=n1;
	return test; // возвращаем переменную  double

}
}



