package curriculum_B;

// 使用するクラスを宣言する
import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		/*
		 * 残り台数が出力されるシステムを作る
		 */
		
		// コンソールに入力欄を作成する
		Scanner search = new Scanner(System.in);
		
		// 配列itemListに入力した文字列を”、”で区切って代入する
		String[] itemList = search.nextLine().split("、");
		
		// 乱数を作成する
		Random num = new Random();
		
		// 配列itemListの値を順番に取り出す
		for (String i:itemList) {
			
			// 変数iの値で処理を分岐させる
			switch(i) {
			
			// パソコンの場合
			case "パソコン":
				
				// 0～11の間で乱数を作成
				int stock1 = num.nextInt(12);
				
				// メッセージ文を表示
				System.out.println(i + "の残り台数は" + stock1 + "台です");
				
				// 処理を中断してループに戻る
				break;
				
			// 冷蔵庫の場合	
			case "冷蔵庫":
				
				// 0～11の間で乱数を作成
				int stock2 = num.nextInt(12);
				
				// メッセージ文を表示
				System.out.println(i + "の残り台数は" + stock2 + "台です");
				
				// 処理を中断してループに戻る
				break;
			
			// 扇風機の場合
			case "扇風機":
				
				// 0～11の乱数を作成
				int stock3 = num.nextInt(12);
				
				// メッセージ文を表示
				System.out.println(i + "の残り台数は" + stock3 + "台です");
				
				// 処理を中断してループに戻る
				break;
				
			// 洗濯機の場合
			case "洗濯機":
				
				// 0～11の間で乱数を作成
				int stock4 = num.nextInt(12);
				
				// メッセージ文を表示
				System.out.println(i + "の残り台数は" + stock4 + "台です");
				
				// 処理を中断してループに戻る
				break;
				
			// 加湿器の場合
			case "加湿器":
				
				// 0～11の間で乱数を作成
				int stock5 = num.nextInt(12);
				
				// メッセージ文を表示
				System.out.println(i + "の残り台数は" + stock5 + "台です");
				
				// 処理を中断してループに戻る
				break;
				
			// テレビかディスプレイの場合
			case "テレビ":
			case "ディスプレイ":
				
				// 0～11の間で乱数を作成
				int stock6 = num.nextInt(12);
				
				// メッセージ文を表示
				System.out.print(i + "の残り台数は");
				// テレビの場合とディスプレイの場合で表示内容を変える
				System.out.println(i == "テレビ" ? stock6 + "台です" : (11 - stock6) + "台です");
				
				// 処理を中断してループに戻る
				break;
			
			// それ以外の場合
			default:
				
				// メッセージ文を表示
				System.out.println("『" + i + "』は指定の商品ではありません");
				
			}
			
			// 改行する
			System.out.println();
		}
		
		// searchを閉じる
		search.close();

	}

}
