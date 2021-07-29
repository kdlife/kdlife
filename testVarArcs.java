
public class testVarArcs {
 public static double addAll(double ...test) //  тест это  грубо говоря массяив длиноой сколько бы не задаои
 { 
	 double sum=0;
	 for (int i = 0; i<test.length;i++) {
	 sum = sum+test[i];
	 System.out.println("Складываем "+ test[i]+ " Получаем"+sum);
 }
	return sum; 
 }
 
 

	public static void main(String[] args) {
		testVarArcs ob=new testVarArcs();
		
		System.out.println(ob.addAll(1,5,5,9,9,9));
		// TODO Auto-generated method stub

	}

}
