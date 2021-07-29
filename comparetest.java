//import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;



class copmName implements Comparator <comparetest>{
	public int compare (comparetest a, comparetest b) {
		return a.getName().compareTo(b.getName());
	}}


class copmAge implements Comparator <comparetest>{
	public int compare (comparetest a, comparetest b) { if (a.getAge()==b.getAge()) { return 0;}
	else if (a.getAge()<b.getAge()) {return -1;}
	else {return 1;}
	}}



public class comparetest  implements Comparable <comparetest> {// для сравнения лбьект
   private	String name;
   private  String position;
   private int salary;
   private int age;
    public   comparetest (String name, String position, int salary, int age){
	   this.name=name;
	   this.position=position;
	   this.salary=salary;
	   this.age=age;     
   }
	
   public void setName(String name) {
	   this.name=name;
	      }
	public void setPosition(String position) {
		this.position=position;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public String getPosition() {
		return position;}
	
	public int getSalary() {
		return salary;}
	public int getAge() {
		return age;}
	
	@Override
	public String toString() {// преобразуем обект в строку
		final StringBuilder sb=new StringBuilder("comparetest");// создаем сторку с динамическим увеличениме
		sb.append("Имя : ").append(name);
		sb.append(",   Posit   ").append(position);
		sb.append(", Salar   ").append(salary);
		sb.append(",   Age   ").append(age);// аппент приклееваем в конеч что нало
		
		return sb.toString();
	}
	public int compareTo (comparetest comparetest2)// спавниваем обьекты, ,без этого класс будет выдовать ошибку
	{ if (this.salary==comparetest2.salary) { return 0;}
	else if (this.salary<comparetest2.salary) {return -1;}
	else {return 1;}
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
comparetest first=new comparetest("Karpovich", "director", 10000,35);
comparetest second = new comparetest ("Karasey","boss",8000,33);
comparetest three = new comparetest("Kata","zam",60000,36);
comparetest four = new comparetest("Krrrata","zam",60000,36);
comparetest five = new comparetest("Koooata","zam",60000,555);
comparetest six = new comparetest("Dima","zam",60000,555);
comparetest seven = new comparetest("Dima","zam",60000,5577);
comparetest eight = new comparetest("Dima","zam",60000,55588);
Comparator <comparetest> com=new copmName().thenComparing(new copmAge());
TreeSet <comparetest> arr=new TreeSet<comparetest>(com);
ArrayList <comparetest> arrr=new ArrayList<comparetest>();


arr.add(six);
arr.add(second);
arr.add(three);
arr.add(first);
arr.add(four);
arr.add(five);
arr.add(seven);
arr.add(eight);

arrr.add(six);
arrr.add(second);
arrr.add(three);
arrr.add(first);
arrr.add(four);
arrr.add(five);
arrr.add(seven);
arrr.add(eight);
arrr.sort(com);

System.out.println(" размер мнодества"+arr.size());

for (comparetest d: arr) {System.out.println (d);}

System.out.println(" размер мнодества arrr"+arrr.size());

for (comparetest d: arrr) {System.out.println (d);}

	}

}
