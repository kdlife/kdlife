
public class fibonach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n0=1;// первые цифра  1 и 1
int n1=1;
int n2;
System.out.print(n0+" "+n1 +" ");
 for ( int i=1; i<=9; i++) {
	 n2=n0+n1; // н2 следующий члеп последовательности
	 System.out.print(n2 + " ");
	 	n0=n1;//сдвиг на следущтй член
	 	n1=n2;
	 
 }
		
		
	 

	}
	;
	
}
