package shain_standup2;

abstract public class Shain {
	
	private int kihonkyu;
	
	// ���ʂł�������������
	public void setKihonkyu(int kihonkyu){
		this.kihonkyu = kihonkyu;
	}
	public int getKihonkyu(){
		return kihonkyu;
	}
	
	public int getBonus(){
		return kihonkyu * 3;
	}
	
	// ���ꂼ��ňႤ�������e�ɂ���������
	abstract public void standup();
	abstract public int getKyuryo();
}
