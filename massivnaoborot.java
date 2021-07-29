import java.util.Arrays;

public class massivnaoborot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] test = {1,2,3,4,5,6,7,8,9};
String []test2= {"Dima", "HEr","sdd"};
System.out.println("Изначальный массив чисел" + Arrays.toString(test));
for (int i=0; i<test.length/2; i++) {
	int temp;
	temp=test[test.length-i-1];
	test[test.length-i-1]=test[i];
	test[i]=temp;
	
}


System.out.println("массив чисел" + Arrays.toString(test));

System.out.println("массив 1" + Arrays.toString(test2));
for (int i=0; i<test2.length/2; i++) {
	String temp;
	temp=test2[test2.length-i-1];
	test2[test2.length-i-1]=test2[i];
	test2[i]=temp;
	
}

System.out.println("массив 1" + Arrays.toString(test2));
	}

}
