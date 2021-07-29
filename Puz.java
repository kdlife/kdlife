import java.util.Arrays;

public class Puz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] test= new int[10];
for (int i = 0; i<test.length; i++) {
	test [i]=(int) (Math.random()*100);
}
System.out.println(Arrays.toString(test));
	

	for (int i=0; i<test.length; i++) 
	{
		for (int j=0; j<test.length-1 ;j++) 
		{
			if(test[j]>test[j+1])
			{
			int temp=test[j];
			test[j]=test[j+1];
			test[j+1]=temp;}
			
		}
	}
	System.out.println(Arrays.toString(test));

		
	}}
	

