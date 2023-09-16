package process;

public class Process {

	// フィールド変数を必要数作成
	public String country;
	public String taste;
	public String food;

	// String型の引数ありでコンストラクタを作成
	public Process(String country, String taste, String food) {
		// フィールド変数に引数の値を代入する
		this.country = country;
		this.taste = taste;
		this.food = food;
	}

}
