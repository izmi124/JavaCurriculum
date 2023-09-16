package execute;

// 使用するクラスの宣言をする
import java.text.SimpleDateFormat;
import java.util.Date;

// processパッケージをインポートする
import process.Process;

public class Execute {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// インスタンスを生成する
		Process test = new Process("こんにちは！ここは日本です！", "この寿司はうまい", "寿司は和食です");

		// コンソールに出力する
		System.out.println(test.country);
		System.out.println(test.taste);
		System.out.println(test.food);

		// 現在時刻を取得する
		Date time = new Date();

		// フォーマットを指定する
		SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy/MM/dd H:m:s");
		// コンソールに出力する
		System.out.println("今の現在日時は" + (dayFormat.format(time)) + "です");
	}

}
