package link;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		person1.print();

		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		person2.print();

		Person.printCount();
		
		// 問4-1 「setOwner」で「Car」クラスのインスタンス「car」の所有者の名前を「person1」の名前でセット
		Car car = new Car();
		car.setOwner(person1.fullName());
		
		// 問4-2 「setOwner」で「Bicycle」クラスのインスタンス「bicycle」の所有者の名前を「person2」の名前でセット
		Bicycle bicycle = new Bicycle();
		bicycle.setOwner(person2.fullName());
		
		// 問5 コンソールに「owner」を出力
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());
		
		// 問10 「buy」メソッドを使用して「person1」がcar、「person2」がbicycleを購入するプログラムを作成
		person1.buy(car);
		person2.buy(bicycle);

	}

}
