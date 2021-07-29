import java.util.*;
public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=3;
int [][]test=new int[n][n];
for (int i=0; i<test.length;i++) {
	for(int j=0; j<test[i].length;j++) {
		test[i][j]=test.length*i+j;
	}
}
//System.out.println(Arrays.toString(test));
Arrays.stream(test).map(Arrays::toString).forEach(System.out::println);// нашел в интернете еще не понимаю, но выводит красиво
System.out.println("-------------------------------");
System.out.println("попробуем повернуть матрицу");
for (int i=0; i<test.length;i++) {
	for(int j=i+1; j<test[i].length;j++) {// тут важно j=i+1 иначе не повернется
		int temp=test[i][j];
		test[i][j]=test[j][i];
		test[j][i]=temp;
		
	}
}

Arrays.stream(test).map(Arrays::toString).forEach(System.out::println);
	}

}
