package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * 変数を宣言する 
		 */
		byte bnum;
		short snum;
		int inum;
		long lnum;
		float fnum;
		double dnum;
		char c;
		String str;
		boolean b;
		
		/*
		 * ローカル変数に初期値を入れて初期化する 
		 */
		bnum = 0;
		snum = 0;
		inum = 0;
		lnum = 0;
		fnum = 0.0f;
		dnum = 0.0;
		c = '\u0000';
		str = null;
		b = false;
		
		/*
		 * 初期化した変数に値を代入する
		 */
		bnum = 10;
		snum = 100;
		inum = 1000;
		lnum = 10000;
		fnum = 9.5f;
		dnum = 10.5;
		c = 'a';
		str = "ハロー";
		b = true;
		
		/*
		 * 作成した変数を使ってコンソール出力する
		 */
		System.out.println(bnum + snum + inum + lnum);
		System.out.println(bnum * 2);
		System.out.println(c + str + b);
		System.out.println(String.format("%.0f",bnum + snum + inum + lnum + fnum + dnum));
		System.out.println(bnum * snum * inum * lnum);
		System.out.println(dnum / snum);
		System.out.println(bnum - snum);
		
		/*
		 * 問5のプログラムを修正する
		 */
		
		// 「String num = "20";」を「int num = 20;」に修正する
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));
		
		/*
		 * ローカル変数を作成し、代入する
		 */
		
		// 変数を作成する
		String name = null;
		int age = 0;
		double height = 0.0;
		double weight = 0.0;
		String food = null;
		
		// 変数に代入する
		name = "山田太郎";
		age = 18;
		height = 170.5;
		weight = 62.2;
		food = "寿司";
		
		/*
		 * 作成した変数を使ってコンソール出力する
		 */
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "㎝です");
		System.out.println("体重は" + weight + "㎏です");
		System.out.println("好きな食べ物は" + food + "です");
		
		/*
		 * 変数を作成し、BMIをコンソール出力する
		 */
		double bmi = 0.0;
		double b100 = 0.0;
		b100 = 100.0;
		bmi = (int)weight / (((int)height  / b100) * ((int)height  / b100));
		System.out.println("BMIは" + ((Math.floor(bmi * 10)) / 10) + "です");
		
		/*
		 * 変数に再代入する
		 */
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		food = "オムライス";
		double bmi1 = 0.0;
		bmi1 = (int)weight / (((int)height  / b100) * ((int)height  / b100));
		
		/*
		 * 変数に再代入後、コンソール出力する
		 */
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "㎝です");
		System.out.println("体重は" + weight + "㎏です");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + ((Math.floor(bmi1 * 10)) / 10) + "です");
		
		/*
		 * 作成した変数を一部自己代入する
		 */
		age += 24;
		height += 168.5;
		weight += 64.2;
		double bmi2 = 0.0;
		bmi2 = weight / (((int)height  / b100) * ((int)height  / b100));
		
		/*
		 * 変数を自己代入後コンソール出力する
		 */
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "㎝です");
		System.out.println("体重は" + weight + "㎏です");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + (String.format("%.2f",bmi2)) + "です");
		
		/*
		 * 問8の変数にもどす
		 */
		age = 24;
		height = 168.5;
		weight = 64.2;
		
		/*
		 * 変数を作成して代入する
		 */
		boolean agetrue = false;
		// 25歳以上ならtrueを表示
		agetrue = age >= 25;
		
		// コンソール出力する
		System.out.println(agetrue);
		
		/*
		 * 問8の年齢・身長・体重を文字列型に型変換し、代入する
		 */
		String strage = null;
		String strhei = null;
		String strwei = null;
		strage = String.valueOf(age);
		strhei = String.valueOf(height);
		strwei = String.valueOf(weight);
		
		// コンソール出力する
		System.out.print(strage);
		System.out.print(strhei);
		System.out.println(strwei);
		
		/*
		 * 問11で型変換した年齢・身長を整数型に変換し、代入する
		 */
		int intage = 0;
		intage = Integer.parseInt(strage);
		double inthei = 0.0;
		inthei = Double.parseDouble(strhei);
		
		// 身長は整数に変換し、コンソール出力する
		System.out.println(intage);
		System.out.println((int)inthei);
		
		/*
		 * 変数を作成して代入する
		 */
		boolean ageheiTrue = false;
		ageheiTrue = intage == 25 || (int)inthei >= 160;
		
		// コンソール出力する
		System.out.println(ageheiTrue);
		
	}

}
