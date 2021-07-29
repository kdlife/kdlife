import java.math.*;
public class nexttest {// попробуем изучить двухмерные массива

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double [] [] testarr=new double [5][5];// создание массива 5на 5
testarr[0][0]=7;
testarr[0][1]=5;
testarr[0][2]=42;
testarr[1][1]=100;
for (int i=0; i<testarr.length; i++) {
	for(int j=0; j<testarr[i].length; j++) {
		testarr[i][j]=Math.round(Math.random()*100);
		System.out.print(testarr[i][j]+ "\t");// \t  это таб
	}
	System.out.println();
}
System.out.println(testarr[0][0]);
	}

}
