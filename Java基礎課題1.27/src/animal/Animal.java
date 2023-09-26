package animal;

// 抽象クラスを作成する
abstract class Animal {
	// dispメソッドを作成する
	public void disp() {
		// メッセージ文を表示
		System.out.println("動物名：" + name());
		System.out.println("体長：" + size() + "m");
		System.out.println("速度：" + speed() + "km/h");
		System.out.println("学名：" + scientificName());
		System.out.println();
	}

	// 抽象メソッドを必要数作成する
	public abstract String name();

	public abstract double size();

	public abstract int speed();

	public abstract String scientificName();

}
