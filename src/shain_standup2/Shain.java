package shain_standup2;

abstract public class Shain {
	
	private int kihonkyu;
	
	// ‹¤’Ê‚Å‚à‚½‚¹‚½‚¢ˆ—
	public void setKihonkyu(int kihonkyu){
		this.kihonkyu = kihonkyu;
	}
	public int getKihonkyu(){
		return kihonkyu;
	}
	
	public int getBonus(){
		return kihonkyu * 3;
	}
	
	// ‚»‚ê‚¼‚ê‚Åˆá‚¤ˆ—“à—e‚É‚µ‚½‚¢‚à‚Ì
	abstract public void standup();
	abstract public int getKyuryo();
}
