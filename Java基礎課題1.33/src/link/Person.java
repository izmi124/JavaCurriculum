package link;

public class Person {
	
	public static int count = 0;
	public String firstName;
	public int age;
	public double height, weight;
	public String lastName;

	Person(String firstName, int age, double height, double weight) {
		Person.count++;
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	Person(String firstName, String lastName, int age, double height, double weight) {
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++;
		this.lastName = lastName;
	}

	public String fullName() {
		return this.firstName + this.lastName;
	}

	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
	
	// 問6 インスタンスメソッド「buy」を定義
	public void buy(Car car) {
		// 問7 「setOwner」とインスタンスメソッドを使って名前を取得
		car.setOwner(this.fullName());
		// 問8 コンソールにメッセージ文を出力
		System.out.println(car.getOwner() + "が購入しました");
	}
	
	// 問9 引数の型を「Bicycle」に変えて「buy」メソッドを定義
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}

}
