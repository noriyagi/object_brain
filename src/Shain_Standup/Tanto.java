package shain_Standup;

public class Tanto implements Shain {
	public void standup(){
		System.out.println("担当が普通に立ちました");
	}
	public int getKyuryo(int kihonkyu){
		return kihonkyu;
	}
}
