package shain_standup2;

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
		else{
			System.out.println("あなたは誰？？");
		}
		
		int kihonkyu = Integer.parseInt(args[1]);
		shain.setKihonkyu(kihonkyu);
		int Kyuryo = shain.getKyuryo();
		shain.standup();
		System.out.println("私の給料は" + Kyuryo + "円です。");
		System.out.println("私のボーナスは" + shain.getBonus() + "円です");
	
	}

}
