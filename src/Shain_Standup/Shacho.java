package shain_Standup;

public class Shacho {
	public static void main(String[] args){
		Shain shain = null;
		
		if(args[0].equals("Tanto")){
			shain = new Tanto();
		}
		else if(args[0].equals("Shunin")){
			shain = new Shunin();
		}
		else if(args[0].equals("Bucho")){
			shain = new Bucho();
		}
		else if(args[0].equals("Torishimariyaku")){
			shain = new Torishimariyaku();
		}
		else{
			System.out.println("あなたは誰ですか？");
		}
		
		/**
		 * ポリモー第１弾
		 * 全員をshainとして扱うこと。
		 */
		shain.standup();

		/**
		 * ポリモー第２弾
		 * 演習＿給料計算
		 */
		int kihonkyu = Integer.parseInt(args[1]);
		int Kyuryo = shain.getKyuryo(kihonkyu);
		System.out.println("私の給料は" + Kyuryo + "円です。" );
	}

}
