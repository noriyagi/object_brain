package shain_standup2;

public class Tanto extends Shain{
	public void standup(){
		System.out.println("担当が普通に起立しました");
	}
	public int getKyuryo(){
		int kihonkyu = getKihonkyu();
		return kihonkyu;
	}

}
