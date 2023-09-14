package curriculum_New_question;

//使用するクラスを宣言する
import java.util.Arrays;
import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。

	// 戻り値なしでメソッドを定義する
	static void hello(String a, int b) {
		// 引数の値でメッセージ文を表示する
		System.out.println(a + b);
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください

	// 戻り値なしでメソッドを定義する
	static void num(int num1, int num2) {
		// 引数を乗算して結果を変数mulに代入する
		int mul = num1 * num2;
		// 結果をコンソールに出力する
		System.out.println(mul);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください

	// 戻り値なしでメソッドを定義する
	static void array(int[] num3) {
		// 引数の配列を順番に取り出す
		for (int arr : num3) {
			// コンソールに出力する
			System.out.println(arr);
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。

	// 戻り値なしでメソッドを定義する
	static void num(double num4, double num5) {
		// 引数を和算して結果を変数addに代入する
		double add = num4 + num5;
		// 結果をコンソールに出力する
		System.out.println(add);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。

	// 戻り値が配列intでメソッドを定義する
	static int[] randomNum(int num6) {
		// 格納する為の配列を作成
		int[] numRandom = new int[num6];
		// 乱数を作成する
		Random rnd = new Random();
		// 引数の数字分ループする
		for (int i = 0; i < num6; i++) {
			// 1～100の間で乱数を作成する
			int num7 = rnd.nextInt(101) + 1;
			// 結果をコンソールに表示
			System.out.println(num7);
			// 生成した乱数を配列numRandomに順に代入する
			numRandom[i] = num7;
		}
		// 配列numRandomの値を戻り値として返す
		return numRandom;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。

	// 戻り値がdoubleでメソッドを定義する
	static double aveNum(int[] rndNum) {
		// 引数の配列の平均値を出して変数numAveに代入する
		double numAve = Arrays.stream(rndNum).average().getAsDouble();
		// 結果をコンソールに出力する
		System.out.println(numAve);
		// 変数numAveの値を戻り値として返す
		return numAve;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	// 戻り値なしでメソッドを定義する
	static void numBoolean(double num8) {
		// 引数の値が50以上の場合にtrueを表示
		boolean booleanNum = num8 >= 50.0;
		// 結果をコンソールに出力する
		System.out.println(booleanNum);
	}

	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください

		// helloメソッドを呼出し
		hello("Hello JavaSE ", 11);
		// numメソッドを呼出し
		num(2, 2);
		// 配列arrを作成する
		int[] arr = { 1, 2, 3, 4, 5 };
		// arrayメソッドを呼出し
		array(arr);
		// numメソッドを呼出し
		num(1.1, 1.1);
		// randomNumメソッドを呼出して配列numRndに戻り値を代入する
		int[] numRnd = randomNum(5);
		// aveNumメソッドを呼出して変数aveに戻り値を代入する
		double ave = aveNum(numRnd);
		// numBooleanメソッドを呼出し
		numBoolean(ave);
	}
}