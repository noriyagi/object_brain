package Shain_Standup;

public class Shunin implements Shain {
	public void standup(){
		System.out.println("主任が素早く立ちました");
	}

	public int getKyuryo(int kihonkyu) {
		return kihonkyu * 2 + 1;
	}
	
}
