package shain_standup2;

public class Bucho extends Shain {
	public void standup(){
		System.out.println("部長がゆっくり立ち上がりました。");
	}
	public int getKyuryo(){
		int kihonkyu = getKihonkyu();
		return kihonkyu * 3;
	}
	

}
