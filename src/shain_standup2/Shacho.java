package shain_standup2;

public class Shacho {
	public static void main(String[] args){
		
		ShainFactory shainFactory = new ShainFactory();
		Shain shain = shainFactory.factory(args[0]);
		int kihonkyu = Integer.parseInt(args[1]);
		shain.setKihonkyu(kihonkyu);
		int Kyuryo = shain.getKyuryo();
		shain.standup();
		System.out.println("���̋�����" + Kyuryo + "�~�ł��B");
		System.out.println("���̃{�[�i�X��" + shain.getBonus() + "�~�ł�");
	
	}

}
