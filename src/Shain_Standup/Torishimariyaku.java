package shain_Standup;

public class Torishimariyaku implements Shain {
	public void standup(){
		System.out.println("取締役がかなり偉そうに立ちました");
	}

	public int getKyuryo(int kihonkyu) {
		return kihonkyu * 4 +2;
	}
}
