
public  class car {
private String name;
private String color;
private int cost;
private int maxSpeed;

car (){
	this("понятно, если ничего не заданно, то  принять этот текст за  значение первого парамета ");
}
car (String name){
	this(name, "not aaaa");// такая форма записи подрузумеваем то что второй параметр будет присвоен нотааа
}	
	car (String color, String name){
		this.color=color;
		this.name=name;
		
	}
	car (String color,String name, int cost){
		this.color=color;
		this.name=name;
		this.cost=cost;
	}
	car (String color,String name, int cost, int maxSpeed){
		this.color=color;
		this.name=name;
		this.cost=cost;
		this.maxSpeed=maxSpeed;
	}
	public String getColor() {
		return color;
	}
	
	public String getName() {
		return name;
	}
	public int getCost() {
	return cost;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
		}
	
	public void setColor(String color) {
		this.color=color;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setCost(int cost) {
		this.cost=cost;
	}
	public void setMaxSpeed(int maxSpeed) {
	this.maxSpeed=maxSpeed;
	}
	
	public void info() {
		System.out.println("color : " + color + "name :" + name + "  Cost: "+ cost+ "  max Speed " + maxSpeed);
	}
	
static	class moto extends car { // класс должен быть статик иначе не создается обьект мото
		public  String marka;
		
		
		public moto (String color,String name, int cost, int maxSpeed, String marka) {
			super(color,name,cost,maxSpeed);
				//	this.color=color;
				//	this.name=name;
				//	this.cost=cost;
				//	this.maxSpeed=maxSpeed;
								this.marka=marka;}
		public moto() {};
								
		public void setmarka(String marka) {
			this.marka=marka;
		}
		 
	 public String getMarka() {
		 return marka;
	 }
	
		
		@Override
		public void info() {
			super.info();
			System.out.println("Я заменил метот инфо в наследуемом методе мото просто на строку" + marka);
			
		}}
	
	
	
	public static void main (String[] args) {
		car car=new car();
		car.setColor("RED");
		car.setName("Ferrari");
		car.setCost(15000);
		car.setMaxSpeed(200);
		car.info();
		
		car car2=new car("BLACK","MERS",50000,600);
		car2.info();
		
		car car3=new car("mers");
		car3.info();
		
		car car4=new car();
	 car4.setName("FORDD");
		car4.info();
	//	car car6=new car();
	
		moto motor=new moto("BLACK111","MERS11",50000,600," HArlr");
	
		motor.info();
		motor.setColor("YELLOW");
		System.out.println(motor.getColor());
	}
}
