package shain_Standup;

public class Bucho implements Shain {
	public void standup(){
		System.out.println("部長が偉そうに立ちました");
	}

	public int getKyuryo(int kihonkyu) {
		return kihonkyu * 3;
	}
}
