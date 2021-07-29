
public class massiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] test1= {"Один", "Два", "Tri"};
int k =test1.length;
double sum=0;
System.out.println(k);
System.out.println(test1[2]);
double [] test2 = new double[4];
test2[1]=5.0;
test2[2]=6.0;
test2[3]=7.0;
for ( int i=0; i<test2.length; i++) {
	System.out.println(test2[i]);
}
double [] test3 = new double[10];
for (int i=0;i<test3.length;i++) {// цикл для заполнения массива
	test3[i]=Math.random()*100; // запалняем массив случайными цирами
	System.out.print( " " + Math.round(test3[i])); // округлям для приятного восприятия
	;
}
 {
 for (int i=0;i<test3.length;i++)	{ 
	 int c = test3.length;
	// System.out.println(c);
sum +=test3[i];
if (i==c-1) {System.out.println(" = summa" + " " + Math.round(sum));
 }
 
 }
	
	}
	}}


