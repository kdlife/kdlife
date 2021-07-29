public class testVector {
private	double x;// тут все понятно, обьявляются 3 перевемнные
private	double y;
private double z;
double cos;
	double koren;// созддаем переменню вычисляющею кореь koren= Math.sqrt(x*x+y*y+z*z);
	double scalmul;// создаем переменную вычисляющкк скаоярное произведение scalmul=x*vector.x+y*vector.y+z*vector.z;
	testVector (double x,double y, double z){ // конструктор обьекта тествектор
		this.x=x;
		this.y=y;
		this.z=z;
		
	}
	public double koren () {
		koren= Math.sqrt(x*x+y*y+z*z);
		return koren;
	}
	public double  scalmul(testVector vector) {// непонятно  как создается вектор
		scalmul=x*vector.x+y*vector.y+z*vector.z;// вектор. переменная это х2, у2 ....
		return scalmul;
	}

	public testVector mulVector(testVector vector) {//
		return new testVector(
				y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
	}
	
    public double cos(testVector vector) {
        // Для вычисления длины и произведения используются
        //методы multiply и length
        return scalmul(vector) / (koren() * vector.koren());
    }
    
    public testVector add(testVector vector) {
        return new testVector(
                x + vector.x,
                y + vector.y,
                z + vector.z
        );
    }

    public testVector subtract(testVector vector) {
        return new testVector(
                x - vector.x,
                y - vector.y,
                z - vector.z
        );
    }
    public static testVector[] generate(int n){
        testVector[] vectors = new testVector[n];// создается новый массив векторс! не вектор
        for(int i =0; i < n; i++){
            vectors[i] = new testVector(Math.random()*100, Math.random()*100, Math.random()*100);
        }
        return vectors;
    }

    //@Override// переопредляем  метод для последующего вывода в строку значение векторс,  честно говоря работает из ьез него
    public String toString() {//определен специальный метод toString(), возвращающий символьную строку описывающую объект.иначе выводит не значение адресс обьекта
        return "Vector{" +
                " в ковыычках текск x=" + x +
                ", y=" + y +
               ", z=" + z +
               '}';
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 testVector[] vectors = testVector.generate(4);
	        System.out.println(vectors[0]);
	        System.out.println(vectors[1]);
	        System.out.println(vectors[2]);
	        System.out.println(vectors[3]);
	        System.out.println(vectors[0].koren());
	        System.out.println(vectors[0].scalmul(vectors[1]));
	        System.out.println(vectors[0].mulVector(vectors[1]));
	        System.out.println(vectors[0].cos(vectors[1]));
	        System.out.println(vectors[0].add(vectors[1]));
	        System.out.println(vectors[0].subtract(vectors[1]));
	       
	    }
	}


