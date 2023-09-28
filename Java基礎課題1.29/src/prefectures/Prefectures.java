package prefectures;

public class Prefectures {
	// フィールド変数を必要数定義する
	private String name;
	private String city;
	private double area;

	// 引数ありのコンストラクタを作成
	public Prefectures(String name, String city, double area) {
		// フィールド変数に引数の値をそれぞれ代入する
		this.name = name;
		this.city = city;
		this.area = area;
	}

	// インスタンスメソッドを作成
	public void disp() {
		// メッセージ文を表示
		System.out.println("都道府県名：" + this.name);
		System.out.println("県庁所在地：" + this.city);
		System.out.println("面積：" + this.area + "km2");
	}

}
