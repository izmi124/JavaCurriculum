package basicClass;

// 使用するクラスの宣言をする
import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。

		// インスタンスを生成する
		Dog dog = new Dog();
		// コンソールに出力する
		System.out.println(dog.bichon);

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。

		// インスタンスを生成する
		Dog num = new Dog(2);
		// コンソールに出力する
		System.out.println(num.dogNum);

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください

		// 現在時刻を取得する
		Date time = new Date();
		// フォーマットを指定する
		SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		// コンソールに出力する
		System.out.println(dayFormat.format(time));
	}
}
