
public class Stringsub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String test = "Мама мыла раму1343333331";
String test5 = "1";
String test6 = "1";
Integer test68 =788;
Integer test67=87;
String test2 = "        Мама мыла раму        ";
System.out.println(test.substring(2) );
System.out.println(test.substring(1,10) );// с по
System.out.println(test2);
System.out.println(test2.trim());// обрезание пробелов
String test3= "Проверка враза заканчивается на END";
boolean a= test3.endsWith("END"); // проверка заканчивается ли на енд
boolean b=test3.endsWith("HER");
System.out.println(test3 + a);
System.out.println(test3 + b);
String result=test3.toUpperCase();
System.out.println(result);
String result2=result.toLowerCase();
System.out.println(result2);
//System.out.println("проверка на одинаковость"+ test.equals(test5)  );
//System.out.println("проверка на одинаковость"+ test67.equals(test68)  );// то же не рабоатет с числом
//System.out.println("проверка на одинаковость"+ test.compareTo(test5)  );// тест больше тест 5 на 10 символов
System.out.println("проверка на одинаковость"+ test5.compareTo(test6)  );//ХЗ как работает херня полная
//System.out.println("проверка на одинаковость"+ test67.compareTo(test68));//компарк то не работает с числами

}

}
