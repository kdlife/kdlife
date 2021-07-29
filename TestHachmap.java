import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;


class  dima
{  String name;
 
 dima (String name){
	this.name=name;
}
  String getName() {return name;}
	}


public class TestHachmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String, Integer> test = new HashMap <String, Integer>(); // создаем хешмар, ключ  и значение. первый тип это ключ, второй занчение
test.put("Dima", 1988);// создаем пары ключ значение
test.put("Misha", 2018);// создаем пары ключ значение
test.put("Marina", 2013);
test.put("Nadaya", 1984);
System.out.println("Полный набор до удаления");
for (Map.Entry<String, Integer> entry: test.entrySet())// форич для хашмар, создаем переменную entry для послежующего вывода
   {
	System.out.println(entry.getKey()+" ------ "+ entry.getValue());
	
     }
System.out.println();
System.out.println("попробуем получить значение по ключу" + test.get("Dima"));
System.out.println("--------------------------------------------");

test.remove("Dima");// цдаляем занчения по ключу
System.out.println(" набор после удаления");
for (Map.Entry<String, Integer> tt:test.entrySet()){
	System.out.println(tt.getKey()+"---"+tt.getValue());
}

System.out.println("Проверям есть ли ключ Dima --" + test.containsKey("Dima"));
System.out.println("Проверям есть ли ключ Misha --" + test.containsKey("Misha"));
System.out.println("Проверям есть ли значение 1988 --" + test.containsValue(1988));
System.out.println("Проверям есть ли значение 2013 --" + test.containsValue(2013));
System.out.println("узнаем какой размер хашмар --" + test.size());


System.out.println("HASHSET--------------------------");

HashSet <Integer> testSet=new HashSet <Integer>();// создаем множество
testSet.add(10);// добавление элементов в множество
testSet.add(20);
testSet.add(30);
testSet.add(30);
for (int i :testSet) {// форич доя мноества
	System.out.println(i);
}
testSet.remove(20);


System.out.println("удаляем элементы и проверям");


for (int i :testSet) {// форич доя мноества
	System.out.println(i);
}


System.out.println("Проверим есть ли в множечетве элемет 10   --- " + testSet.contains(10));
System.out.println("Проверим есть ли в множечетве элемет 12   --- " + testSet.contains(12));
System.out.println("Проверим  размер   --- " + testSet.size());

testSet.clear();

System.out.println("удалим все   --- " + testSet.size()+" проверим пустой ли ----" + testSet.isEmpty());


System.out.println("ТУТ очередь Queue");

ArrayDeque<Integer> testQueue=new ArrayDeque<Integer>(); // ArrayDeque добавляет элементы в порядке очередности в отличие от PriopityQueue,  так же более современныя и фунукцианальная
ArrayDeque<dima> carDeque=new ArrayDeque<dima>();
carDeque.addFirst(new dima("Ferari"));
carDeque.addLast(new dima("BMW"));
carDeque.add(new dima("HER!"));
carDeque.addFirst(new dima("last"));

for (dima dd:carDeque) {System.out.println("пробуем вывести "+dd.getName());}



testQueue.add(12);
testQueue.add(65);

testQueue.add(21);
testQueue.add(2231);
testQueue.add(1);
testQueue.offer(155);
testQueue.offer(15222);
testQueue.offer(2);
testQueue.offer(5);
testQueue.addFirst(1000);
testQueue.addLast(2000);
for (int qq:testQueue) {
	System.out.println(qq);
}
System.out.println("Пробуем просмотреть верхний Элемегнт" +testQueue.peek());
System.out.println("Пробуем просмотреть верхний Элемегнт" +testQueue.element());




	}

}
