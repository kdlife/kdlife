import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class testenum {
String name;// обьявляем переменные
int age;
String proff;
String country;
double salary;
//делаем контсруктор для обьекта класса
public testenum (String name, int age,String proff, String country, double salary) {
	this.name=name; // зис указывет на переменную в начале класса
	this.age=age;
	this.proff=proff;
	this.country=country;
	this.salary=salary;
	System.out.println("tyt"+this.age+" "+this.country);// выводит все значения обьеков
}
 enum MyName{// создаем перечень обьектов
	DIMA(55){
		@Override
		void voise(){
			System.out.println("Hello");
		}
	},// имена обьектов через запяту, последняя точна запятая
	VAS(32){
		@Override
		void voise(){
			System.out.println("Hello1");
		}},
	IGOR{
		@Override
		void voise(){
			System.out.println("Hello2");
		}},
	PETR{
		@Override
		void voise(){
			System.out.println("Hello3");
		}},
		
	HER	{
		@Override
		void voise(){
			System.out.println("Hello4");
		}};
	int ages;
	MyName ( int ages){// конструктор для енум, такой де как для обьекта
		this.ages=ages;
	}
	MyName(){}; // пустой конструкто для енум
	boolean hasAges () {
		return ages!=0;
	}
	
	abstract void voise();
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
testenum men=new testenum("HER", 55, "director", "Belarus",556.0);// создаем обьект мен
testenum men2=new testenum("HER1", 551, "director1", "Belarus",556.0);
System.out.println(men.age+" "+men.country);
System.out.println(men2.age+" "+men2.country);
men2.age=50;
System.out.println(men2.age+" "+men2.country);
System.out.println();
System.out.println();
System.out.println(MyName.DIMA);// выводит имя оьека
for (MyName test : MyName.values()) {// фор ич для перечньня выводит все названия перечня
	test.voise();
	if(test.hasAges()) {System.out.println("тут есть агес  " + test +" ,"+ test.ages);}
	else {System.out.println("тут нет агес  "+ test); }
}
System.out.println();
System.out.println();
MyName test=MyName.DIMA; // свитч касе для перечня
switch (test) {
case DIMA: System.out.println("Словили ДИМА"); break;
case IGOR: System.out.println("Словили IGOR"); break;
default : System.out.println("ничего не словили");


}

System.out.println();
System.out.println();
System.out.println(MyName.DIMA.name());// выводит имя обьекта в перечне ДИМа
System.out.println(MyName.DIMA.ordinal()); //выводтт порядковый номер  обьекта в перечне
int hash1=MyName.DIMA.hashCode();
int hash2=MyName.IGOR.hashCode();
System.out.println(hash1);
System.out.println(hash2);

System.out.println();
System.out.println();
boolean test3=MyName.DIMA.equals(MyName.DIMA);
boolean test4=MyName.DIMA.equals(MyName.IGOR);
System.out.println("Сравниваем поDIMA.equals(MyName.DIMA) "+test3);
System.out.println("Сравниваем MyName.DIMA.equals(MyName.IGOR); " + test4);


System.out.println();
System.out.println();
String test5=MyName.DIMA.toString();
System.out.println("создание стринг, затем вывод  MyName.DIMA.toString(); "+test5);
MyName [] testt=MyName.values();
System.out.println("Выыодим список енум чере созданный массив с помощт метота тостринг"+Arrays.toString(testt));
System.out.println("Выводим номер по списку енум MyName.valueOf(\"IGOR\").ordinal "+MyName.valueOf("IGOR").ordinal());// номер по списку
 try {System.out.println(MyName.valueOf("her").ordinal());// если нету то беда ошиба
 }
 catch (Exception xxx){System.out.println(" ТАКОГО НЕТУ  и испытали перехват исключений") ;}
 
 System.out.println("сравнение друх элементов переня и показывает на сколько он ниже отностительно сравнения"+MyName.DIMA.compareTo(MyName.VAS));

 List<MyName> arr= new ArrayList <>(List.of(MyName.DIMA, MyName.IGOR, MyName.VAS));
 
 System.out.println("вывод перечня через аррйо лист" + arr);
 
 Collections.sort(arr);
 
 System.out.println("вывод перечня через аррйо лист после сортировки через коллектионио"+arr);
 //Примеры создания EnumSet что то вроде аррайлист или массива из перечня
 EnumSet<MyName> names=EnumSet.allOf(testenum.MyName.class);// EnumSet.allOf выводит все  обьекты перечня 
 System.out.println("Выыодим EnumSet " + names);
 
 // по другому
 EnumSet.of(MyName.DIMA);
 EnumSet.of(MyName.DIMA, MyName.IGOR, MyName.VAS);
 System.out.println(EnumSet.of(MyName.DIMA, MyName.IGOR, MyName.VAS));
 
 EnumSet<MyName> prome= EnumSet.range(MyName.DIMA, MyName.HER);
 System.out.println(prome); // выдим EnumSet.range   это все значения в диапазане межжу ...
 EnumSet<MyName> DimaSet= EnumSet.of(MyName.DIMA);
 Set <MyName> IgorSet=Set.of(MyName.HER);
 System.out.println(DimaSet+ " "+ IgorSet);
 EnumSet<MyName> DimaSet2= EnumSet.copyOf(DimaSet);// копируем перечьн
 System.out.println(DimaSet2);
 EnumSet<MyName> Odin= EnumSet.of(MyName.DIMA);
 EnumSet<MyName> Ostalnoe = EnumSet.complementOf(Odin); // выводит все значения перчня кроме того что в методе
 System.out.println(Ostalnoe);
 
 
	}

}
