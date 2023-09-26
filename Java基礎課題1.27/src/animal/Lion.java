package animal;

// Animalクラスを継承してサブクラスを作成する
public class Lion extends Animal {

	/*抽象メソッドをオーバーライドする*/

	// nameの値に"ライオン"を返す
	public String name() {
		return "ライオン";
	}

	// sizeの値に2.1を返す
	public double size() {
		return 2.1;
	}

	// speedの値に80を返す
	public int speed() {
		return 80;
	}

	// scientificNameの値に"パンテラ レオ"を返す
	public String scientificName() {
		return "パンテラ レオ";
	}

}
