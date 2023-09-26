package animal;

//Animalクラスを継承してサブクラスを作成する
public class Zebra extends Animal {

	/*抽象メソッドをオーバーライドする*/

	// nameの値に"シマウマ"を返す
	public String name() {
		return "シマウマ";
	}

	// sizeの値に2.4を返す
	public double size() {
		return 2.4;
	}

	// speedの値に65を返す
	public int speed() {
		return 65;
	}

	// scientificNameの値に"チャップマンシマウマ"を返す
	public String scientificName() {
		return "チャップマンシマウマ";
	}

}
