package shain_standup2;

public class Shunin extends Shain{
	public void standup(){
		System.out.println("��C���f���������オ��܂���");
	}
	public int getKyuryo(){
		int kihonkyu = getKihonkyu();
		return kihonkyu * 2 + 1;
	}

}
