package animal;

//Animalクラスを継承してサブクラスを作成する
public class Elephant extends Animal {

	/*抽象メソッドをオーバーライドする*/

	// nameの値に"ゾウ"を返す
	public String name() {
		return "ゾウ";
	}

	// sizeの値に3.2を返す
	public double size() {
		return 3.2;
	}

	// speedの値に40を返す
	public int speed() {
		return 40;
	}

	// scientificNameの値に"ロキソドンタ・サイクロティス"を返す
	public String scientificName() {
		return "ロキソドンタ・サイクロティス";
	}

}
