import java.util.ArrayList;
import java.util.function.Consumer;
public class Arrlisttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	a=0;// мешает на экрвне, что бы включить1
if (a == 1){int []test= new int[3];
 test[0]=1;
 test[1]=2;
 test[2]=10;
 for ( int i = 0; i<test.length;i++) { // простой вывод значение массива
	 System.out.print(" " + test[i]);
	 
 }
System.out.println();// ,более короткий способ
for (int i:test) {
	System.out.print(" "+ i);
}

int[] testCopy = new  int[test.length+1]; // создание массива +1 ячейка
for (int i=0; i<test.length;i++)
{
{testCopy[i]=test[i];// копирование массива
testCopy[3]=55;;//  знаечение нов ячей
;}

	}

System.out.println();

	for(int j:testCopy) {
		System.out.println("Новый скопированный массив" + " "+ j );}}

// отключенно до сюда
	ArrayList <String> testArray=new ArrayList<>();
	testArray.add("Жопа");
	testArray.add("OPA");
	testArray.add("HERA");
	testArray.add("hello");//добавляем в последний индекс
	//System.out.println("вывод кол-ва массива Арройлист" + " " + testArray.size());
	testArray.add(0,"hello меня вставили на 1 место");
	//for (String s:testArray) 
	//System.out.println(s);
	
	if (a==1) {System.out.println("номер индекса Жопа" + " " + testArray.indexOf("Жопа"));
	System.out.println("номер индекса Опа" + " " + testArray.indexOf("OPA"));// 
	System.out.println("номер индекса Опа" + " " + testArray.contains("OPA"));
	testArray.set(2, "zamena"); // устанавливаем  на второй индекс 
	System.out.println("номер индекса Опа" + " " + testArray.get(2));
	for (String d:testArray) {
		System.out.println(d);
	}
	System.out.println();
	testArray.remove(0);//Удаляем по индексу
	testArray.remove("hello"); //удаляем по названию
	//testArray.remove(1555);
	System.out.println();
	for (String d:testArray) {
		System.out.println(d);
	}}
	// тут продолжение , используем только аррой лист и экпереминтируем с другими методами
	
	ArrayList <String> test2=new ArrayList<>(); // создание нового листа
	test2.addAll(testArray);  // копирование всего листа
	test2.addAll(1,testArray);// еще одно копирование но с 1 похиции
	System.out.println();
	System.out.print(" "+ testArray);
	System.out.println();
	System.out.print(" "+ test2);
	//@SuppressWarnings("unchecked")
	ArrayList<String> test3=(ArrayList<String>) test2.clone(); // полное копирование обьекта
	test2.clear();//удаляем все из тест2
	System.out.println();
	System.out.print(test2);
	System.out.println();
	System.out.print(test3);
	System.out.println(test3.get(1));
	System.out.println("номер индекса HEra"+test3.indexOf("HERA"));
	test3.set(4, "1111");
	
	System.out.println();
	System.out.println(test3.get(4));
	
	int b = Integer.parseInt(test3.get(4));
	System.out.println("Проверяем как найдутся цифры в строке"+ " "+ b);// выводит только если нету букв
	// выводим тест через forEach
	test3.forEach (new Consumer<String>() {
	//	@Override
	public void accept(String s) {System.out.print(s.toLowerCase());}	 //походу ввыводит все в одну строку, выводит все но, без пробелов и не красиво
	});
	System.out.println();
	System.out.println(test2.isEmpty());// проверка пустой лист или нет
	System.out.println(test3.lastIndexOf("1111"));
	test3.remove(1);
	test3.remove("Жопа");
	System.out.println(test3.size());
	System.out.println(test2.size());
	System.out.println(testArray.size());
	
	
	String [] test5= new String[test3.size()];//опредиляем размер массива
	test3.toArray(test5);// переводим из листа в массиы
	System.out.println("dlinna"+test5.length);
	for (int i =0; i<test5.length; i++) {
		System.out.println(test5[i]);
	}
	test3.trimToSize();
	String text="weqweqweqwef\n" + "asdadasd\n";
	System.out.println(text);
	}}




