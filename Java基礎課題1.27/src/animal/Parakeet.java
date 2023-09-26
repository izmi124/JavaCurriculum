package animal;

//Animalクラスを継承してサブクラスを作成する
public class Parakeet extends Animal {

	/*抽象メソッドをオーバーライドする*/

	// nameの値に"インコ"を返す
	public String name() {
		return "インコ";
	}

	// sizeの値に0.1を返す
	public double size() {
		return 0.1;
	}

	// speedの値に50を返す
	public int speed() {
		return 50;
	}

	// scientificNameの値に"不明"を返す
	public String scientificName() {
		return "不明";
	}

}
