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
			System.out.println("‚ ‚È‚½‚Í’N‚Å‚·‚©H");
		}
		
		/**
		 * ƒ|ƒŠƒ‚[‘æ‚P’e
		 * ‘Sˆõ‚ğshain‚Æ‚µ‚Äˆµ‚¤‚±‚ÆB
		 */
		shain.standup();

		/**
		 * ƒ|ƒŠƒ‚[‘æ‚Q’e
		 * ‰‰KQ‹‹—¿ŒvZ
		 */
		int kihonkyu = Integer.parseInt(args[1]);
		int Kyuryo = shain.getKyuryo(kihonkyu);
		System.out.println("„‚Ì‹‹—¿‚Í" + Kyuryo + "‰~‚Å‚·B" );
	}

}
