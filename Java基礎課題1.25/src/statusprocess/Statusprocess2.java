package statusprocess;

// サブクラスを作成してスーパークラスを継承する
public class Statusprocess2 extends Statusprocess1{
	
	// フィールド変数を定義する
	private int atk;
	private int agi;
	private int def;
	
	// 引数ありのコンストラクタを作成する
	public Statusprocess2(int hp, int mp, int atk, int agi, int def) {
		// スーパークラスのコンストラクタを呼出して引数の値を代入する
		super(hp,mp);
		// 引数の値をフィールド変数atkに代入
		this.atk = atk;
		// 引数の値をフィールド変数agiに代入
		this.agi = agi;
		// 引数の値をフィールド変数defに代入
		this.def = def;
	}
	
	// ゲッターを作成する
	public int getAtk() {
		// フィールド変数atkに値を返す
		return atk;
	}
	
	// ゲッターを作成する
	public int getAgi() {
		// フィールド変数agiに値を返す
		return agi;
	}
	
	// ゲッターを作成する
	public int getDef() {
		// フィールド変数defに値を返す
		return def;
	}
	
	// セッターを作成する
	public void setAtk(int atk) {
		// 引数の値をフィールド変数atkに代入
		this.atk = atk;
	}
	
	// セッターを作成する
	public void setAgi(int agi) {
		// 引数の値をフィールド変数agiに代入
		this.agi = agi;
	}
	
	// セッターを作成する
	public void setDef(int def) {
		// 引数の値をフィールド変数defに代入
		this.def = def;
	}
	
	// オーバーライドする
	public void status() {
		// スーパークラスのメソッドを呼出す
		super.status();
		// サブクラスのメソッドを呼び出す
		status2();
	}
	
	// status2メソッドを作成する
	public void status2() {
		// メッセージ文をコンソールに表示
		System.out.println("攻撃力：" + atk);
		System.out.println("素早さ：" + agi);
		System.out.println("防御力：" + def);
		System.out.println();
		System.out.println("さあ冒険に出かけよう！");
	}

}
