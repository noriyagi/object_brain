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
			System.out.println("���Ȃ��͒N�H�H");
		}
		
		int kihonkyu = Integer.parseInt(args[1]);
		shain.setKihonkyu(kihonkyu);
		int Kyuryo = shain.getKyuryo();
		shain.standup();
		System.out.println("���̋�����" + Kyuryo + "�~�ł��B");
		System.out.println("���̃{�[�i�X��" + shain.getBonus() + "�~�ł�");
	
	}

}
