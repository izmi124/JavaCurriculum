package executelion;

// processlionパッケージをインポートする
import processlion.Processlion;

public class Executelion {

	public static void main(String[] args) {

		// インスタンスを生成する
		Processlion lion = new Processlion();

		// 変数nameに"ライオン"を代入する
		String name = "ライオン";
		// 変数sizeに2.1を代入する
		double size = 2.1;
		// 変数speedに80を代入する
		int speed = 80;

		// setNameメソッドにnameの値を代入する
		lion.setName(name);
		// setSizaメソッドにsizeの値を代入する
		lion.setSize(size);
		// setSpeedメソッドにspeedの値を代入する
		lion.setSpeed(speed);

		// getNameメソッドで値を取得してコンソールに出力する
		System.out.println("動物名：" + lion.getName());
		// getSizeメソッドで値を取得してコンソールに出力する
		System.out.println("体長：" + lion.getSize() + "m");
		// getSpeedメソッドで値を取得してコンソールに出力する
		System.out.println("速度：" + lion.getSpeed() + "km/h");
	}

}
