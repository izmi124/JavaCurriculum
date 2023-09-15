package basicClass;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。

	// 変数bichonを定義
	String bichon;

	// Q2：フィールドに動物の数の変数を定義してください。

	// 変数dogNumを定義
	int dogNum;

	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。

	// 引数なしでコンストラクタを作成
	public Dog() {
		// 変数bichonに犬を代入
		bichon = "犬";
	}

	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。

	// int型の引数ありでコンストラクタを作成
	public Dog(int num) {
		// 変数dogNumに引数の値を代入
		dogNum = num;
	}

}
