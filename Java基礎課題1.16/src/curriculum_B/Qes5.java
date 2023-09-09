package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("課題5");
		System.out.println();

		/*
		 * 九九を作成する
		 */

		// 変数iに1ずつ足してiが9の時まで繰り返し
		for (int i = 1; i <= 9; i++) {

			// 変数jに1ずつ足してjが20の時まで繰り返し
			for (int j = 1; j <= 20; j++) {
				// 変数resultを宣言してi*jの結果を代入
				int result = i * j;

				// i、j、resultそれぞれ0埋めする
				String num1 = String.format("%03d", i);
				String num2 = String.format("%03d", j);
				String num3 = String.format("%03d", result);

				// コンソールに出力する
				System.out.print(num2 + " * " + num1 + " = " + num3);

				// jが20じゃない場合
				if (j != 20) {
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
