package animal;

//Animalクラスを継承してサブクラスを作成する
public class Panda extends Animal {

	/*抽象メソッドをオーバーライドする*/

	// nameの値に"パンダ"を返す
	public String name() {
		return "パンダ";
	}

	// sizeの値に1.9を返す
	public double size() {
		return 1.9;
	}

	// speedの値に30を返す
	public int speed() {
		return 30;
	}

	// scientificNameの値に"アイルロポダ・メラノレウカ"を返す
	public String scientificName() {
		return "アイルロポダ・メラノレウカ";
	}

}
