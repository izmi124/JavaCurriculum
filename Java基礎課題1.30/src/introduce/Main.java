package introduce;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 問5 weightに値をいれる
		Person person1 = new Person("鈴木太郎",20,1.7,60.0);
		
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);
		
		// 問9 インスタンスメソッド「print」を出力
		person1.print();
		
		// 問10 人数の合計を出力
		System.out.println("合計" + 1 + "人です");

	}

}
