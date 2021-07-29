
public class testAbstract {
public static abstract class Animal 

{
	private String name;
	private  String color;
	private  int age;
	
	public String getName() {return name;}
	public String getColor() {return color;}
	public int getAge() {return age;}
	
	public void setName(String name) {this.name=name;}
	public void setColor(String color) {this.color=color;}
	public void setAge(int age) {this.age=age;}
	
	Animal (String name, String color, int age){
		this.name=name;
		this.color=color;
		this.age=age;
	}
	
	abstract void voise();
	public void info() {
		System.out.println("Имя:"+getName()+"Color:"+ getColor()+" Age "+ getAge() );
	}
	
};
public static class Cat extends Animal {
 
	
	Cat(String name, String color, int age) {
		super(name, color, age);
		// TODO Auto-generated constructor stub
	}

	
	

	
	void voise(){  System.out.println("МЯй");
	};
       };
public static class Dog extends Animal
{
	Dog(String name, String color, int age) {
		super(name, color, age);
		// TODO Auto-generated constructor stub
	}

	void voise() 
	{System.out.println("GAV");
	};
	
};

public static class Bird extends Animal 
{
	Bird(String name, String color, int age){
		super(name,color,age);
	}
	void voise() {
		System.out.println("Chik-chiric");
	}

};


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat  cat=new Cat ("Dima","RED",26);
		Dog dog = new Dog("HEr","black", 55);
		Bird bird=new Bird("Chi","rrred",44);
		
		cat.setName("MURSIK");
		cat.info();
		
		cat.voise();
		dog.voise();
		bird.voise();


	}

}
