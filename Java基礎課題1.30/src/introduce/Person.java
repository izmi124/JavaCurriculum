package introduce;

public class Person {
	// インスタンスフィールドを定義
	// 問1 インスタンスフィールドの定義
	public String name;
	public int age;
	public double height;
	
	// 問4-1 インスタンスフィールド「weight」を定義
	public double weight;
	

	// コンストラクタを定義しインスタンスフィールドに値をセット
	// 問2 コンストラクタを引数ありで定義
	Person(String name, int age, double height, double weight) {
		// 問3・問4-2 コンストラクタ内でインスタンスフィールドに値をセット
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// 問6 インスタンスメソッド「bmi」を定義
	public double bmi() {
		// 問7 BMIの値を戻り値に返す
		return (int)this.weight / (this.height * this.height);
	}
	
	// 問8 インスタンスメソッド「print」を定義
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + Math.floor(bmi()) + "です");
	}

}
