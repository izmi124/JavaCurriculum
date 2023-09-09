package curriculum_B;

// 使用するクラスを宣言する
import java.util.Arrays;
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/*
		 * 入力された生徒数分の成績を管理するプログラムを作成する
		 */

		// コンソールに入力欄を作成する
		Scanner num = new Scanner(System.in);

		// メッセージ文を表示する
		System.out.print("生徒の人数を入力してください（2以上）：");
		// 入力した整数を変数studentに代入する
		int student = num.nextInt();
		// 変数iを宣言して1を代入する
		int i = 1;
		// 多次元配列pointを作成する
		int[][] point = new int[student][4];

		do {
			// メッセージ文を表示する
			System.out.print(i + "人目の『英語』の点数を入力してください ： ");
			// 入力した整数を変数enに代入する
			int en = num.nextInt();
			// メッセージ文を表示する
			System.out.print(i + "人目の『数学』の点数を入力してください ： ");
			// 入力した整数を変数mathに代入する
			int math = num.nextInt();
			// メッセージ文を表示する
			System.out.print(i + "人目の『理科』の点数を入力してください ： ");
			// 入力した整数を変数sciに代入する
			int sci = num.nextInt();
			// メッセージ文を表示する
			System.out.print(i + "人目の『社会』の点数を入力してください ： ");
			// 入力した整数を変数socに代入する
			int soc = num.nextInt();

			// enの入力値を配列pointに代入
			point[i - 1][0] = en;
			// mathの入力値を配列pointに代入
			point[i - 1][1] = math;
			// sciの入力値を配列pointに代入
			point[i - 1][2] = sci;
			// socの入力値を配列pointに代入
			point[i - 1][3] = soc;

			// iに1を足す
			i++;

			// 改行する
			System.out.println();

			// 生徒数が1より大きいかつiが生徒数以下の場合繰り返す	
		} while (student > 1 && i <= student);

		// 変数jを宣言して1を代入する
		int j = 1;

		// 生徒数分繰り返す
		for (int s = 0; s < student; s++) {
			// 配列pointの平均値を取得する
			double ave = Arrays.stream(point[s]).average().getAsDouble();
			// メッセージ文を表示する
			System.out.println(j + "人目の平均点は" + (String.format("%.2f", ave)) + "点です。");
			// jに1を足す
			j++;
		}

		// 改行する
		System.out.println();

		// 配列sobを作成
		String[] sob = { "英語", "数学", "理科", "社会" };
		// 配列aveAllを作成
		double[] aveAll = new double[4];

		// 各教科分繰り返す
		for (int a = 0; a < 4; a++) {
			// 変数sumを宣言して初期化する
			int sum = 0;
			// 生徒数分繰り返す
			for (int b = 0; b < student; b++) {
				// 1教科分の合計を取得
				sum += point[b][a];
			}
			// 変数sobAveを宣言して初期化する
			double sobAve = 0.0;
			// 合計値を生徒数で割って変数sobAveに代入する
			sobAve = sum / (double) student;
			// 配列aveAllにsovAveを小数点第3位で四捨五入して代入する
			aveAll[a] = ((double) Math.round(sobAve * 100)) / 100;
			// メッセージ文を表示する
			System.out.println(sob[a] + "の平均点は" + (String.format("%.2f", sobAve)) + "点です。");

		}

		// 配列aveAllの平均値を取得する
		double averageAll = Arrays.stream(aveAll).average().getAsDouble();
		// メッセージ文を表示する
		System.out.println("全体の平均値は" + (String.format("%.2f", averageAll)) + "点です。");

		//numを閉じる 
		num.close();

	}

}
