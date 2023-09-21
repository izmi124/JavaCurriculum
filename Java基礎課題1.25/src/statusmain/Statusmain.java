package statusmain;

// 使用するクラスを宣言する
import java.util.Random;
import java.util.Scanner;

// statusprocessパッケージのStatusprocess2クラスをインポートする
import statusprocess.Statusprocess2;

public class Statusmain {

	public static void main(String[] args) {

		// Randomクラスのインスタンスを生成する
		Random rand = new Random();

		// 乱数を必要数取得する
		int hp = rand.nextInt(1000) + 1;
		int mp = rand.nextInt(1000) + 1;
		int atk = rand.nextInt(1000) + 1;
		int agi = rand.nextInt(1000) + 1;
		int def = rand.nextInt(1000) + 1;

		// Statusprocess2クラスのインスタンスを生成する
		Statusprocess2 st = new Statusprocess2(hp, mp, atk, agi, def);

		// Scannerクラスのインスタンスを生成する
		Scanner scan = new Scanner(System.in);
		// 入力値を取得する
		String adventurer = scan.nextLine();

		// メッセージ文を表示する
		System.out.println("こんにちは 「 " + adventurer + " 」 さん");
		// statusメソッドを表示する
		st.status();

		// scanを閉じる
		scan.close();

	}

}
