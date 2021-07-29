import java.util.Arrays;

public class minmax3 {

	public static void main(String[] args) {
	int [] a=new int[4];
	int max=-100;
	int index=0;// TODO Auto-generated method stub
	for (int i = 0; i<a.length; i++) {
		a[i]=(int)(Math.random()*30);
	}
System.out.println(Arrays.toString(a));
for (int i=0; i< a.length;i++) {
	if(a[i]>max) {max=a[i];
			index=i;}
	
}
System.out.println(max+" "+index);

/// пробуем заменить все нечетные на 0
//for (int i=0; i< a.length;i++) {
//	if(i%2==1) {a[i]=0;}
//	}
//System.out.println(Arrays.toString(a));


// пробуем провериь возрастающая последовательно или нет
boolean ok=true;
for (int i=1; i< a.length;i++) {
	//boolean ok=true;
	if(a[i]<=a[i-1]) {ok=false; break;}
	
	}
if (ok) {System.out.println("Все ок поледовать возраст");}
else {System.out.println("Все NOT поледовать возраст");}
}
}
