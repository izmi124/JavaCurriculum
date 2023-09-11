package curriculum_B;

// 使用するクラスの宣言をする
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// コンソールに入力蘭を作成する
		Scanner scan = new Scanner(System.in);

		// 変数winを宣言する
		int win = 0;
		// 変数countを宣言する
		int count = 0;

		/*
		 * じゃんけんシステムを作る
		 * 正しいユーザー名が入力された場合に作動させる
		 */

		//無限ループを作成
		while (true) {
			// 変数nameを宣言し、入力内容を取得して代入
			String name = scan.nextLine();

			// ユーザー名が10文字を超えた場合
			if (name.length() > 10) {
				// エラー文を表示
				System.out.println("「名前を10文字以内で入力してください」");
				// ループを最初にもどす
				continue;
				// ユーザー名が0文字かnullの場合
			} else if (name.length() == 0 || name.isEmpty()) {
				// エラー文を表示
				System.out.println("「名前を入力してください」");
				// ループを最初にもどす
				continue;
				// 半角英数字で入力された場合	
			} else if (Pattern.matches("^[A-Za-z0-9]+$", name)) {

				// 配列hands「グー、チョキ、パー」を作成
				String[] hands = { "グー", "チョキ", "パー" };

				// winが1より小さい場合に繰り返し
				while (win < 1) {
					// ユーザー側の乱数を作成
					Random user = new Random();
					// 3までの整数を指定
					int userHand = user.nextInt(3);

					// PC側の乱数を作成
					Random pc = new Random();
					// 3までの整数を指定
					int pcHand = pc.nextInt(3);

					// あいこに場合
					if (userHand == pcHand) {
						// 登録ユーザー名を表示
						System.out.println("ユーザー名「" + name + "」を登録しました");
						// ユーザー側の手を表示
						System.out.println("nameの手は「" + hands[userHand] + "」");
						// 相手側の手を表示
						System.out.println("相手の手は「" + hands[pcHand] + "」");
						// メッセージ文を表示
						System.out.println();
						System.out.println("DRAW あいこ もう一回しましょう！");
						System.out.println();
						// countに1を足す
						count++;
						// チョキで負けた場合	
					} else if (userHand == 1 && pcHand == 0) {
						// 登録ユーザー名を表示
						System.out.println("ユーザー名「" + name + "」を登録しました");
						// ユーザー側の手を表示
						System.out.println("nameの手は「" + hands[userHand] + "」");
						// 相手側の手を表示
						System.out.println("相手の手は「" + hands[pcHand] + "」");
						// メッセージ文を表示
						System.out.println();
						System.out.println("俺の勝ち！");
						System.out.println("負けは次につながるチャンスです！");
						System.out.println("ネバーギブアップ！");
						System.out.println();
						// countに1を足す
						count++;
						// パーで負けた場合	
					} else if (userHand == 2 && pcHand == 1) {
						// 登録ユーザー名を表示
						System.out.println("ユーザー名「" + name + "」を登録しました");
						// ユーザー側の手を表示
						System.out.println("nameの手は「" + hands[userHand] + "」");
						// 相手側の手を表示
						System.out.println("相手の手は「" + hands[pcHand] + "」");
						// メッセージ文を表示
						System.out.println();
						System.out.println("俺の勝ち！");
						System.out.println("たかがじゃんけん、そう思ってないですか？");
						System.out.println("それやったら次も、俺が勝ちますよ");
						System.out.println();
						// countに1を足す
						count++;
						// グーで負けた場合	
					} else if (userHand == 0 && pcHand == 2) {
						// 登録ユーザー名を表示
						System.out.println("ユーザー名「" + name + "」を登録しました");
						// ユーザー側の手を表示
						System.out.println("nameの手は「" + hands[userHand] + "」");
						// 相手側の手を表示
						System.out.println("相手の手は「" + hands[pcHand] + "」");
						// メッセージ文を表示
						System.out.println();
						System.out.println("俺の勝ち！");
						System.out.println("なんで負けたか、明日までに考えといてください。");
						System.out.println("そしたら何かが見えてくるはずです");
						System.out.println();
						// countに1を足す
						count++;
						// 勝った場合	
					} else {
						// 登録ユーザー名を表示
						System.out.println("ユーザー名「" + name + "」を登録しました");
						// ユーザー側の手を表示
						System.out.println("nameの手は「" + hands[userHand] + "」");
						// 相手側の手を表示
						System.out.println("相手の手は「" + hands[pcHand] + "」");
						// メッセージ文を表示
						System.out.println();
						System.out.println("やるやん。");
						System.out.println("次は俺にリベンジさせて");
						System.out.println();
						// countに1を足す
						count++;
						// winに1を足す
						win++;
					}
				}

				// 勝負の合計数を表示
				System.out.println("勝つまでにかかった合計回数は" + count + "回です");

				// 変数winを初期化
				win = 0;
				// 変数countを初期化
				count = 0;
				// scanを閉じる
				scan.close();
				// ループを終了する
				break;

				// 半角英数字以外でユーザー名が入力された場合
			} else {
				// エラー文を表示
				System.out.println("「半角英数字のみで名前を入力してください」");
				// ループを最初にもどす
				continue;
			}
			
		}

	}

}
