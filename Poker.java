import java.util.Scanner;
import java.util.*;

public class Poker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] Suit = {"Червы", "Кресте", "БУбне", "пике"};//  массив мастей	
String [] Deck = { "2", "3","4", "5", "6", "7", "8","9","10","Tuz","Korol","Dama","valet"};// массив тип карт
int people= getPeople();// кол-во играков	
int cardPlayer=5;//колво какрт необходимых для игры
int cards=Suit.length*Deck.length;
System.out.print(people);
// создание колоды кард
String[] cardsDeck=new String[cards];
for (int i=0; i<Suit.length; i++) {
	for(int j =0; j<Deck.length;j++) {
		cardsDeck[Deck.length*i+j]=Suit[i] + " " + Deck[j];//ищначально И=0, поэтому записывается в 0 ячейууц массива, так как Джи равно 0 и так далее до конца Джи, заметм умнажается на И равно 1 и  так далее
	}
}
System.out.println("Получилась колода:   "+Arrays.toString(cardsDeck));
//попробуем перемещать карти

for (int i=0; i<cards;i++) {
	int r=(int)(Math.random()*(cards-1));
	String temp=cardsDeck[r];
	cardsDeck[r]=cardsDeck[i];
	cardsDeck[i]=temp;
	
}
	
System.out.println("Получилась перетосованная колода:   "+Arrays.toString(cardsDeck));
	
	for (int i = 0; i<people*5; i++){
		System.out.print(cardsDeck[i]+" ");
		if ((i+1)%5==0) {System.out.println();}
		
	}// 
	
	
	}

	public static int getPeople() {
		System.out.println("Введите число играков от 1 до 10:");
		Scanner scan=new Scanner(System.in);
		if(scan.hasNextInt()) {
			int temp =scan.nextInt();
			if (temp<=10&temp>=1) {return temp;}
			else {System.out.println("Вы ввели   число  не 1 -10");
			return getPeople();}
		}
	
		else {
			System.out.println("Вы ввели не число");
			return getPeople();}
		
	}
		
// TODO Auto-generated method stub
		
	}

