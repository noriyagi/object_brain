package shain_standup2;

public class Shunin extends Shain{
	public void standup(){
		System.out.println("主任が素早く立ち上がりました");
	}
	public int getKyuryo(){
		int kihonkyu = getKihonkyu();
		return kihonkyu * 2 + 1;
	}

}
