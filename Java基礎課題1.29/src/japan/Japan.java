package japan;

// 使用するクラスを宣言する
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

// パッケージをインポートする
import prefectures.Prefectures;

public class Japan {
	public static void main(String[] args) {
		// メッセージ文を表示
		System.out.println("昇順でソートする場合は100、降順でソートする場合は200をコンソールに記述してください");

		// スキャナーのオブジェクトを作成する
		Scanner scan = new Scanner(System.in);

		// 入力値を配列にして代入する
		String[] number = scan.nextLine().split("[^0-9]");

		// もしnullか空文字が代入されていた場合
		if (Objects.isNull(number) || Arrays.asList(number).contains("")) {
			// メッセージ文を表示
			System.out.println("nullか空白です");
			// スキャナーを閉じる
			scan.close();
			// 処理を中断する
			return;
		}

		// 値に100が入力された場合
		if (Arrays.asList(number).contains("100")) {
			// 昇順にソートする
			Arrays.sort(number);
			// 値に200が入力された場合
		} else if (Arrays.asList(number).contains("200")) {
			// 降順にソートする
			Arrays.sort(number, Collections.reverseOrder());
		}

		// number配列の中のString型の整数をint型にする
		int[] num = Stream.of(number).mapToInt(Integer::parseInt).toArray();

		// 配列分ループさせる
		for (int i : num) {
			// 変数iの値で条件分岐させる
			switch (i) {
			// 0の場合
			case 0:
				// クラスのインスタンスを生成して変数に代入
				Prefectures japan0 = new Prefectures("北海道", "札幌市", 83424.0);
				// インスタンスメソッドを呼出し
				japan0.disp();
				// 改行する
				System.out.println();
				// 処理をとめる
				break;
			// 1の場合
			case 1:
				// クラスのインスタンスを生成して変数に代入
				Prefectures japan1 = new Prefectures("青森県", "青森市", 9646.0);
				// インスタンスメソッドを呼出し
				japan1.disp();
				// 改行する
				System.out.println();
				// 処理をとめる
				break;
			// 2の場合
			case 2:
				// クラスのインスタンスを生成して変数に代入
				Prefectures japan2 = new Prefectures("岩手県", "盛岡市", 15275.0);
				// インスタンスメソッドを呼出し
				japan2.disp();
				// 改行する
				System.out.println();
				// 処理をとめる
				break;
			// 3の場合
			case 3:
				// クラスのインスタンスを生成して変数に代入
				Prefectures japan3 = new Prefectures("宮城県", "仙台市", 7282.0);
				// インスタンスメソッドを呼出し
				japan3.disp();
				// 改行する
				System.out.println();
				// 処理をとめる
				break;
			// 4の場合
			case 4:
				// クラスのインスタンスを生成して変数に代入
				Prefectures japan4 = new Prefectures("秋田県", "秋田市", 11638.0);
				// インスタンスメソッドを呼出し
				japan4.disp();
				// 改行する
				System.out.println();
				// 処理をとめる
				break;
			// 5の場合
			case 5:
				// クラスのインスタンスを生成して変数に代入
				Prefectures japan5 = new Prefectures("山形県", "山形市", 9323.0);
				// インスタンスメソッドを呼出し
				japan5.disp();
				// 改行する
				System.out.println();
				// 処理をとめる
				break;
			// 6の場合
			case 6:
				// クラスのインスタンスを生成して変数に代入
				Prefectures japan6 = new Prefectures("福島県", "福島市", 13784.0);
				// インスタンスメソッドを呼出し
				japan6.disp();
				// 改行する
				System.out.println();
				// 処理をとめる
				break;
			// 7の場合
			case 7:
				// クラスのインスタンスを生成して変数に代入
				Prefectures japan7 = new Prefectures("茨城県", "水戸市", 6097.0);
				// インスタンスメソッドを呼出し
				japan7.disp();
				// 改行する
				System.out.println();
				// 処理をとめる
				break;
			// 8の場合
			case 8:
				// クラスのインスタンスを生成して変数に代入
				Prefectures japan8 = new Prefectures("栃木県", "宇都宮市", 6408.0);
				// インスタンスメソッドを呼出し
				japan8.disp();
				// 改行する
				System.out.println();
				// 処理をとめる
				break;
			// 9の場合
			case 9:
				// クラスのインスタンスを生成して変数に代入
				Prefectures japan9 = new Prefectures("群馬県", "前橋市", 6362.0);
				// インスタンスメソッドを呼出し
				japan9.disp();
				// 改行する
				System.out.println();
				// 処理をとめる
				break;
			// 10の場合
			case 10:
				// クラスのインスタンスを生成して変数に代入
				Prefectures japan10 = new Prefectures("埼玉県", "さいたま市", 3798.0);
				// インスタンスメソッドを呼出し
				japan10.disp();
				// 改行する
				System.out.println();

			}

		}

		// スキャナーを閉じる
		scan.close();
	}

}
