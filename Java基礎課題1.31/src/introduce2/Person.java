package introduce2;

public class Person {
	public String name;
	public int age;
	public double height;
	public double weight;
	
	// 問1 クラスフィールド「count」を定義
	public static int count = 0;
	
	Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// 問2 コンストラクタの中でクラスフィールド「count」に1を足す
		Person.count ++;
	}
	
	public double bmi() {
		return this.weight / this.height / this.height;
	}
	
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}
	
	// 問4 クラスメソッド「printCount」を定義
	public static void printCount() {
		// 問5 合計人数を表示
		System.out.println("合計" + Person.count + "人です");
	}

}
