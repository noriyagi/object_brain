package shain_standup2;

abstract public class Shain {
	
	private int kihonkyu;
	
	// 共通でもたせたい処理
	public void setKihonkyu(int kihonkyu){
		this.kihonkyu = kihonkyu;
	}
	public int getKihonkyu(){
		return kihonkyu;
	}
	
	public int getBonus(){
		return kihonkyu * 3;
	}
	
	// それぞれで違う処理内容にしたいもの
	abstract public void standup();
	abstract public int getKyuryo();
}
