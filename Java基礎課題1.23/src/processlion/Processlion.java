package processlion;

public class Processlion {

	// フィールド変数を必要数作成する
	private String name;
	private double size;
	private int speed;

	// ゲッターメソッドを作成する
	public String getName() {
		// フィールド変数nameに値を返す
		return this.name;
	}

	// ゲッターメソッドを作成する
	public double getSize() {
		// フィールド変数sizeに値を返す
		return this.size;
	}

	// ゲッターメソッドを作成する
	public int getSpeed() {
		// フィールド変数speedに値を返す
		return this.speed;
	}

	// セッターメソッドを作成する
	public void setName(String name) {
		// 引数の値をフィールド変数nameに代入する
		this.name = name;
	}

	// セッターメソッドを作成する
	public void setSize(double size) {
		// 引数の値をフィールド変数sizeに代入する
		this.size = size;
	}

	// セッターメソッドを作成する
	public void setSpeed(int speed) {
		// 引数の値をフィールド変数speedに代入する
		this.speed = speed;
	}

}
