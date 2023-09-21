package statusprocess;

// スーパークラスを作成する
public class Statusprocess1 {
	
	// フィールド変数を定義する
	private int hp;
	private int mp;
	
	// 引数ありのコンストラクタを作成する
	public Statusprocess1(int hp,int mp) {
		// 引数の値をフィールド変数hpに代入
		this.hp = hp;
		// 引数の値をフィールド変数mpに代入
		this.mp = mp;
	}
	
	// ゲッターを作成
	public int getHp() {
		// フィールド変数hpに値を返す
		return this.hp;
	}
	
	// ゲッターを作成
	public int getMp() {
		// フィールド変数mpに値を返す
		return this.mp;
	}
	
	// セッターを作成
	public void setHp(int hp) {
		// 引数の値をフィールド変数hpに代入
		this.hp = hp;
	}
	
	// セッターを作成
	public void setMp(int mp) {
		// 引数の値をフィールド変数mpに代入
		this.mp = mp;
	}
	
	
	// statusメソッドを作成する
	public void status() {
		// メッセージ文をコンソールに表示
		System.out.println("ステータス");
		System.out.println("HP：" + hp);
		System.out.println("MP：" + mp);
	}

}
