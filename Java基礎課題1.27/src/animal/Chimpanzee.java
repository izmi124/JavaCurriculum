package animal;

//Animalクラスを継承してサブクラスを作成する
public class Chimpanzee extends Animal {

	/*抽象メソッドをオーバーライドする*/

	// nameの値に"チンパンジー"を返す
	public String name() {
		return "チンパンジー";
	}

	// sizeの値に0.94を返す
	public double size() {
		return 0.94;
	}

	// speedの値に25を返す
	public int speed() {
		return 25;
	}

	// scientificNameの値に"パン・トゥログロディテス"を返す
	public String scientificName() {
		return "パン・トゥログロディテス";
	}

}
