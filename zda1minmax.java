import java.util.ArrayList;
import java.util.Collections;
import java.math.*;

public class zda1minmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
ArrayList <Double> random100=new ArrayList<>();
ArrayList <Double> random100Copy= new ArrayList<>();

int f=10;

for (int i=0;i<f;i++) {
	random100.add(Math.random()*100);
;

} 
random100Copy.addAll(random100);
int c =0;
if (c==1)
{double min=random100.get(0);
double max= random100.get(0);
double sum=0;
double avg;
 for (double i:random100) {// используем форич, обычный фор присваивате i=0, поэтому работает не правиоьно
	 if (i<min) min=i;
	 if (i>max) max=i;
	sum = sum + i;
	 
 }
 avg=sum/random100.size();
 
System.out.print(" "+random100);
System.out.println();
System.out.println("Размер массива"+random100.size());
System.out.println("MIN"+min);
System.out.println("max"+max);
System.out.println("sum"+sum);
System.out.println("avg"+avg);
System.out.println("Используем встроенный медот коллестион Мин" + Collections.min(random100));// так проще  , сразу находим мин
System.out.println("Используем встроенный медот коллестион max" + Collections.max(random100));
//System.out.println("Используем встроенный медот коллестион max" + Collections.avg(random100));
}	

Double [] test= new Double [random100.size()]; // создаем новый масссив
random100.toArray(test);// копируем данные в мааси
//System.out.println("Используем встроенный медот коллестион для массива тест Мин" + Collections.min(test[])); // Colltctions не работает с массивом
	int b =0;
    if (b==1);
	{double minM=test[0];
	double maxM=test[0];
	double avgM;
	double sumM=0;
	for (Double i:test) {
		if (i<minM) minM=i;
		if (i>maxM) maxM=i;
		
		sumM = sumM+i;
	};
	
	avgM=sumM/test.length;
	System.out.println("Размер массива test"+ test.length);
	System.out.println("MIN"+Math.round(minM));
    System.out.println("max"+Math.round(maxM));
    System.out.println("sum"+Math.round(sumM));
	System.out.println("avg"+Math.round(avgM));
	}
	
	// используем сорт для листа
	
//Collections.sort(random100);
//System.out.println("Используем встроенный медот  сорт и выводим 0 индекс" + random100.get(0));// так проще  , сразу находим мин
//System.out.println("Используем встроенный медот сорт и выводим послед индекс" + random100.get(random100.size()-1)); // 
//System.out.println(random100);
	// учим сортировку пузырьком для массива
	int a =0;
	if (a==1)
	{for (int i =0; i<test.length; i++) {
		for (int j =0; j<test.length-1; j++) { 
			if
			(test[j]>test[j+1]) {// <>  меняем направление сортировки , [j]<[j+1] сравниваем текушйи элемент и последующий
				double temp =test[j];// буферная переменная // изначально присваеиваем первый элемент
							test[j]=test[j+1];// меняем местами элементы если выполняется условие
			test[j+1]=temp;// J=+1 помешен в темп, а затем если условия опять верно, записали в j
			
			}
		}
	}
	for  (int i=0;i<test.length;i++) { // просто вывод массива
		System.out.println(test[i]);
	}}
	// учим сортировку пузырьком для  аррой лист
	
	if (a==1)
	{System.out.print(random100);
	System.out.println("Пробуем сортировку на Арроулист");
	for(int i=0; i<random100.size(); i++) {
		for (int j=0; j<random100.size()-1;j++) {
			if (random100.get(j)>random100.get(j+1)) {
				double temp =random100.get(j);
				random100.set(j, random100.get(j+1)) ;
				random100.set(j+1, temp);
			}}
		}
	System.out.print(random100);
	System.out.println();
	System.out.print(random100Copy);
	Collections.sort(random100Copy);// встроенный метод сортировки
	System.out.println();
	System.out.print(random100Copy);
	}
	
	// учим сортировку пузырьком для массива + шейкер 
	System.out.println();
	for (int i=0; i<test.length;i++)
	{
		System.out.print(" " + test[i]);
		
	};
	System.out.println();
	System.out.println("пробуем шейк сорт");
	
	int left =0;
	int right=test.length-1;
	int right2=random100.size()-1;
	
	if (a==1){do {
		
		for (int i = left; i<right;i++) // сортировка в вправо сдвигаем большие элементы
		{
			
			
						if (test[i]>test[i+1]) {
							double temp =test[i];
							test[i]=test[i+1];
							test[i+1]=temp;
						
							}
				
			}
		right--;// уменьшаем на колво проходов в влево иначе бесконечный цикл
		
		
		for (int i = right; i>left;i--) // сортировка в вправо сдвигаем большие элементы
		{
			
			
						if (test[i]<test[i-1]) {
							double temp =test[i];
							test[i]=test[i-1];
							test[i-1]=temp;
						
							}
				
			}
		left++;// уменьшаем на колво проходов в впав
	} 
	
	while (left<right);
	for (int i=0; i<test.length;i++)
	{
		System.out.print(" " + test[i]);
		
	};
	}
	System.out.println();
	System.out.println("пробуем шейк сорт для арроулист рандом100");	
	System.out.print(random100);
	
	
	
	
    do { {for (int i=left; i<right2; i++) {
    if (random100.get(i)>random100.get(i+1)) {
    		double temp=random100.get(i);
    		random100.set(i, random100.get(i+1));
    		random100.set(i+1, temp);
    	}
    
    }
    right2--; }
    {for (int i=right2; i>left; i--) {
   if (random100.get(i)<random100.get(i-1)) {
    	double temp=random100.get(i);
		random100.set(i, random100.get(i-1));
		random100.set(i-1, temp);
    }
    }
    	
    	
    	
    
    
    
    left++;}
    
    } 
    while (left<right2);
    System.out.println();
	System.out.println("шейк сорт для арроулист рандом100");	
	System.out.print(random100);}}
    	
    		
   
    	
    	
    	
    	
 
    

	

	
	
	
	
	
	
	
	


	
	

