package animalencyclopedia;

// 使用するクラスを宣言する
import java.util.Objects;
import java.util.Scanner;

// animalパッケージをインポートする
import animal.Chimpanzee;
import animal.Elephant;
import animal.Lion;
import animal.Panda;
import animal.Parakeet;
import animal.Zebra;

public class AnimalEncyclopedia {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// メッセージ文を表示
		System.out.println("コンソールに文字を入力してください");

		// スキャナーのオブジェクトを作成する
		Scanner scan = new Scanner(System.in);

		// 入力値を配列にして代入する
		String[] animals = scan.nextLine().split(",");

		// もしnullが代入されていた場合
		if (Objects.isNull(animals)) {
			// メッセージ文を表示
			System.out.println("nullです");
			// スキャナーを閉じる
			scan.close();
			// 処理を中断する
			return;
		}

		// 配列の分ループする
		for (String i : animals) {

			// 変数iの値で処理を分岐させる
			switch (i) {

			// "ライオン:2.1:80"の場合
			case "ライオン:2.1:80":
				// Lionクラスのオブジェクトを生成する
				Lion lion = new Lion();
				// dispメソッドを呼出し
				lion.disp();
				// 処理をとめる
				break;

			// "ゾウ:3.2:40"の場合
			case "ゾウ:3.2:40":
				// Elephantクラスのオブジェクトを生成する
				Elephant elephant = new Elephant();
				// dispメソッドを呼出し
				elephant.disp();
				// 処理をとめる
				break;

			// "パンダ:1.9:30"の場合
			case "パンダ:1.9:30":
				// Pandaクラスのオブジェクトを生成する
				Panda panda = new Panda();
				// dispメソッドを呼出し
				panda.disp();
				// 処理をとめる
				break;

			// "チンパンジー:0.94:25"の場合
			case "チンパンジー:0.94:25":
				// Chimpanzeeクラスのオブジェクトを生成する
				Chimpanzee chimpanzee = new Chimpanzee();
				// dispメソッドを呼出し
				chimpanzee.disp();
				// 処理をとめる
				break;

			// "シマウマ:2.4:65"の場合
			case "シマウマ:2.4:65":
				// zebraクラスのオブジェクトを生成する
				Zebra zebra = new Zebra();
				// dispメソッドを呼出し
				zebra.disp();
				// 処理をとめる
				break;

			// "インコ:0.1:50"の場合
			case "インコ:0.1:50":
				// Parakeetクラスのオブジェクトを生成する
				Parakeet parakeet = new Parakeet();
				// dispメソッドを呼出し
				parakeet.disp();
			}

			// スキャナーを閉じる
			scan.close();

		}

	}

}
