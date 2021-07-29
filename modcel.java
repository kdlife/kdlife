import java.util.Arrays;
import java.util.ArrayList;
//import java.util.Collections; // не работает с int, 


public class modcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//выборка  чисел делящихся на 2, от 2 до 100 свое, по тупому
 int [] test=new int [100];
 int [] testCopy=new int [test.length];// делятся на 2
 int [] testCopy2=new int [test.length];//  неделлятся
 int [] testCopy3=new int [test.length];
 
 int temp=0;
 for (int i=2; i<100;i++){ 
	 	 test[i]=i;
	 if(test[i]%2==1) 
			System.out.print(" "+test[i]);
	 else testCopy[i]=test[i];
	 } // вывод нечетных
 
 System.out.println();
 System.out.println("выводим массив тест копи тут только четные");
 for (int i=2; i<100;i++) {
	 if(test[i]%2==0) {
				System.out.print(" "+test[i]);
				
				   }
	 else			  testCopy2[i]=test[i];
 }
 System.out.println();

 System.out.println("Выводим массив тест 2  , тут только нечетные");
for (int  j:testCopy) {
	System.out.print(" "+testCopy[j]);
	}	
System.out.println();
System.out.println("ищем простые числа в массиве тест");
for (int  j:testCopy2) {
		System.out.print(" "+testCopy2[j]);
	}
System.out.println();
System.out.println("ищем простые числа в массиве тест");
for (int i = 2; i<test.length; i++) { // поиск простых чисел в массиве
	boolean isPrime = true;
	for ( int j =2; j<i; j++) {
	if (test[i]%test[j]==0) {isPrime=false;
	break;
	}
	}
	if (isPrime) {
		System.out.print(" "+test[i]);
		testCopy3[i]=test[i];
	}
}
System.out.println();
System.out.println("Выводим тест3 копу найденные в массиве простые числа");
//for (int  j:testCopy3) {
	System.out.print(" "+Arrays.toString(testCopy3));
	
	// попробуем удалить нули тз массива		
	for (int d:testCopy3)
	{if ( d!=0) 
	{temp++;}}
	System.out.println();
	System.out.println("temp"+temp);
	
	int [] res=new int[temp];
	for (int i=0, j=0; i<testCopy3.length; i++) {
	{if (testCopy3[i]!=0) { res[j]=testCopy3[i];
	j++;
	}	}}
	
	
	System.out.println();
	System.out.print(" "+Arrays.toString(res)); // типо кравиво и легко вывыести занчения масисва без цикла
	// пробуем все то же самое только для арроулист
	
	
	ArrayList <Integer> arr= new ArrayList<>();
for (int i:test) {
	arr.add(i);
}
System.out.println();
System.out.print("Пробуем"+arr);
ArrayList <Integer> arr2 = new ArrayList <>();
ArrayList <Integer> arr3 = new ArrayList <>();
ArrayList <Integer> arr4 = new ArrayList <>();
// пробуем сделать теперь только нечетные числа
for (int i:arr) {if(arr.get(i)%2==0)
	
{arr2.add(i);
	}
else arr3.add(i);
}
System.out.println();
System.out.print("Пробуем четные чисчла"+arr2);	
System.out.println();	
System.out.print("Пробуем  не четные чисчла"+arr3);		
	
	
for (int i=2; i<arr.size();i++) {
	boolean stop=true;
	for (int j=2; j<i; j++) {
		if (arr.get(i)%arr.get(j)==0) {stop=false;
		
		break;}}
	if(stop) {arr4.add(arr.get(i));}
	
	}

System.out.println();	
System.out.print("Пробуем  простые числа чисчла"+arr4);			
	
	}
	// пробуем целые числа в арроу лист
	
	
	
		
	
	
		
	
	
	
	
 // выборка простых чисел по умному, из примера
// for(int i = 2; i <= 100; i ++){
//     boolean isPrime = true;

//     for(int j = 2; j < i; j++){
 //        if(i % j == 0){
 //            isPrime = false;
  //           break;
 //        }
 //    }

//     if(isPrime){
   //      System.out.println(i);
 


}
	
	


