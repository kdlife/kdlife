import java.io.*;
import java.util.Scanner;
public class TestFile {

	public static void main(String[] args) throws Exception{//throws Exception обязательно для работы с филе ридер или фритер
		// TODO Auto-generated method stub
 FileWriter fw= new FileWriter("text.txt");
 fw.write("1Test text \n 2 text \n3text");
  fw.close();
 
 FileReader fr = new FileReader("text.txt");
 Scanner scan=new Scanner(fr);
 //int i=1;
 while (scan.hasNextLine()) {
	 
			
 System.out.println( scan.nextLine());

//	i++;
 }
  String c= "11";
	int a =Integer.parseInt(c);
 fr.close();
	scan.close();

	 System.out.println( a);	
	
	}

}
