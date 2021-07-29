import java.util.*;
import java.io.*;
class Cat 
{
	String name;
	
	Cat (String name){
		this.name=name;
	}
}

public class testObgect {
static	Cat [] massiv=new Cat [3];// создаем массив обьектов
	
	public static void main(String[] args) throws IOException  {
		massiv[0]=new Cat ("Dima");// Создаем обьект
		massiv[1]=new Cat ("Vasia");
		massiv[2]=new Cat ("Her");
		// TODO Auto-generated method stub
  for (int i=0; i<massiv.length; i++) {
	  System.out.println(massiv[i].name);
	   }
  try {
  FileWriter fw= new FileWriter ("test.txt");
  fw.close();// создаем файл 
  fw.write("Test Privet");// хапись текста в файл
  //fw.close();
  } 
  // закрывем файл
  catch(IOException ex) {// перехват исключений, тоесть ошибок
	//  ex.printStackTrace();// вывод ошиьки в конаоль
	  System.out.println("Файл закрыт ошибка");//
  }
  System.out.println("Прорамма успешно работает дальше, несмотря на ошибку");
	int a = 5;
	int b =5;
	
	try {
		int c=a/b;
		System.out.println (c);}
	
	catch (ArithmeticException xx) // перехват арифметической ошибки
	{
		System.out.println("На ноль не длят");
	}
	}
	
	
	}


