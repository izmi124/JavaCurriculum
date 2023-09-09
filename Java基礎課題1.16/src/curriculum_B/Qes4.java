package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("課題4");
		System.out.println();

		/*
		 * 九九を作成する
		 */

		// 変数iに1ずつ足してiが9の時まで繰り返し
		for (int i = 1; i <= 9; i++) {

			// 変数jに1ずつ足してjが9の時まで繰り返し
			for (int j = 1; j <= 9; j++) {
				// 変数resultを宣言してi*jの結果を代入
				int result = i * j;

				// i、j、resultそれぞれ0埋めする
				String num1 = String.format("%02d", i);
				String num2 = String.format("%02d", j);
				String num3 = String.format("%02d", result);

				// コンソールに出力する
				System.out.print(num1 + " * " + num2 + " = " + num3);

				// jが9じゃない場合
				if (j != 9) {
					// " || "をコンソールに出力する
					System.out.print(" || ");
				}

			}
			// ２回改行する
			System.out.println();
			System.out.println();
		}

	}

}
