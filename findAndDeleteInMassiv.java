import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;



public class findAndDeleteInMassiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("ВВедите размер массива");
		int sizeM= scan.nextInt();
		System.out.println("ВВедите значения массива в кол-ве" + sizeM);
		int [] test= new int[sizeM];
		for (int i=0; i<test.length;i++) {test[i]=scan.nextInt();}
		System.out.println("Введен массив значение" + Arrays.toString(test));
		System.out.println("Введен массив значение еоторе необходимо удалить" );
		int del= scan.nextInt();
		int count=0;
		for (int i=0; i<test.length;i++) {if(test[i]==del) count++;}
		System.out.println("найденно элементов" + count);
		int[] test2=new int[test.length-count];
		for (int i=0, j=0;i<test.length;i++){ {
			if(test[i]!=del) {test2[j]=test[i];
			j++;
			}
		}}
		System.out.println("Новый массив" + Arrays.toString(test2));

	}

}
